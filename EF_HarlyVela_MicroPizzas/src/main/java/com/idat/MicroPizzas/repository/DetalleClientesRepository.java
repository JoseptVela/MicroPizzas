package com.idat.MicroPizzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroPizzas.entity.ClienteDetalle;

@Repository
public interface DetalleClientesRepository extends JpaRepository<ClienteDetalle, Integer>{

}
