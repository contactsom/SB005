package com.simplilearn.mapping;

import java.util.Date;
import java.util.Set;

public class Customer {

	private int cid;
	private String cname;
	private String cemail;
	private Date dob;
	private Long phone;
	
	public Customer() {
	}
	
	public Customer(String cname, String cemail, Date dob, Long phone) {
		super();
		this.cname = cname;
		this.cemail = cemail;
		this.dob = dob;
		this.phone = phone;
	}
	public Customer(int cid, String cname, String cemail, Date dob, Long phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemail = cemail;
		this.dob = dob;
		this.phone = phone;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", dob=" + dob + ", phone=" + phone
				+ "]";
	}
	
}
