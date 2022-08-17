package com.idat.MicroPizzas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EfHarlyVelaMicroPizzasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfHarlyVelaMicroPizzasApplication.class, args);
	}

}
