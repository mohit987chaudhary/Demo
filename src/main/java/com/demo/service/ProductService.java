package com.demo.service;

import java.util.List;

import com.demo.entity.Product;


public interface ProductService {
	public Product getProductById(int id);
	public Product createProduct(Product product);
	public List<Product> getAllProduct();
	
}
