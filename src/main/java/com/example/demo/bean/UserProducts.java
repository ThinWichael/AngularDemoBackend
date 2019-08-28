package com.example.demo.bean;

public class UserProducts {
	String user;
	String currency; // NTD USD JYP
	Products products;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public UserProducts() {
		super();
		this.currency = "NTD";
	}
	
	public UserProducts(String user, String currency, Products products) {
		super();
		this.user = user;
		this.currency = currency;
		this.products = products;
	}

}
