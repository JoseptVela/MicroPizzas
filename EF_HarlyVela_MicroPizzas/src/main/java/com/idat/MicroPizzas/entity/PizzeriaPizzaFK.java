package com.idat.MicroPizzas.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class PizzeriaPizzaFK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4417214286334278899L;
	
	@Column(name="id_pizzeria", nullable = false, unique = true)
	private Integer idPizzeria;
	
	@Column(name="id_pizza", nullable = false, unique = true)
	private Integer idPizza;

}
