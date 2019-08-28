package com.example.demo.bean;

import java.util.List;

public class Products {

	List<Product> products;

	public Products(List<Product> products) {
		super();
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
