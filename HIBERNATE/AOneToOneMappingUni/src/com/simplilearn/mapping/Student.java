package com.simplilearn.mapping;

import javax.persistence.*;

@Entity
@Table(name = "A_STUDENT_DATA")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STUDENT_ID")
	int sid;
	
	@Column(name = "STUDENT_NAME")
	String sname;
	
	@Column(name = "STUDENT_EMAIL")
	String semail;
	
	@Column(name = "STUDENT_PHONE")
	String phone;
	
	@OneToOne()
	@JoinColumn(name="aid")
	Address address; /* One to one mapping */
	/*I want to make a relationship from Student to Address*/
	/*One Student have only one address*/
	
	public Student() {
	}
	
	public Student(String sname, String semail, String phone, Address address) {
		super();
		this.sname = sname;
		this.semail = semail;
		this.phone = phone;
		this.address = address;
	}

	public Student(int sid, String sname, String semail, String phone, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.phone = phone;
		this.address = address;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getSemail() {
		return semail;
	}


	public void setSemail(String semail) {
		this.semail = semail;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", phone=" + phone + ", address="
				+ address + "]";
	}

}
