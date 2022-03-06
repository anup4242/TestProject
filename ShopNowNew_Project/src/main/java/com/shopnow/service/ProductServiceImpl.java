package com.shopnow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopnow.dao.ProductsDao;
import com.shopnow.model.Material_Inward;
import com.shopnow.model.Products;

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductsDao pdao;
	
	@Override
	public List<Products> getAllProducts() 
	{
		return pdao.getAllProducts();
	}

	
	
	@Override
	public boolean deleteProduct(Products pr) {
		
		return pdao.deleteProduct(pr);
	}

	@Override
	public boolean addProduct(Products pr) 
	{
		pdao.addProduct(pr);
		return true;
	}

	@Override
	public boolean editProduct(Products pr) 
	{
		pdao.editProduct(pr);
		return true;
	}

	@Override
	public Products getProductById(int pid) 
	{
		return pdao.getProductById(pid);
	}

	
	
	//
	////Stock 
	//

	/*
	 * @Override public List<Products> getAllStock() {
	 * 
	 * return pdao.getAllStock(); }
	 */


	///
	///Material Inward
	///
	
	

	@Override
	public boolean inwardMaterial(Material_Inward mi)
	{
		pdao.inwardMaterial(mi);
		return true;
	}



	@Override
	public boolean addMaterial(int pid, int q)
	{
		pdao.addMaterial(pid, q);
		return false;
	}



	
}
