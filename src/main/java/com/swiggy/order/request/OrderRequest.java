package com.swiggy.order.request;

 
public class OrderRequest {
 
	private Long orderId;
	private String orderstatus;
	private double amount;
	private String emailId;
	private String city;
	
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
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
		return "OrderRequest [orderId=" + orderId + ", orderstatus=" + orderstatus + ", amount=" + amount + ", emailId="
				+ emailId + ", city=" + city + "]";
	}
	
	
	
}
