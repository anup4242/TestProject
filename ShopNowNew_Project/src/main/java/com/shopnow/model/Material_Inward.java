package com.shopnow.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Material_Inward
{
	@Id
	private int mrno;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pid")
	private Products pr;
	private int mrate;
	private LocalDate mdate;
	private String sname;
	private int mquan;
	
	public Material_Inward() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Material_Inward(int mrno, Products pr, int mrate, LocalDate mdate, String sname, int mquan) {
		super();
		this.mrno = mrno;
		this.pr = pr;
		this.mrate = mrate;
		this.mdate = mdate;
		this.sname = sname;
		this.mquan = mquan;
	}

	public int getMrno() {
		return mrno;
	}

	public void setMrno(int mrno) {
		this.mrno = mrno;
	}

	public Products getPr() {
		return pr;
	}

	public void setPr(Products pr) {
		this.pr = pr;
	}

	public int getMrate() {
		return mrate;
	}

	public void setMrate(int mrate) {
		this.mrate = mrate;
	}

	public LocalDate getMdate() {
		return mdate;
	}

	public void setMdate(LocalDate mdate) {
		this.mdate = mdate;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMquan() {
		return mquan;
	}

	public void setMquan(int mquan) {
		this.mquan = mquan;
	}

	@Override
	public String toString() {
		return "Material_Inward [mrno=" + mrno + ", pr=" + pr + ", mrate=" + mrate + ", mdate=" + mdate + ", sname="
				+ sname + ", mquan=" + mquan + "]";
	}
	
	
	
	
	
	
	
}

