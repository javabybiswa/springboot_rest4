package com.swiggy.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SwiggyOrders;
import com.swiggy.order.repository.OrderRepository;
import com.swiggy.order.request.OrderRequest;

@Service
public class OrderService {
 
	@Autowired
	OrderRepository repository;
	
	
	public String createOrder(OrderRequest request) {
	
		SwiggyOrders order=new SwiggyOrders();
		
		order.setOrderId(request.getOrderId());
		order.setEmail(request.getEmailId());
		order.setOrderStatus(request.getOrderstatus());
		order.setCity(request.getCity());
		order.setAmount(request.getAmount());
		
		repository.save(order);
		
		  return "order created successfully";
	}
	
}
