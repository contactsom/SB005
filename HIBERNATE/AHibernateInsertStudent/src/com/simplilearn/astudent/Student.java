package com.simplilearn.astudent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_RECORDS")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="STUDENT_ID")
	private int stuid;
	
	@Column(name="STUDENT_NAME")
	private String stuname;
	
	@Column(name="STUDENT_EMAIL")
	private String stuemail;
	
	@Column(name="STUDENT_PHONE")
	private long stuphone;
	
	@Column(name="STUDENT_CITY")
	private String stucity;
	
	@Column(name="STUDENT_MARKS")
	private int stumarks;

	public Student() {
		super();
	}
	
	public Student(String stuname, String stuemail, long stuphone, String stucity, int stumarks) {
		super();
		this.stuname = stuname;
		this.stuemail = stuemail;
		this.stuphone = stuphone;
		this.stucity = stucity;
		this.stumarks = stumarks;
	}
	
	public Student(int stuid, String stuname, String stuemail, long stuphone, String stucity, int stumarks) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuemail = stuemail;
		this.stuphone = stuphone;
		this.stucity = stucity;
		this.stumarks = stumarks;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStuemail() {
		return stuemail;
	}

	public void setStuemail(String stuemail) {
		this.stuemail = stuemail;
	}

	public long getStuphone() {
		return stuphone;
	}

	public void setStuphone(long stuphone) {
		this.stuphone = stuphone;
	}

	public String getStucity() {
		return stucity;
	}

	public void setStucity(String stucity) {
		this.stucity = stucity;
	}

	public int getStumarks() {
		return stumarks;
	}

	public void setStumarks(int stumarks) {
		this.stumarks = stumarks;
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", stuemail=" + stuemail + ", stuphone=" + stuphone
				+ ", stucity=" + stucity + ", stumarks=" + stumarks + "]";
	}
	
}
