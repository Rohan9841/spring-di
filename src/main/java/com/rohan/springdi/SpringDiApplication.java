package com.rohan.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rohan.springdi.controllers.ConstructorInjectedController;
import com.rohan.springdi.controllers.MyController;
import com.rohan.springdi.controllers.PropertyInjectedController;
import com.rohan.springdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		
		System.out.println("------------------Prmiary Bean");
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.getGreeting());
		
		System.out.println("------------------property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
				.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------------Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
				.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
