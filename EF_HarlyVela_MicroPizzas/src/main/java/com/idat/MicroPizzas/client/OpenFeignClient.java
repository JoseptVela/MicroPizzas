package com.idat.MicroPizzas.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="idat-cliente", url="localhost:8080")
public interface OpenFeignClient {
	
	

}
