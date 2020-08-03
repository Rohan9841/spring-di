package com.rohan.springdi.serviceImpls;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.rohan.springdi.services.GreetingService;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello World - Primary Bean!";
	}
}
