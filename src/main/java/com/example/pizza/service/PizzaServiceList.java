package com.example.pizza.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.pizza.data.Pizza;

@Service
@Primary

public class PizzaServiceList implements PizzaService {
	private List<Pizza> pizzas = new ArrayList<>();

	@Override
	public void createPizza(Pizza pizza) {
		System.out.println(pizza);
		this.pizzas.add(pizza);
	}

	@Override
	public List<Pizza> getAllPizzas() {
		return this.pizzas;
	}

	@Override
	public String deletePizza(int id) {
		this.pizzas.remove(id);

		return "Deleted Pizza at index: " + id;
	}

	@Override
	public Pizza getPizza(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza replacePizza(int id, Pizza newPizza) {
		// TODO Auto-generated method stub
		return null;
	}

}
