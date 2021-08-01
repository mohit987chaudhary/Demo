package com.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.repository.ProductRepo;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductRepo productRepo;
	
	@Override
	public Product getProductById(int id) {
		return productRepo.findById(id).get();
	}
	
	@Override
	public Product createProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

}
