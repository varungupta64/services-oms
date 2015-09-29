package com.exclusively.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home page controller.
 * 
 * @author Anshul Chauhan
 */
@RestController
public class OmsController {

	@RequestMapping("/")
	public @ResponseBody String home() {
		return "Oms service home page";
	}


}
