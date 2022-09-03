package com.simplilearn.mapping;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name ="A_BI_CUSTOMER_DATA")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CUSTOMER_ID")
	int cid;
	
	@Column(name = "CUSTOMER_NAME")
	String cname;
	
	@Column(name = "CUSTOMER_EMAIL")
	String cemail;
	
	@Column(name = "CUSTOMER_DOB")
	Date dob;
	
	@Column(name = "CUSTOMER_PHONE")
	Long phone;
	
	@OneToMany(mappedBy = "customer")
	Set<Order> order; /*One Customer have many Order*/

	public Customer() {
	}
	
	public Customer(String cname, String cemail, Date dob, Long phone) {
		super();
		this.cname = cname;
		this.cemail = cemail;
		this.dob = dob;
		this.phone = phone;
	}
	
	public Customer(String cname, String cemail, Date dob, Long phone, Set<Order> order) {
		super();
		this.cname = cname;
		this.cemail = cemail;
		this.dob = dob;
		this.phone = phone;
		this.order = order;
	}
	
	public Customer(int cid, String cname, String cemail, Date dob, Long phone, Set<Order> order) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemail = cemail;
		this.dob = dob;
		this.phone = phone;
		this.order = order;
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

	public Set<Order> getOrder() {
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", dob=" + dob + ", phone=" + phone
				+ ", order=" + order + "]";
	}
	
}
