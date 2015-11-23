package com.exclusively.oms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.exclusively.oms.entities.Order;
import com.exclusively.oms.entities.Suborder;
import com.exclusively.oms.entities.SuborderHistory;
import com.exclusively.oms.repositories.SuborderHistoryRepository;
import com.exclusively.oms.repositories.SuborderRepository;

@Service("orderService")
public class SuborderServiceIml implements SuborderService{
	
	@Autowired
	private SuborderRepository suborderRepository;
	
	@Autowired
	private SuborderHistoryRepository suborderHistoryRepository;
	
	@Override
	public void addOrders(Suborder o) {
		// TODO Auto-generated method stub
		this.suborderRepository.save(o);
	}
	@Override
	//@Transactional
	public Iterable<Suborder> listOrders() {
	//return orderDAO.listOrders();
		return suborderRepository.findAll();
	}

	@Override
	public void updateOrders(Suborder o) {
		// TODO Auto-generated method stub
		suborderRepository.updateSuborder(o.getSuborderId(),o.getStatus());
	}

	@Override
	public String getOrderStatus(Suborder o) {
		// TODO Auto-generated method stub
		return suborderRepository.findBySuborderId(o.getSuborderId()).getStatus();
		
	}

	@Override
	public Suborder listOrdersById(String id) {
		// TODO Auto-generated method stub
		return suborderRepository.findBySuborderId(id);
	}

	@Override
	public List<Suborder> listOrdersByMobileNumber(Long mobileNumber) {
		return suborderRepository.findByMobileNumber(mobileNumber);//listOrdersByMobileNumber(id);
	}
	
	/**
	 * @author varungupta01
	 */
	@Override
	public List<Suborder> listMyOrders(Long customerId) {		
		PageRequest pageRequest = new PageRequest(0, 10, Sort.Direction.DESC, "updatedAt");
		List<Suborder> suborderList = suborderRepository.findByCustomerId(customerId,pageRequest);
		//List<Suborder> suborderList = null;
		//if(null != suborderHistoryList){
			//suborderList = new ArrayList<Suborder>(suborderHistoryList.size());
			//for(SuborderHistory suborderHistory : suborderHistoryList){
				//System.out.println("Inside for loop");
				//Suborder suborder = new Suborder();//convertToSuborder(suborderHistory);
				//suborderList.add(suborder);
			//}
		//}
		return suborderList;
	}
	
	
	@Override
	public List<Suborder> trackSuborder(String suborderId) {
		PageRequest pageRequest = new PageRequest(0, 10, Sort.Direction.DESC, "updatedAt");
		List<SuborderHistory> suborderHistoryList = suborderHistoryRepository.findBySuborderId(suborderId,pageRequest);
		List<Suborder> suborderList = null;
		if(null != suborderHistoryList){
			suborderList = new ArrayList<Suborder>(suborderHistoryList.size());
			for(SuborderHistory suborderHistory : suborderHistoryList){
				suborderList.add(convertToSuborder(suborderHistory));
			}
		}
		return suborderList;
	}
	
	private Suborder convertToSuborder(SuborderHistory suborderHistory){
		Suborder suborder = new Suborder();
		Order order = new Order();
		suborder.setBillingAddressId(suborderHistory.getBillingAddressId());
		suborder.setCodAmount(suborderHistory.getCodAmount());
		suborder.setCouponCode(suborderHistory.getCouponCode());
		suborder.setCreatedAt(suborderHistory.getCreatedAt());
		suborder.setCustomerEmail(suborderHistory.getCustomerEmail());
		suborder.setCustomerId(suborderHistory.getCustomerId());
		suborder.setCustomerIsGuest(suborderHistory.getCustomerIsGuest());
		suborder.setCustomerName(suborderHistory.getCustomerName());
		suborder.setEmiCharges(suborderHistory.getEmiCharges());
		suborder.setGiftCardAmountUsed(suborderHistory.getGiftCardAmountUsed());
		suborder.setGrandTotal(suborderHistory.getGrandTotal());
		suborder.setLatitude(suborderHistory.getLatitude());
		suborder.setLongitude(suborderHistory.getLongitude());
		suborder.setMobileNumber(suborderHistory.getMobileNumber());
		
		//order.setOrderId(suborderHistory.getOrderId());
		//suborder.setOrder(order);
		
		suborder.setOrderCurrency(suborderHistory.getOrderCurrency());
		suborder.setPartPayment(suborderHistory.getPartPayment());
		suborder.setPrepaidAmount(suborderHistory.getPrepaidAmount());
		suborder.setShippingAddressId(suborderHistory.getShippingAddressId());
		suborder.setShippingCharges(suborderHistory.getShippingCharges());
		suborder.setShippingMethod(suborderHistory.getShippingMethod());
		suborder.setStatus(suborderHistory.getStatus());
		suborder.setStoreCreditsUsed(suborderHistory.getStoreCreditsUsed());
		suborder.setStoreId(suborderHistory.getStoreId());
		suborder.setSuborderId(suborderHistory.getSuborderId());
		suborder.setSubtotal(suborderHistory.getSubtotal());
		suborder.setTotalItemCount(suborderHistory.getTotalItemCount());
		suborder.setTotalPaid(suborderHistory.getTotalPaid());
		suborder.setUpdatedAt(suborderHistory.getUpdatedAt());
		suborder.setxForwardedFor(suborderHistory.getxForwardedFor());
		
		return suborder;
	}
	
