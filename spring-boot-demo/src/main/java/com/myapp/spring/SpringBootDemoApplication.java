package com.myapp.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.myapp.spring.model.Application;
import com.myapp.spring.repository.ApplicationRepository;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ApplicationRepository applicationRepository) {
		return (args)->{
			applicationRepository.save(new Application("OraderMicroService", "Order Microservice to process service"));
			applicationRepository.save(new Application("ProductMicroService", "Product Microservice to process service"));
			applicationRepository.save(new Application("InventoryMicroService", "Inventory Microservice to process service"));
		};
	}
}
