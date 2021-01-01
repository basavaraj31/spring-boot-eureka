package com.api.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.product.model.Product;
import com.api.product.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/test")
	public String test() {
		return "Hello world";
	}

	@GetMapping("/product")
	private List<Product> getAllProduct() {
		return productService.getAllProduct();
	}

	@GetMapping("/product/{id}")
	private Product getProduct(@PathVariable("id") int bookid) {
		return productService.getProductById(bookid);
	}

	@DeleteMapping("/product/{id}")
	private void deleteBook(@PathVariable("id") int bookid) {
		productService.delete(bookid);
	}

	@PostMapping("/product")
	private int saveBook(@RequestBody Product Product) {
		productService.saveOrUpdate(Product);
		return Product.getId();
	}

	@PutMapping("/product")
	private Product update(@RequestBody Product Product) {
		productService.saveOrUpdate(Product);
		return Product;
	}

}
