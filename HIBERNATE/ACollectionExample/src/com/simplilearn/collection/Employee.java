package com.simplilearn.collection;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="AEMPLOYEE_DETAILS")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID")
	private int empid;
	
	@Column(name="EMPLOYEE_NAME")
	private String empname;
	
	@Column(name="EMPLOYEE_DOB")
	private String empdob;
	
	@Column(name="EMPLOYEE_QUALIFICATION")
	private String empqulification;
	
	@CollectionOfElements
	@JoinTable(name = "AEMPLOYEE_COURSE", joinColumns = @JoinColumn(name="empid"))
	@IndexColumn(name="idx")
	@Column(name="COURSE")
	private String[] empcourse;
	
	
	@CollectionOfElements
	@JoinTable(name = "AEMPLOYEE_EMAILS", joinColumns = @JoinColumn(name="empid"))
	@IndexColumn(name="idx")
	@Column(name="EMAILS")
	private List<String> empemails;
	
	
	@CollectionOfElements
	@JoinTable(name = "AEMPLOYEE_MARKS", joinColumns = @JoinColumn(name="empid"))
	@Column(name="MARKS")
	private List<Integer> empmarks;
	
	@CollectionOfElements
	@JoinTable(name = "AEMPLOYEE_PHONE", joinColumns = @JoinColumn(name="empid"))
	@Column(name="PHONE")
	private Set<Long> empphone;
	
	
	@CollectionOfElements
	@JoinTable(name = "AEMPLOYEE_REFERANCE", joinColumns = @JoinColumn(name="empid"))
	@Column(name="REF_PHONE")
	private Map<String,Long> empreferance;

	public Employee() {
		super();
	}
	
	public Employee(String empname, String empdob, String empqulification, String[] empcourse,
			List<String> empemails, List<Integer> empmarks, Set<Long> empphone, Map<String, Long> empreferance) {
		super();
		this.empname = empname;
		this.empdob = empdob;
		this.empqulification = empqulification;
		this.empcourse = empcourse;
		this.empemails = empemails;
		this.empmarks = empmarks;
		this.empphone = empphone;
		this.empreferance = empreferance;
	}
	
	public Employee(int empid, String empname, String empdob, String empqulification, String[] empcourse,
			List<String> empemails, List<Integer> empmarks, Set<Long> empphone, Map<String, Long> empreferance) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdob = empdob;
		this.empqulification = empqulification;
		this.empcourse = empcourse;
		this.empemails = empemails;
		this.empmarks = empmarks;
		this.empphone = empphone;
		this.empreferance = empreferance;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdob() {
		return empdob;
	}

	public void setEmpdob(String empdob) {
		this.empdob = empdob;
	}

	public String getEmpqulification() {
		return empqulification;
	}

	public void setEmpqulification(String empqulification) {
		this.empqulification = empqulification;
	}

	public String[] getEmpcourse() {
		return empcourse;
	}

	public void setEmpcourse(String[] empcourse) {
		this.empcourse = empcourse;
	}

	public List<String> getEmpemails() {
		return empemails;
	}

	public void setEmpemails(List<String> empemails) {
		this.empemails = empemails;
	}

	public List<Integer> getEmpmarks() {
		return empmarks;
	}

	public void setEmpmarks(List<Integer> empmarks) {
		this.empmarks = empmarks;
	}

	public Set<Long> getEmpphone() {
		return empphone;
	}

	public void setEmpphone(Set<Long> empphone) {
		this.empphone = empphone;
	}

	public Map<String, Long> getEmpreferance() {
		return empreferance;
	}

	public void setEmpreferance(Map<String, Long> empreferance) {
		this.empreferance = empreferance;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdob=" + empdob + ", empqulification="
				+ empqulification + ", empcourse=" + Arrays.toString(empcourse) + ", empemails=" + empemails
				+ ", empmarks=" + empmarks + ", empphone=" + empphone + ", empreferance=" + empreferance + "]";
	}
	
	
}
