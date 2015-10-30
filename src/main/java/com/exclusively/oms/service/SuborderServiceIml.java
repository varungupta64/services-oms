package com.exclusively.oms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exclusively.oms.entities.Suborder;
import com.exclusively.oms.repositories.SuborderRepository;

@Service("orderService")
public class SuborderServiceIml implements SuborderService{
	
	@Autowired
	private SuborderRepository suborderRepository;
	
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
	
	
}
