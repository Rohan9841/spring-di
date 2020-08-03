package com.rohan.springdi.controllers;

import org.springframework.stereotype.Controller;

import com.rohan.springdi.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}


	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
