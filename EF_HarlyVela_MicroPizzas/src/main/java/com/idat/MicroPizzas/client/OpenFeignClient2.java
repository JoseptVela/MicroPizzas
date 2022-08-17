package com.idat.MicroPizzas.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="idat-pizeria", url="localhost:8070")
public interface OpenFeignClient2 {
	
	

}
