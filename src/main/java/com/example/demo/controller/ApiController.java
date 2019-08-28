package com.example.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.UserProducts;
import com.example.demo.service.ProductService;

@CrossOrigin(origins = "http://127.0.0.1:9090", maxAge = 3600)
@RestController
@RequestMapping("")
public class ApiController {

	@Autowired
	ProductService productService;
	
	private Logger logger = LoggerFactory.getLogger(ApiController.class);
	
	@RequestMapping(value = "/getProduct", method = RequestMethod.POST , produces = "application/json")
	public UserProducts getUserProducts(@RequestParam Map<String,String> allParams, HttpServletRequest req, HttpServletResponse res) {
		
		String username = allParams.get("username");
		
		logger.info("getUserProducts : " + username);
		
		UserProducts userProducts = this.productService.getUserProduct(username);
		
		return userProducts;
	}
	
	@RequestMapping(value = "/getProduct", method = RequestMethod.GET , produces = "application/json")
	public UserProducts getUserProducts( HttpServletRequest req, HttpServletResponse res) {
		
		logger.info("getUserProducts : default ");
		
		UserProducts userProducts = this.productService.getDefaultUserProduct();
		
		return userProducts;
	}
	
}
