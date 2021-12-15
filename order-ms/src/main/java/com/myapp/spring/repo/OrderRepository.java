package com.myapp.spring.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Order;

@Repository
public interface OrderRepository extends ReactiveCrudRepository<Order, Long> {

}
