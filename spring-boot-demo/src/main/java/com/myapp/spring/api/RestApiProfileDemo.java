package com.myapp.spring.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiProfileDemo {
	
	@Value("${mydata.input}")
	private String data;
	
	@GetMapping("/")
	public String resource() {
		return data;
	}
}
