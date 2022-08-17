package com.idat.MicroPizzas.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_cli_pizz")
public class ClienteDetalle {
	
	@Id
	private ClientePizzaFK fk = new ClientePizzaFK();

	public ClientePizzaFK getFk() {
		return fk;
	}

	public void setFk(ClientePizzaFK fk) {
		this.fk = fk;
	}

}
