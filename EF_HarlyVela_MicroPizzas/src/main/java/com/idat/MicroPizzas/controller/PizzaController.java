package com.idat.MicroPizzas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.MicroPizzas.entity.Pizzas;
import com.idat.MicroPizzas.service.PizzasService;


@RestController
@RequestMapping("/api/pizzas/v1")
public class PizzaController {
	
	@Autowired
	private PizzasService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Pizzas pizzas) {
		service.guardarPizza(pizzas);
	}
	
	@GetMapping("/asignar1")
	public @ResponseBody void asignarClientePizza() {
		service.asignarClientePizza();
	}
	
	@GetMapping("/asignar2")
	public @ResponseBody void asignarPizzeriPizza() {
		service.asignarPizzeriaPizza();
	}

}
