package com.simplilearn.statement;

import java.sql.*;

import com.simplilearn.jdbc.utill.JDBCUtil;

public class StatementExample {

	public static void main(String[] args) {
		System.out.println("****** START- StatementExample");

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			
			con=JDBCUtil.getMySqlConnection();
			stmt = con.createStatement();
			
			// 4. Prepare the Query & execute
		    rs = stmt.executeQuery("select * from Employees");
			System.out.println("4. Prepare the Query & execute");

			while (rs.next()) {
				System.out.println(
							"ID- " + rs.getInt(1) + " " + 
							"AGE- " + rs.getInt(2) + " " + 
							"FIRST NAME- "+ rs.getString(3) + " " +
							"Last Name- " + rs.getString(4));
			}

			// 5. Close the Resource
			System.out.println("5. Close the Resource ");
			JDBCUtil.cleanup(rs, stmt, con);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
