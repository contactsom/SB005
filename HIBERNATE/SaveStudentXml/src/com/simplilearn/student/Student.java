package com.simplilearn.student;

public class Student {

	 int stuid;
	 String stuName;
	 String stuEmail;
	 int phone;
	 
	 public Student() {
			
		}
	 
	 public Student(String stuName, String stuEmail, int phone) {
			super();
			this.stuName = stuName;
			this.stuEmail = stuEmail;
			this.phone = phone;
		}
	 
	public Student(int stuid, String stuName, String stuEmail, int phone) {
		super();
		this.stuid = stuid;
		this.stuName = stuName;
		this.stuEmail = stuEmail;
		this.phone = phone;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuName=" + stuName + ", stuEmail=" + stuEmail + ", phone=" + phone + "]";
	}
	 
	 
}
