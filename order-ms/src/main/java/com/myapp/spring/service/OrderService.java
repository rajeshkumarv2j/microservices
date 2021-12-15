package com.myapp.spring.service;

import org.springframework.stereotype.Service;

import com.myapp.spring.model.Order;
import com.myapp.spring.repo.OrderRepository;

import reactor.core.publisher.Flux;

@Service
public class OrderService {

	
	private final OrderRepository orderRepository;

	public OrderService( OrderRepository orderRepository) {
		
		this.orderRepository = orderRepository;
	}

	public Flux<Order> getAllOrders() {
		return orderRepository.findAll();
	}

//	

}