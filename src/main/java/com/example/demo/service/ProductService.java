package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Price;
import com.example.demo.bean.Product;
import com.example.demo.bean.Products;
import com.example.demo.bean.UserProducts;

@Service
public class ProductService {

	Products defaultProducts;
	UserProducts defaultUserProducts;
	
	ProductService(){
		Products products = creatDefaultProduct();
		
		defaultProducts = products;
		defaultUserProducts = new UserProducts("none", "NTD", products );

	}

	public UserProducts getUserProduct(String username) {
		Price pr = new Price("120", "350", "3.99");
		Price pr2 = new Price("180", "540", "5.49");
		Product p = new Product("TokyoCusineCoupon", pr);
		Product p2 = new Product("TokyoMaxMeal", pr2);
		
		List<Product> plist = new ArrayList<Product>();
		plist.add(p);
		plist.add(p2);
		Products products = new Products(plist);
		
		UserProducts userProduct = new UserProducts( username, "JPY", products);
		return userProduct;
	}
	
	public UserProducts getDefaultUserProduct() {
		return defaultUserProducts;
	}
	
	private Products creatDefaultProduct() {
		Price pr = new Price("100", "290", "2.99");
		Price pr2 = new Price("200", "590", "5.99");
		Product p = new Product("HappyPuppyDoll", pr);
		Product p2 = new Product("SuperManFigure", pr2);
		
		List<Product> plist = new ArrayList<Product>();
		plist.add(p);
		plist.add(p2);
		Products products = new Products(plist);
		return products;
	}
	
}
