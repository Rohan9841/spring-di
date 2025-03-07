package com.rohan.springdi.serviceImpls;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rohan.springdi.services.GreetingService;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello there - EN";
	}

	
}
