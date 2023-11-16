package com.supermarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.supermarket.entity")
public class SuperMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperMarketApplication.class, args);
	}

}
