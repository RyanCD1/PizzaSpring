package com.example.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.pizza.rest.PizzaControl;
import com.example.pizza.service.PizzaServiceList;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext beanBag = SpringApplication.run(App.class, args);
		PizzaControl controller = beanBag.getBean(PizzaControl.class);
		System.out.println(controller);

		PizzaServiceList service = beanBag.getBean(PizzaServiceList.class);
		System.out.println(service);

	}

}
