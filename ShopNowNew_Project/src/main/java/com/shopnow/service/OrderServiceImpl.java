package com.shopnow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopnow.dao.OrderDao;
import com.shopnow.model.Order;

@Service
public class OrderServiceImpl implements OrderService 
{
	@Autowired
	private OrderDao odao;

	@Override
	public boolean insertOrder(Order order)
	{
		odao.insertOrder(order);
		return false;
	}

}
