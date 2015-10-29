package com.exclusively.oms.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.exclusively.oms.entities.Suborder;
import com.exclusively.oms.service.SuborderService;

@RestController
public class SuborderController {

	private String currentStatus, finalStatus,status;
	
	@Autowired
	private SuborderService suborderservice;

	@RequestMapping(value = "/orders/add", method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public String addOrders(@RequestBody Suborder order) {
		if(order.getSuborderId() ==  null || order.getSuborderId().isEmpty())
			return "400 BAD REQUEST";
		suborderservice.addOrders(order);
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
	public Suborder getOrderById(@PathVariable("id") Long id)
	{
		return suborderservice.listOrdersById(id);
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

	boolean isUpdatable(String currentStatus, String finalStatus) {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		map.put("StateA", new ArrayList<String>(Arrays.asList("StateB", "StateC", "StateD")));
		map.put("StateB", new ArrayList<String>(Arrays.asList("StateC", "StateD")));
		map.put("StateC", new ArrayList<String>(Arrays.asList("StateD")));
		map.put("StateD", new ArrayList<String>(Arrays.asList("StateD")));

		Collection<String> values = map.get(currentStatus);

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
