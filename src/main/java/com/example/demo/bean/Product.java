package com.example.demo.bean;

public class Product {
	String name;
	Price price;

	public Price getPrice() {
		return price;
	}

	public Product(String name, Price price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
