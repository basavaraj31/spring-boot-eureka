package com.api.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.product.dao.ProductRepository;
import com.api.product.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	// getting all Product record by using the method findaAll() of CrudRepository
	public List<Product> getAllProduct() {
		List<Product> Product = new ArrayList<Product>();
		productRepository.findAll().forEach(Product1 -> Product.add(Product1));
		return Product;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Product getProductById(int id) {
		return productRepository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Product Product) {
		productRepository.save(Product);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		productRepository.deleteById(id);
	}

	// updating a record
	public void update(Product Product, int bookid) {
		productRepository.save(Product);
	}

}
