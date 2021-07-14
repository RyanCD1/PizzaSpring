package com.example.pizza.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pizza.data.Pizza;
import com.example.pizza.service.PizzaService;

@RestController

public class PizzaControl {

	private PizzaService service;

	public PizzaControl(PizzaService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String hello() {
		return "Hello, World!";
	}

	@PostMapping("/createPizza") // fancy
	public void createPizza(@RequestBody Pizza pizza) {
		this.service.createPizza(pizza);
	}

	@GetMapping("/getAllPizzas")
	public List<Pizza> getAllPizzas() {
		return this.service.getAllPizzas();
	}

	@GetMapping("/getPizza/{id}")
	public Pizza getPizza(@PathVariable int id) {
		return this.service.getPizza(id);
	}

	@PutMapping("/replacePizza/{id}")
	public Pizza replacePizza(@PathVariable int id, @RequestBody Pizza newPizza) {
		return this.service.replacePizza(id, newPizza);
	}

	@DeleteMapping("/deletePizza/{id}")
	public String deletePizza(@PathVariable int id) {
		return this.service.deletePizza(id);
	}

}