	@Override
	public void addSuborderToHistory(Suborder suborder) {
		Suborder suborderNew = suborderRepository.findBySuborderId(suborder.getSuborderId());
		if(null != suborderNew){
			suborderNew.setStatus(suborder.getStatus());			
			suborder = suborderNew;
		}
		SuborderHistory suborderHistory = convertToSuborderHistory(suborder);
		suborderHistoryRepository.save(suborderHistory);
	}
	
	private SuborderHistory convertToSuborderHistory(Suborder suborder) {
		SuborderHistory suborderHistory = new SuborderHistory();
		
		//hardcoding three attributes for now
		suborderHistory.setActionType("actionType");
		suborderHistory.setValueType("valueType");
		suborderHistory.setSource("source");
		
		suborderHistory.setBillingAddressId(suborder.getBillingAddressId());
		suborderHistory.setCodAmount(suborder.getCodAmount());
		suborderHistory.setCouponCode(suborder.getCouponCode());
		suborderHistory.setCreatedAt(suborder.getCreatedAt());
		suborderHistory.setCustomerEmail(suborder.getCustomerEmail());
		suborderHistory.setCustomerId(suborder.getCustomerId());
		suborderHistory.setCustomerIsGuest(suborder.getCustomerIsGuest());
		suborderHistory.setCustomerName(suborder.getCustomerName());
		suborderHistory.setEmiCharges(suborder.getEmiCharges());
		suborderHistory.setGiftCardAmountUsed(suborder.getGiftCardAmountUsed());
		suborderHistory.setGrandTotal(suborder.getGrandTotal());
		suborderHistory.setLatitude(suborder.getLatitude());
		suborderHistory.setLongitude(suborder.getLongitude());
		suborderHistory.setMobileNumber(suborder.getMobileNumber());
		
		//if(null != suborder.getOrder()){
			//suborderHistory.setOrderId(suborder.getOrder().getOrderId());
		//}		
		suborderHistory.setOrderId(Long.parseLong(suborder.getOrderId()));
		
		suborderHistory.setOrderCurrency(suborder.getOrderCurrency());
		suborderHistory.setPartPayment(suborder.getPartPayment());
		suborderHistory.setPrepaidAmount(suborder.getPrepaidAmount());
		suborderHistory.setShippingAddressId(suborder.getShippingAddressId());
		suborderHistory.setShippingCharges(suborder.getShippingCharges());
		suborderHistory.setShippingMethod(suborder.getShippingMethod());
		suborderHistory.setStatus(suborder.getStatus());
		suborderHistory.setStoreCreditsUsed(suborder.getStoreCreditsUsed());
		suborderHistory.setStoreId(suborder.getStoreId());
		suborderHistory.setSuborderId(suborder.getSuborderId());
		suborderHistory.setSubtotal(suborder.getSubtotal());
		suborderHistory.setTotalItemCount(suborder.getTotalItemCount());
		suborderHistory.setTotalPaid(suborder.getTotalPaid());
		suborderHistory.setUpdatedAt(suborder.getUpdatedAt());
		suborderHistory.setxForwardedFor(suborder.getxForwardedFor());
		
		return suborderHistory;
	}
}
