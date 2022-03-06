package com.shopnow.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopnow.model.Order;
import com.shopnow.model.Orderss_Details;

@Repository
@Transactional
public class OrderDaoImpl implements OrderDao
{
	@Autowired
	private SessionFactory sf;

	@Override
	public boolean insertOrder(Order order) 
	{
		sf.getCurrentSession().save(order);
		
		List<Orderss_Details> list = order.getOrd();
		
		for(Orderss_Details o :list)
		{
			sf.getCurrentSession().save(o);
		}
		
		return false;
	}

}
