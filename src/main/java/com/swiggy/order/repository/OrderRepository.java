package com.swiggy.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SwiggyOrders;



@Repository
public interface OrderRepository extends JpaRepository<SwiggyOrders,Long>{

}
