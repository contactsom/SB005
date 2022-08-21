package com.simplilearn.preparedstatement;

import java.sql.*;

import com.simplilearn.utill.JDBCUtil;

public class PrepearedStatamentUpdateExample {

	public static void main(String[] args) {
		Connection con=null;
		
		try {
			
			con=JDBCUtil.getMySqlConnection();
			System.out.println("Connection Successfull");
			PreparedStatement pstmt=con.prepareStatement("UPDATE STUDENT SET STU_FName = ? WHERE STU_ID = ? "); /*PLACE HOLDER*/
			
			//UPDATE STUDENT SET STU_FName='rakesh' WHERE STU_ID = 200
			//UPDATE STUDENT SET STU_FName=? WHERE STU_ID = ?
			
			pstmt.setString(1, "Ram");
			pstmt.setInt(2, 201);
			pstmt.executeUpdate();
			
			
			pstmt.setString(1, "Mamal");
			pstmt.setInt(2, 202);
			pstmt.executeUpdate();
			
			System.out.println("Data Updated");
			
			con.close();
			
		} catch (SQLException e) {
			System.err.println("Error occured while updating the Data");
			e.printStackTrace();
			
		}
	}
}
