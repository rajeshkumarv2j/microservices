package com.myapp.spring.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("Orders")
public class Order {
	@Id
	private Long id;
	private String name;
	private Integer quantity;
	private OrderStatus status;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(Long id, String name, Integer quantity, OrderStatus status) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", quantity=" + quantity + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, quantity, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(quantity, other.quantity) && status == other.status;
	}
	
}
