package com.rohan.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.rohan.springdi.services.GreetingService;

@Controller
public class SetterInjectedController {

	@Qualifier("setterGreetingService")
	@Autowired
	private GreetingService greetingService;
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
