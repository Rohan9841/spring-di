package com.rohan.springdi.serviceImpls;

import com.rohan.springdi.services.GreetingService;

public class GreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello World!";
	}

}
