package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable int id) {
		System.out.println("request recived for id " + id);
		return productService.getProductById(id);
	}
	
	@GetMapping("/product/")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}
	
	@PostMapping("/product/")
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

}
