package com.shopnow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "UserInfo")
public class User
{
	@Id
	@GeneratedValue
	private int userid;
	private String username;
	private String email;
	private String password;
	private String city;
	private String state;
	private long contactnum;
	@ManyToOne
	private Role role;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int userid, String username, String email, String password, String city, String state, long contactnum
			) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.city = city;
		this.state = state;
		this.contactnum = contactnum;
	
	}
	
	


	public User(int userid, String username, String email, String password, String city, String state, long contactnum,
			Role role) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.city = city;
		this.state = state;
		this.contactnum = contactnum;
		this.role = role;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public long getContactnum() {
		return contactnum;
	}


	public void setContactnum(long contactnum) {
		this.contactnum = contactnum;
	}


	
	

	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", city=" + city + ", state=" + state + ", contactnum=" + contactnum + ", role=" + role + "]";
	}


	
	
	

	

	
	
	
	

}
