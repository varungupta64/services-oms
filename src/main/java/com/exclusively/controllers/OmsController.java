package com.exclusively.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exclusively.entities.Order;
import com.exclusively.repositories.OrderRepository;

/**
 * Home page controller.
 * 
 * @author Anshul Chauhan
 */
@RestController
public class OmsController {

	@Autowired
	OrderRepository orderRepository;

	@RequestMapping("/")
	public @ResponseBody String home() {
		return "Oms service home page";
	}

	@RequestMapping("/orders/{orderNo}")
	public Order byNumber(@PathVariable("orderNo") Long orderNo) {
		return orderRepository.findOne(orderNo);
	}
}
