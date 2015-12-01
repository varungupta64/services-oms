package com.exclusively.oms.controllers;

import java.math.BigDecimal;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.exclusively.oms.entities.Order;
import com.exclusively.oms.entities.Suborder;
import com.exclusively.oms.error.ErrorInfo;
import com.exclusively.oms.service.SuborderService;
import com.exclusively.unicommerce.service.ClientConfig;
import com.exclusively.unicommerce.service.SaleOrderClient;
import com.unicommerce.wsdl.SaleOrder;
import com.unicommerce.wsdl.SaleOrderItem;

@RestController
@RequestMapping("/oms")
public class SuborderController {

	private String currentStatus, finalStatus,status,response;

	@Autowired
	private SuborderService suborderservice;
	
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	@ResponseBody
	public Iterable<Suborder> getAllOrders() {
		return suborderservice.listOrders();
	}

	@RequestMapping(value="/orders/{id}",method = RequestMethod.GET)
	@ResponseBody
	public Suborder getOrderById(@PathVariable("id") String suborderId)
	{
		return suborderservice.listOrdersById(suborderId);
	}

	@RequestMapping(value="/orders/mobile/{id}",method = RequestMethod.GET)
	@ResponseBody
	public List<Suborder> getOrderByMobileNumber(@PathVariable("id") Long id)
	{
		return suborderservice.listOrdersByMobileNumber(id);
	}

	@RequestMapping(value = "/orders/update", method = RequestMethod.POST)
	@ResponseBody
	public String UpdateOrders(@RequestBody Suborder order) {
		System.out.print("In Update");
		System.out.println(order.getStatus());
		currentStatus = getCurrentStatus(order);
		finalStatus = order.getStatus();
		boolean isupdatable = isUpdatable(currentStatus, finalStatus);
		if (isupdatable) {
			this.suborderservice.updateOrders(order);
			this.suborderservice.addSuborderToHistory(order);
			return new ResponseEntity(HttpStatus.OK).getStatusCode().toString();
		} else
			return new ResponseEntity(HttpStatus.CREATED).getStatusCode().toString()+" Cannot Change Status to :"+finalStatus;

	}

	@RequestMapping(value = "/orders/save", method = RequestMethod.POST)
	@ResponseBody
	public String saveOrders(@RequestBody Order order) 
	{	
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ClientConfig.class);
		ctx.refresh();
		SaleOrderClient saleorderclient = ctx.getBean(SaleOrderClient.class);
		
		SaleOrder.SaleOrderItems SOI = new SaleOrder.SaleOrderItems();
		
