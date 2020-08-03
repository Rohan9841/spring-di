package com.rohan.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rohan.springdi.controllers.MyController;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.sayHello()); 
	}

}
