package com.exclusively.oms.service;

import java.util.List;

import com.exclusively.oms.entities.Suborder;

public interface SuborderService {
		public void addOrders(Suborder o);
		public Iterable<Suborder> listOrders();
		public void updateOrders(Suborder o);
		public String getOrderStatus(Suborder o);
		public Suborder listOrdersById(String id);
		public List<Suborder> listOrdersByMobileNumber(Long id);
		public List<Suborder> listMyOrders(Long customerId,int pageLimit,int pageNumber);
		public void addSuborderToHistory(Suborder suborder);
		List<Suborder> trackSuborder(String suborderId);
}