package com.simplilearn.preparedstatement;

import java.sql.*;

import com.simplilearn.utill.JDBCUtil;

public class PrepearedStatamentExample {

	public static void main(String[] args) {
		Connection con=null;
		
		try {
			
			con=JDBCUtil.getMySqlConnection();
			//con.createStatement();
			PreparedStatement pstmt=con.prepareStatement("INSERT INTO STUDENT VALUES (?, ?, ?, ?)"); /*PLACE HOLDER*/
			
			//INSERT INTO STUDENT VALUES (200, 11, 'Ali', 'Asghari');
			pstmt.setInt(1, 200);
			pstmt.setInt(2, 11);
			pstmt.setString(3, "Ali");
			pstmt.setString(4, "Asghari");			
			pstmt.execute();
			
			//INSERT INTO STUDENT VALUES (201, 12, 'Subhash', 'Jain');
			pstmt.setInt(1, 201);
			pstmt.setInt(2, 12);
			pstmt.setString(3, "Subhash");
			pstmt.setString(4, "Jain");			
			pstmt.execute();

			//INSERT INTO STUDENT VALUES (202, 13, 'Harsh', 'Sharma');
			pstmt.setInt(1, 202);
			pstmt.setInt(2, 13);
			pstmt.setString(3, "Harsh");
			pstmt.setString(4, "Sharma");			
			pstmt.execute();
			
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
