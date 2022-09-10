package com.simplilearn.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentServlet() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("START-***********doPost()****************");
		String firstName=(String)request.getParameter("firstName");
		String lastName=(String)request.getParameter("lastName");
		String emailId=(String)request.getParameter("emailId");
		String password=(String)request.getParameter("password");
		
		System.out.println("firstName-"+firstName);
		System.out.println("lastName-"+lastName);
		System.out.println("emailId-"+emailId);
		System.out.println("password-"+password);
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
			
		out.print("<h1>Simplilearn:Interested in hiring from us </h1>");
		out.print("<h2>Simplilearn:Form Submitted Successfully, Here is your Details </h2>");
		
		out.print("<p>First Name :: "+firstName+"</p>");
		out.print("<p>Last Name :: "+lastName+"</p>");
		out.print("<p>Email ID :: "+emailId+"</p>");
		out.print("<p>Password :: "+password+"</p>");
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
		System.out.println("END-***********doPost()****************");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}
