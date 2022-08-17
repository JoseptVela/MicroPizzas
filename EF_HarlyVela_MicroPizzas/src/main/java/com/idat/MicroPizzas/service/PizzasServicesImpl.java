package com.idat.MicroPizzas.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.MicroPizzas.entity.Pizzas;
import com.idat.MicroPizzas.repository.DetalleClientesRepository;
import com.idat.MicroPizzas.repository.DetallePizzeriaRepository;
import com.idat.MicroPizzas.repository.PizzasRepository;

public class PizzasServicesImpl implements PizzasService{
	
	@Autowired
	private PizzasRepository repositoryAula;
	
	@Autowired
	private DetalleClientesRepository repositoryDetalleCliente;
	
	@Autowired
	private DetallePizzeriaRepository repositoryDetallePizzeria;

	@Override
	public void guardarPizza(Pizzas pizzas) {
		repositoryAula.save(pizzas);
	}

	@Override
	public void asignarClientePizza() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void asignarPizzeriaPizza() {
		// TODO Auto-generated method stub
		
	}

}
