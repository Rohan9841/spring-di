package com.rohan.springdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rohan.springdi.serviceImpls.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
