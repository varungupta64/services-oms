package com.exclusively.oms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class Suborder {

	@Id 
	//@GeneratedValue
	@Column(name="ID")
	private long id;
	/*private int orderID;
	private int customerId;
	private double totalAmount;*/
	@Column(name="STATUS")
	private String status;
	@Column(name="SUBORDERID")
	private String suborderId;
	
	@Column(name="MOBILENUMBER")
	private Long mobileNumber;
	
	
	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	/*
	@Column(name="orderID",nullable=false)
	public int getOrderID() {
		return this.orderID;
	}
	
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	@Column(name="customerId")
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Column(name="totalAmount")
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", customerId=" + customerId + ", totalAmount=" + totalAmount + "]";
	}*/
	
	public String getSuborderId() {
		return suborderId;
	}

	public void setSuborderId(String suborderId) {
		this.suborderId = suborderId;
	}

	
}
