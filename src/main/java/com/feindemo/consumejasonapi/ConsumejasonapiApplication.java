package com.feindemo.consumejasonapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumejasonapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumejasonapiApplication.class, args);
	}

}
