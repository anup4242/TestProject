package com.shopnow.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Orderss_Details 
{
	@Id
	@GeneratedValue
	private int transactionId;
	
	@ManyToOne
	@JoinColumn(name="orderid")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name="pid")
	private Products product;

	private int quantity;

	public Orderss_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Orderss_Details(Order order, Products product, int quantity) {
		super();
		this.order = order;
		this.product = product;
		this.quantity = quantity;
	}



	public Orderss_Details(int transactionId, Order order, Products product, int quantity) {
		super();
		this.transactionId = transactionId;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Orderss_Details [transactionId=" + transactionId + ", order=" + order + ", product=" + product + ", quantity="
				+ quantity + "]";
	}
	
	
	
}
