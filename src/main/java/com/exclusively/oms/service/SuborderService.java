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
}