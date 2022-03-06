package com.shopnow.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name = "order_info")
public class Order
{
	@Id
	@GeneratedValue
	private int orderid;
	private LocalDate date;
	
	@OneToOne
	@JoinColumn(name="userid")
	private User user;
	
	
	@OneToMany(mappedBy ="order")
	private List<Orderss_Details> orderdetails =new ArrayList<>(); ;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderid, LocalDate date, User user, List<Orderss_Details> ord) {
		super();
		this.orderid = orderid;
		this.date = date;
		this.user = user;
		this.orderdetails = ord;
	}
	
	
	
	

	public Order(User user, List<Orderss_Details> orderdetails) {
		super();
		this.user = user;
		this.orderdetails = orderdetails;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Orderss_Details> getOrd() {
		return orderdetails;
	}

	public void setOrd(List<Orderss_Details> ord) {
		this.orderdetails = ord;
	}

	@Override
	public String toString() {
		return "Orderss [orderid=" + orderid + ", date=" + date + ", user=" + user + ", ord=" + orderdetails + "]";
	}

	
	
		
	

	
	
	
	
	
	

}

