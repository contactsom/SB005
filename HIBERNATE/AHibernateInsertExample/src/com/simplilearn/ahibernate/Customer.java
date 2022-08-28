package com.simplilearn.ahibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_INFO")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private long phone;
	
	@Column(name="city")
	private String city;
	
	@Column(name="bal")
	private double bal;

	public Customer() {
		super();
	}
	
	public Customer(String name, String email, long phone, String city, double bal) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}
	
	public Customer(int cid, String name, String email, long phone, String city, double bal) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ ", bal=" + bal + "]";
	}
	
	
}
