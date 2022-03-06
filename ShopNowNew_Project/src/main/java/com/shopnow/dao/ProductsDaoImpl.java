package com.shopnow.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopnow.model.Material_Inward;
import com.shopnow.model.Products;
import com.shopnow.model.User;

@Repository
@Transactional
public class ProductsDaoImpl implements ProductsDao
{
	@Autowired
	private SessionFactory sf;

	@Override
	public List<Products> getAllProducts() 
	{
		Query<Products> q = sf.getCurrentSession().createQuery("from Products");
		
		List <Products> list = q.list();
	
		return list;
	}

	@Override
	public boolean deleteProduct(Products pr) 
	{
		sf.getCurrentSession().delete(pr);
		return true;
	}

	@Override
	public boolean addProduct(Products pr)
	{
		if(pr!=null)sf.getCurrentSession().save(pr);
		return true;
	}

	@Override
	public boolean editProduct(Products pr) 
	{
		sf.getCurrentSession().saveOrUpdate(pr);
		return true;
	}

	@Override
	public Products getProductById(int pid)
	{
		return sf.getCurrentSession().get(Products.class, pid);
	}

	
	//
	//Stock
	//
	
	
//	@Override
//	public List<Products> getAllStock() {
//		
//		Query <Products> q= sf.getCurrentSession().createQuery("from Products");
//				
//		List<Products> list= q.list();
//		
//		return list ;
//	}

	

	
	
	
	///
	///Material Inward
	///
	
	
	@Override
	public boolean inwardMaterial(Material_Inward mi)
	{
		if(mi!=null)sf.getCurrentSession().save(mi);
		return true;
	}

	@Override
	public boolean addMaterial(int pid, int q)
	{
		
		String que = "update Products set availquan=availquan+:x where pid=:y";
		
		Query query= sf.getCurrentSession().createQuery(que);
		
		query.setParameter("x", q);
		query.setParameter("y", pid);
		
		int r = query.executeUpdate();
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+r);
		
	
				
//		Products pr =sf.getCurrentSession().find(Products.class, pid);
//		pr.setAvailquan(pr.getAvailquan()+q);
//		sf.getCurrentSession().saveOrUpdate(pr);
		
		return true;
	}

	

	

//	
	
	
	
	
}
