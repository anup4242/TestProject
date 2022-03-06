package com.shopnow.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_products")
public class Products 
{
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private String des;
	private int price;
	private int availquan;
	
	public Products() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int pid, String pname, String des, int price, int availquan) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.des = des;
		this.price = price;
		this.availquan = availquan;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAvailquan() {
		return availquan;
	}

	public void setAvailquan(int availquan) {
		this.availquan = availquan;
	}
	
	

	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", des=" + des + ", price=" + price + ", availquan="
				+ availquan + "]";
	}
	
	
	
}

