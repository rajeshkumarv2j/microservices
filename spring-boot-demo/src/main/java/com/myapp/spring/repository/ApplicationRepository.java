package com.myapp.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer>{
	

}
