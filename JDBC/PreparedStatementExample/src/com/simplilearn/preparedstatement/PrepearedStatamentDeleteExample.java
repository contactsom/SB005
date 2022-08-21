package com.simplilearn.preparedstatement;

import java.sql.*;

import com.simplilearn.utill.JDBCUtil;
// TODO Complete this code to delete the data from table
public class PrepearedStatamentDeleteExample {

	public static void main(String[] args) {
		Connection con=null;
		
		try {
			
			con=JDBCUtil.getMySqlConnection();
			System.out.println("Connection Successfull");
			PreparedStatement pstmt=con.prepareStatement("TODO"); /*PLACE HOLDER*/
			
			pstmt.executeUpdate();
			System.out.println("Data Updated");
			
			con.close();
			
		} catch (SQLException e) {
			System.err.println("Error occured while updating the Data");
			e.printStackTrace();
			
		}
	}
}
