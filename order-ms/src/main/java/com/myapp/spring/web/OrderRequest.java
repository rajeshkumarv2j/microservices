package com.myapp.spring.web;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class OrderRequest {

	@NotBlank(message = "The product name must be defined.")
	String name;

	@NotNull(message = "The book quantity must be defined.")
	@Min(value = 1, message = "You must order at least 1 item.")
	@Max(value = 5, message = "You cannot order more than 5 items.")
	Integer quantity;
	
	
	public OrderRequest() {
		// TODO Auto-generated constructor stub
	}


	public OrderRequest(@NotBlank(message = "The product name must be defined.") 
	String name,
			@NotNull(message = "The product quantity must be defined.") @Min(value = 1, message = "You must order at least 1 item.") @Max(value = 5, message = "You cannot order more than 5 items.") Integer quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	

}