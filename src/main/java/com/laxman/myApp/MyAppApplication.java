package com.laxman.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {


		// create a container
		ApplicationContext context=SpringApplication.run(MyAppApplication.class, args);
		Dev obj =context.getBean(Dev.class);
		obj.build();
		ApplicationContext context=SpringApplication.run(MyAppApplication.class, args);
		Dev obj =context.getBean(Dev.class);
		obj.build();
	}
g
}
