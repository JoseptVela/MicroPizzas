package com.idat.MicroPizzas.service;

import com.idat.MicroPizzas.entity.Pizzas;

public interface PizzasService {
	
	void guardarPizza(Pizzas pizzas);
	
	void asignarClientePizza();
	
	void asignarPizzeriaPizza();
	

}
