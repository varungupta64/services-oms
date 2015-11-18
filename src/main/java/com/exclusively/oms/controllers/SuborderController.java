package com.exclusively.oms.controllers;

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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
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
import com.exclusively.oms.service.SuborderService;
import com.exclusively.unicommerce.service.ClientConfig;
import com.exclusively.unicommerce.service.SaleOrderClient;

@RestController
public class SuborderController {

	private String currentStatus, finalStatus,status,response;

	@Autowired
	private SuborderService suborderservice;

	@RequestMapping(value = "/orders/add", method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public String addOrders(@RequestBody Suborder order) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ClientConfig.class);
		ctx.refresh();
		SaleOrderClient saleorderclient = ctx.getBean(SaleOrderClient.class);

		if(order.getSuborderId() ==  null || order.getSuborderId().isEmpty())
			return "400 BAD REQUEST";
		suborderservice.addOrders(order);
		try {
			response = saleorderclient.createSaleOrder(order);
		} catch (KeyManagementException | NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//client.pushToUnicommerce(order);
		return "Success";
	}

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
			// call update service.
			this.suborderservice.updateOrders(order);
			//enums to be inserted
			return "Order updated successfully";
		} else
			return "Sorry your order can't be updated because current status of your order is :" + currentStatus;

	}

	@RequestMapping(value = "/orders/save", method = RequestMethod.POST)
	@ResponseBody
	public List <String> saveOrders(@RequestBody Order order) 
	{	
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ClientConfig.class);
		ctx.refresh();
		SaleOrderClient saleorderclient = ctx.getBean(SaleOrderClient.class);
		List <String> request = new ArrayList<String>();
		for (Suborder suborder : order.getSuborders())
		{
			suborderservice.addOrders(suborder);
			request.add(suborder.getSuborderId().toString());
		}
		return request;
	}

	boolean isUpdatable(String currentStatus, String finalStatus) {
		/*	HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		map.put("StateA", new ArrayList<String>(Arrays.asList("StateB", "StateC", "StateD")));
		map.put("StateB", new ArrayList<String>(Arrays.asList("StateC", "StateD")));
		map.put("StateC", new ArrayList<String>(Arrays.asList("StateD")));
		map.put("StateD", new ArrayList<String>(Arrays.asList("StateD")));*/

		Map<String, Set<String>> Map = new HashMap<String, Set<String>>();

		Set<String> keyStart = new HashSet<String>();
		keyStart.add("Order Created");
		Map.put("Start", keyStart);

		Set<String> keySetOrderCreated = new HashSet<String>();
		keySetOrderCreated.add("Payment Pending");
		Map.put("Order Created", keySetOrderCreated);

		Set<String> keyPaymentPending = new HashSet<String>();
		keyPaymentPending.add("Payment Processing");
		keyPaymentPending.add("Verification Pending");
		Map.put("Payment Pending", keyPaymentPending);

		Set<String> keyPaymentProcessing = new HashSet<String>();
		keyPaymentProcessing.add("Payment Rejected");
		keyPaymentProcessing.add("Payment Processed");
		Map.put("Payment Processing", keyPaymentProcessing);

		Set<String> keyVerificationPending = new HashSet<String>();
		keyVerificationPending.add("COD Confirmed");
		keyVerificationPending.add("COD Rejected");
		Map.put("Verification Pending", keyVerificationPending);

		Set<String> keyCODRejected = new HashSet<String>();
		keyCODRejected.add("Order Rejected");
		Map.put("COD Rejected", keyCODRejected);

		Set<String> keyPaymentRejected = new HashSet<String>();
		keyPaymentRejected.add("Order Rejected");
		Map.put("Payment Rejected", keyPaymentRejected);

		Set<String> keyOrderRejected = new HashSet<String>();
		Map.put("Order Rejected", keyOrderRejected);

		Set<String> keyCODConfirmed = new HashSet<String>();
		keyCODConfirmed.add("Order Confirmed");
		Map.put("COD Confirmed", keyCODConfirmed);

		Set<String> keyPaymentConfirmed = new HashSet<String>();
		keyPaymentConfirmed.add("Order Confirmed");
		Map.put("Payment Confirmed", keyPaymentConfirmed);

		Set<String> keyOrderConfirmed = new HashSet<String>();
		keyOrderConfirmed.add("Seller Panel");
		keyOrderConfirmed.add("Order Fulfillment Processing");
		Map.put("Order Confirmed", keyOrderConfirmed);

		Set<String> keySellerPanel = new HashSet<String>();
		
		Map.put("Seller Panel", keySellerPanel);

		Set<String> keyOrderFulfilmentProcessing = new HashSet<String>();
		keyOrderFulfilmentProcessing.add("Packed");
		Map.put("Order Fulfilment Processing", keyOrderFulfilmentProcessing);

		Set<String> keyPacked = new HashSet<String>();
		keyPacked.add("Out Of Stock");
		keyPacked.add("Courier API Integration");
		Map.put("Packed", keyPacked);

		Set<String> keyOutOfStock = new HashSet<String>();
		keyOutOfStock.add("Order Cancelled");
		Map.put("Out Of Stock", keyOutOfStock);

		Set<String> keyOrderCancelled = new HashSet<String>();
		Map.put("Order Cancelled", keyOrderCancelled);

		Set<String> keyCourierAPIIntegration = new HashSet<String>();
		keyCourierAPIIntegration.add("RTO");
		keyCourierAPIIntegration.add("Delivered");
		Map.put("Courier API Integration", keyCourierAPIIntegration);

		Set<String> keyRTO = new HashSet<String>();
		Map.put("RTO", keyRTO);

		Set<String> keyDelivered = new HashSet<String>();
		keyDelivered.add("Return Leg");
		keyDelivered.add("Terminate");
		Map.put("Delivered", keyDelivered);

		Set<String> keyReturnLeg = new HashSet<String>();
		Map.put("Return Leg", keyReturnLeg);

		Set<String> keyTerminate = new HashSet<String>();
		Map.put("Terminate", keyTerminate);
		
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
}
