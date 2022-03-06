package com.shopnow.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopnow.model.Role;

@Repository
@Transactional
public class RoleDaoImpl 
{

	@Autowired
	private SessionFactory sf;
	
	public Role getByRoleId(int id)
	{
		return sf.getCurrentSession().find(Role.class, id);
	}
	
}
