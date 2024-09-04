package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_details1")
public class SwiggyOrders
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long orderId;
    @Column
    private String orderStatus;
    @Column
    private Double amount;
    @Column
    private String email;
    @Column
    private String city;

    // Getters and setters
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long string) {
        this.orderId = string;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
