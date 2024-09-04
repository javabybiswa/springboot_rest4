package com.swiggy.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.order.request.OrderRequest;
import com.swiggy.order.service.OrderService;

@RestController

public class OrderController {

	@Autowired
	OrderService orderservice;
	 
	 @PostMapping("/register")
	 public String createOrderDetails(@RequestBody OrderRequest request) {
		 
		//String response=orderservice.createOrder(request);
		return orderservice.createOrder(request);
	 }
	 
}
