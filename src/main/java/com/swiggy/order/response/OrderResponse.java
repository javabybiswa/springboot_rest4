package com.swiggy.order.response;

public class OrderResponse {
	
	
	private String orderId;
	private String orderstatus;
	private double amount;
	private String emailId;
	private String city;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "OrderResponse [orderId=" + orderId + ", orderstatus=" + orderstatus + ", amount=" + amount
				+ ", emailId=" + emailId + ", city=" + city + "]";
	}
	public OrderResponse(String orderId, String orderstatus, double amount, String emailId, String city) {
		super();
		this.orderId = orderId;
		this.orderstatus = orderstatus;
		this.amount = amount;
		this.emailId = emailId;
		this.city = city;
	}
	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
