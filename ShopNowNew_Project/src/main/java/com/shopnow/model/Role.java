package com.shopnow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role 
{
	@Id
	private int roleid;
	private String roleName;
	
	public Role() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int roleid, String roleName) {
		super();
		this.roleid = roleid;
		this.roleName = roleName;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", roleName=" + roleName + "]";
	}
	
	
	
	

}
