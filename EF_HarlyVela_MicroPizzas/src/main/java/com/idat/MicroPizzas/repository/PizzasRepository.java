package com.idat.MicroPizzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroPizzas.entity.Pizzas;

@Repository
public interface PizzasRepository extends JpaRepository<Pizzas, Integer>{

}
