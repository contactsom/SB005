package com.simplilearn.mapping;

import java.util.Date;

public class Order {

	int oid;
	int ototalQty;
	Double ototalCost;
	Date orderDate;
	String ostatus;
	
	Customer customer;/*Bi Direction*/

	public Order() {
		super();
	}
	
	public Order(int ototalQty, Double ototalCost, Date orderDate, String ostatus) {
		super();
		this.ototalQty = ototalQty;
		this.ototalCost = ototalCost;
		this.orderDate = orderDate;
		this.ostatus = ostatus;
	}
	
	public Order(int ototalQty, Double ototalCost, Date orderDate, String ostatus, Customer customer) {
		super();
		this.ototalQty = ototalQty;
		this.ototalCost = ototalCost;
		this.orderDate = orderDate;
		this.ostatus = ostatus;
		this.customer = customer;
	}
	
	public Order(int oid, int ototalQty, Double ototalCost, Date orderDate, String ostatus, Customer customer) {
		super();
		this.oid = oid;
		this.ototalQty = ototalQty;
		this.ototalCost = ototalCost;
		this.orderDate = orderDate;
		this.ostatus = ostatus;
		this.customer = customer;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getOtotalQty() {
		return ototalQty;
	}

	public void setOtotalQty(int ototalQty) {
		this.ototalQty = ototalQty;
	}

	public Double getOtotalCost() {
		return ototalCost;
	}

	public void setOtotalCost(Double ototalCost) {
		this.ototalCost = ototalCost;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOstatus() {
		return ostatus;
	}

	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", ototalQty=" + ototalQty + ", ototalCost=" + ototalCost + ", orderDate="
				+ orderDate + ", ostatus=" + ostatus + ", customer=" + customer + "]";
	}
	
}
