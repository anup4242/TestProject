package com.shopnow.service;

import java.util.List;

import com.shopnow.model.Material_Inward;
import com.shopnow.model.Products;


public interface ProductService 
{
	///
	//Product Crud method
	///
	public List<Products> getAllProducts();
	
	public boolean deleteProduct(Products pr);

	public boolean addProduct(Products pr);
	
	public boolean editProduct(Products pr);
	
	public Products getProductById(int pid);
	
	public boolean addMaterial(int pid,int q);
	
	
	//
	//Material and Stock crude
	//
	
//	public List<Products> getAllStock();
	
	public boolean inwardMaterial(Material_Inward mi);
	
}
