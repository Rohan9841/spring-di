package com.rohan.springdi.serviceImpls;

import org.springframework.stereotype.Service;

import com.rohan.springdi.services.GreetingService;

@Service
public class ConstructorGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello World - Constructor!";
	}

}
