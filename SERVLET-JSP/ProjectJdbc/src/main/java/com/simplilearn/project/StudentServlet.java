package com.simplilearn.project;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

import com.simplilearn.jdbc.utill.JDBCUtil;

@WebServlet("/")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static final String INSERT="INSERT INTO STUDENT_PROJECT VALUES (?, ?, ?, ?)";
	public static final String SEARCH_BY_EMAIL="SELECT * FROM STUDENT_PROJECT WHERE STU_Email = ?";
	
    public StudentServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("************************START-doPost()**************************************");
		
		String path=request.getServletPath();
		System.out.println("Path "+path); // /insert
	
		switch(path) {
			case "/insert":
					saveData(request,response);
				break;
			case "/getByEmail":
					getByEmailId(request,response);
				break;
				
			}
		
		System.out.println("************************END-doPost()**************************************");
		
	}
	
	
	private void getByEmailId(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("************************START-getByEmailId()**************************************");
		Connection con=null;
		String emailId = (String)request.getParameter("emailId");
		System.out.println("Search Email "+emailId);
		
		try {
			con=JDBCUtil.getMySqlConnection();
			PreparedStatement pstmt=con.prepareStatement(SEARCH_BY_EMAIL); /*PLACE HOLDER*/
			pstmt.setString(1, emailId);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				String fname = rs.getString("STU_FirstName");
				String lname = rs.getString("STU_LastName");
				String email = rs.getString("STU_Email");
				String password = rs.getString("STU_Password");
				
				/*System.out.println("First Name "+fname);
				System.out.println("Last Name "+lname);
				System.out.println("Email "+email);
				System.out.println("Password "+password);*/
				
				displayserchResult(fname,lname,email,password,request,response);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("************************END-getByEmailId()**************************************");
		
	}

	private void displayserchResult(String fname, String lname, String email, String password, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("Fname", fname);
		request.setAttribute("Lname", lname);
		request.setAttribute("Email", email);
		request.setAttribute("Pass", password);
		
		RequestDispatcher rd = request.getRequestDispatcher("serchresult.jsp");
		rd.forward(request, response);
	}

	public static void saveData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("************************START-saveData()**************************************");
		Connection con=null;
		
		String firstname = (String)request.getParameter("firstName");
		String lastName  = (String)request.getParameter("lastName");
		String emailId = (String)request.getParameter("emailId");
		String password = (String)request.getParameter("password");
		
		System.out.println("First Name "+firstname);
		System.out.println("Last Name "+lastName);
		System.out.println("Email "+emailId);
		System.out.println("Password "+password);
		
		try {
			con=JDBCUtil.getMySqlConnection();
			PreparedStatement pstmt=con.prepareStatement(INSERT); /*PLACE HOLDER*/
			pstmt.setString(1, firstname);
			pstmt.setString(2, lastName);	
			pstmt.setString(3, emailId);
			pstmt.setString(4, password);	
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		display(request,response);
		System.out.println("************************END-saveData()**************************************");
	}
	
	public static void display(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("************************START-display()**************************************");
		
		String firstname = (String)request.getParameter("firstName");
		String lastName  = (String)request.getParameter("lastName");
		String emailId = (String)request.getParameter("emailId");
		String password = (String)request.getParameter("password");
		
		request.setAttribute("Fname", firstname);
		request.setAttribute("Lname", lastName);
		request.setAttribute("Email", emailId);
		request.setAttribute("Pass", password);
		
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
		
		System.out.println("************************END-display()**************************************");
	}

}
