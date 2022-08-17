package com.idat.MicroPizzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroPizzas.entity.PizzeriaDetalle;

@Repository
public interface DetallePizzeriaRepository extends JpaRepository<PizzeriaDetalle, Integer>{

}
