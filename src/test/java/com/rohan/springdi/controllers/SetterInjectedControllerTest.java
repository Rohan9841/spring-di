package com.rohan.springdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rohan.springdi.serviceImpls.GreetingServiceImpl;

class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
