package com.simplilearn.mapping;

import java.util.Set;

public class Account {

	private int accno;
	private String  accounttype;
	private Double balance;
	
	Set<Customer> customer; /*Many to Many Mapping*/
	
	public Account() {
	}
	
	public Account(String accounttype, Double balance) {
		super();
		this.accounttype = accounttype;
		this.balance = balance;
	}
	
	public Account(String accounttype, Double balance, Set<Customer> customer) {
		super();
		this.accounttype = accounttype;
		this.balance = balance;
		this.customer = customer;
	}

	public Account(int accno, String accounttype, Double balance, Set<Customer> customer) {
		super();
		this.accno = accno;
		this.accounttype = accounttype;
		this.balance = balance;
		this.customer = customer;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", accounttype=" + accounttype + ", balance=" + balance + ", customer="
				+ customer + "]";
	}
	
}
