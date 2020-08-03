package com.rohan.springdi.serviceImpls;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rohan.springdi.services.GreetingService;

@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hola Mundo - ES";
	}

}
