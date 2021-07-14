package com.example.pizza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pizza.data.Pizza;

@Service

public class PizzaServiceDB implements PizzaService {

	@Override
	public Pizza getPizza(int id) {
		return null;
	}

	@Override
	public Pizza replacePizza(int id, Pizza newPizza) {
		return null;
	}

	@Override
	public void createPizza(Pizza pizza) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pizza> getAllPizzas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePizza(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
