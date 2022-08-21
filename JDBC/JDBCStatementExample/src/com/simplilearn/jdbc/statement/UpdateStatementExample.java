package com.simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*This JAVA COde is responsable to Update the data in to MySql*/
public class UpdateStatementExample {

	public static void main(String[] args) {

		System.out.println("****** START- StatementExample");
		try {
			// 1. Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("1. Driver Class loaded successfully");

			// 2. Get the Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root",	"root12345");
			System.out.println("2. Connection Established");

			// 3. Create the Statement
			Statement stmt = con.createStatement();
			System.out.println("3. Create the Statement Done");

			// 4. Prepare the Query & execute
			// Prepare the Query to Update the data
			 int record=stmt.executeUpdate("UPDATE Employees SET firstName='rakesh' WHERE id = 109");
			 // if record = 0 . means no record inserted 
			 // If Record >0 Means record insereted successsfully		
			 
			 if(record>0) {
				 System.out.println("Congratulation Records Updated successfully");
			 }else {
				 System.err.println("Error occured While Updating the Data");
			 }
			 System.out.println("4. Prepare the Query & execute");

			// 5. Close the Resource
			System.out.println("5. Close the Resource ");
			con.close();
			stmt.close();
			//rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	
	}
}
