package com.simplilearn.callablestatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.simplilearn.utill.JDBCUtil;

public class CallableStatementExample {
	public static void main(String[] args) {
		try {
			Connection con=JDBCUtil.getMySqlConnection();
			PreparedStatement pstmt= con.prepareCall("{call GetAllStudent}"); /*Call the created SP namely GetAllStudent  */
			boolean isExecuted=pstmt.execute(); /*This method will return true if SP executed successfully else false*/
			if(isExecuted) {
				ResultSet rs= pstmt.getResultSet();
				while(rs.next()) {
					
					/*System.out.println(
										"ID  - "+rs.getInt(1)+" "+
										"AGE - "+rs.getInt(2)+" "+
										"Fname - "+rs.getString(3)+" "+
										"LName - "+rs.getString(4)								
							);
					*/
					
					System.out.println(
							"ID  - "+rs.getInt("STU_ID")+" "+
							"AGE - "+rs.getInt("STU_AGE")+" "+
							"Fname - "+rs.getString("STU_FName")+" "+
							"LName - "+rs.getString("STU_LName")								
				);
					
				}
			}else {
				System.err.print("Error Occured While Executing the Stored Procedure");
			}
			
			JDBCUtil.cleanup(pstmt, con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}