		for (Suborder suborder : order.getSuborders())
		{
			suborderservice.addOrders(suborder);
			suborderservice.addSuborderToHistory(suborder);
			SaleOrderItem saleorderitem = setSaleOrderItems(suborder);
			SOI.getSaleOrderItem().add(saleorderitem);
		}
		try 
		{
			saleorderclient.createSaleOrder(order, SOI);
		}
		catch (KeyManagementException | NoSuchAlgorithmException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.BAD_REQUEST).getStatusCode().toString();
		}
		
		return new ResponseEntity(HttpStatus.CREATED).getStatusCode().toString();
	}
	
	private SaleOrderItem setSaleOrderItems(Suborder suborder) {
		// TODO Auto-generated method stub
		SaleOrderItem saleorderitem = new SaleOrderItem();
		saleorderitem.setCode(String.valueOf(suborder.getSuborderId()));
		saleorderitem.setItemSKU(suborder.getItemsku());
		saleorderitem.setShippingMethodCode("STD");
		saleorderitem.setTotalPrice(BigDecimal.valueOf(suborder.getSubtotal()+suborder.getEmiCharges()+suborder.getShippingCharges()));
		saleorderitem.setSellingPrice(BigDecimal.valueOf(suborder.getSubtotal()));
		saleorderitem.setDiscount(BigDecimal.valueOf(suborder.getGiftCardAmountUsed()));		

		return saleorderitem;
		
	}

	boolean isUpdatable(String currentStatus, String finalStatus) {
		/*	HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		map.put("StateA", new ArrayList<String>(Arrays.asList("StateB", "StateC", "StateD")));
		map.put("StateB", new ArrayList<String>(Arrays.asList("StateC", "StateD")));
		map.put("StateC", new ArrayList<String>(Arrays.asList("StateD")));
		map.put("StateD", new ArrayList<String>(Arrays.asList("StateD")));*/

		
		
		Map<String, Set<String>> Map = new HashMap<String, Set<String>>();
		
		Set<String> keyStart = new HashSet<String>();
		keyStart.add("CRD");
		keyStart.add("CLD");
		Map.put("STR", keyStart);

		Set<String> keySetOrderCreated = new HashSet<String>();
		keySetOrderCreated.add("WFP");
		keySetOrderCreated.add("CLD");
		Map.put("CRD", keySetOrderCreated);

		Set<String> keyPaymentPending = new HashSet<String>();
		keyPaymentPending.add("PPR");
		keyPaymentPending.add("PVF");
		keyPaymentPending.add("CLD");
		Map.put("WFP", keyPaymentPending);

		Set<String> keyPaymentProcessing = new HashSet<String>();
		keyPaymentProcessing.add("PRE");
		keyPaymentProcessing.add("PCO");
		keyPaymentProcessing.add("CLD");
		Map.put("PPR", keyPaymentProcessing);

		Set<String> keyVerificationPending = new HashSet<String>();
		keyVerificationPending.add("CCO");
		keyVerificationPending.add("CRE");
		Map.put("PVF", keyVerificationPending);

		Set<String> keyCODRejected = new HashSet<String>();
		keyCODRejected.add("REJ");
		Map.put("CRE", keyCODRejected);

		Set<String> keyPaymentRejected = new HashSet<String>();
		keyPaymentRejected.add("REJ");
		Map.put("PRE", keyPaymentRejected);

		Set<String> keyOrderRejected = new HashSet<String>();
		Map.put("REJ", keyOrderRejected);

		Set<String> keyCODConfirmed = new HashSet<String>();
		keyCODConfirmed.add("INI");
		Map.put("CRE", keyCODConfirmed);

		Set<String> keyPaymentConfirmed = new HashSet<String>();
		keyPaymentConfirmed.add("INI");
		keyPaymentConfirmed.add("CLD");
		Map.put("PCO", keyPaymentConfirmed);

		Set<String> keyOrderConfirmed = new HashSet<String>();
/*		keyOrderConfirmed.add("SellerPanel");
*/		keyOrderConfirmed.add("WFF");
		keyOrderConfirmed.add("CLD");
		Map.put("INI", keyOrderConfirmed);

		/*Set<String> keySellerPanel = new HashSet<String>();
		Map.put("SellerPanel", keySellerPanel);*/

		Set<String> keyOrderFulfilmentProcessing = new HashSet<String>();
		keyOrderFulfilmentProcessing.add("PKD");
		keyOrderFulfilmentProcessing.add("CLD");
		Map.put("WFF", keyOrderFulfilmentProcessing);

		Set<String> keyPacked = new HashSet<String>();
		keyPacked.add("OOS");
		keyPacked.add("CAI");
		keyPacked.add("CLD");
		Map.put("PKD", keyPacked);

		Set<String> keyOutOfStock = new HashSet<String>();
		keyOutOfStock.add("CLD");
		Map.put("OOS", keyOutOfStock);

		Set<String> keyOrderCancelled = new HashSet<String>();
		Map.put("CLD", keyOrderCancelled);

		Set<String> keyCourierAPIIntegration = new HashSet<String>();
		keyCourierAPIIntegration.add("RTO");
		keyCourierAPIIntegration.add("DEL");
		Map.put("CAI", keyCourierAPIIntegration);

		Set<String> keyRTO = new HashSet<String>();
		Map.put("RTO", keyRTO);

		Set<String> keyDelivered = new HashSet<String>();
		keyDelivered.add("RPP");
		keyDelivered.add("TER");
		keyDelivered.add("CLD");
		Map.put("DEL", keyDelivered);

		Set<String> keyReturnPickUpInitiation = new HashSet<String>();
		keyReturnPickUpInitiation.add("CAL");
		Map.put("RPP", keyReturnPickUpInitiation);

		Set<String> keyTerminate = new HashSet<String>();
		Map.put("TER", keyTerminate);
		
		Set<String> keyCourierAllocationAndReferenceNumber = new HashSet<String>();
		keyCourierAllocationAndReferenceNumber.add("PKD");
		Map.put("CAL", keyCourierAllocationAndReferenceNumber);
		
		Set<String> keyPickedUp = new HashSet<String>();
		keyPickedUp.add("RPG");
		Map.put("PKD", keyPickedUp);
		
		Set<String> keyRefundProcessing = new HashSet<String>();
		keyRefundProcessing.add("RRJ");
		keyRefundProcessing.add("RPD");
		Map.put("RPG", keyRefundProcessing);
		
		Set<String> keyRefundProcessed = new HashSet<String>();
		Map.put("RPD", keyRefundProcessed);
		
		Set<String> keyRefundRejected = new HashSet<String>();
		keyRefundRejected.add("PRT");
		Map.put("RRJ", keyRefundRejected);
		
		Set<String> keyProductReturned = new HashSet<String>();
		Map.put("PRT", keyProductReturned);
		
		Collection<String> values = Map.get(currentStatus);

		if (values.contains(finalStatus))
			return true;
		else
			return false;
	}

	public String getCurrentStatus(Suborder order) {
		status = suborderservice.getOrderStatus(order);
		return status;

	}
	
	@RequestMapping(value = "/orders/addToSuborderHistory", method = RequestMethod.POST)
	@Consumes("application/json;charset=UTF-8")
	@ResponseStatus(value = HttpStatus.OK)
	public void addOrdersToHistory(@RequestBody Suborder suborder) {
		suborderservice.addOrders(suborder);
		suborderservice.addSuborderToHistory(suborder);
	}
	
	@RequestMapping(value = "/orders/myorders/customerId/{customerId}/pageLimit/{pageLimit}/pageNumber/{pageNumber}", method = RequestMethod.GET)
	@Consumes("application/json;charset=UTF-8")
	@ResponseBody
	public List<Suborder> getMyOrders(@PathVariable Long customerId,@PathVariable int pageLimit,@PathVariable int pageNumber) {
		return suborderservice.listMyOrders(customerId,pageLimit,pageNumber);
	}
	
	@RequestMapping(value = "/orders/trackSuborder/{suborderId}", method = RequestMethod.GET)
	@Consumes("application/json;charset=UTF-8")
	@ResponseBody
	public List<Suborder> trackSuborder(@PathVariable String suborderId) {
		return suborderservice.trackSuborder(suborderId);
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(Exception.class)
	public @ResponseBody ErrorInfo handleError(HttpServletRequest req, Exception exception) {
		return new ErrorInfo(req.getRequestURL().toString(),exception);
	}
}
