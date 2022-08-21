package com.simplilearn.concurrency;

import java.sql.*;

import com.simplilearn.utill.JDBCUtil;

public class JdbcConcurrency {

	public static void main(String[] args) {
		try {
			Connection con=JDBCUtil.getMySqlConnection();
			//Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);/**/
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);/**/
			ResultSet rs= stmt.executeQuery("SELECT * FROM STUDENT");
			System.out.println("******* Before Update *******");
			while (rs.next()) {
				System.out.println(
						"ID  - "+rs.getInt("STU_ID")+" "+
						"AGE - "+rs.getInt("STU_AGE")+" "+
						"Fname - "+rs.getString("STU_FName")+" "+
						"LName - "+rs.getString("STU_LName")
						);
			}
			rs.beforeFirst();
			while (rs.next()) {
				int age=rs.getInt("STU_AGE")+20; /*Increasing all the student age by 20 Years*/
				rs.updateInt("STU_AGE", age);
				rs.updateRow();
				
			}
			rs.beforeFirst();
			System.out.println("******* After Update *******");
			while (rs.next()) {
				System.out.println(
						"ID  - "+rs.getInt("STU_ID")+" "+
						"AGE - "+rs.getInt("STU_AGE")+" "+
						"Fname - "+rs.getString("STU_FName")+" "+
						"LName - "+rs.getString("STU_LName")
						);
			}
			JDBCUtil.cleanup(stmt, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
