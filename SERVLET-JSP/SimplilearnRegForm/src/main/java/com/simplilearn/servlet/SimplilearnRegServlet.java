package com.simplilearn.servlet;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SimplilearnRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SimplilearnRegServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		System.out.println("START-***********doPost()****************");
		
		String firstName=(String)request.getParameter("firstName");
		String lastName=(String)request.getParameter("lastName");
		String emailId=(String)request.getParameter("emailId");
		String password=(String)request.getParameter("password");
		String gender=(String)request.getParameter("gender");
		String timing=(String)request.getParameter("timing");
		
		String courses[]=request.getParameterValues("course");
		String remarks=(String)request.getParameter("remarks");
		
		
		System.out.println("firstName-"+firstName);
		System.out.println("lastName-"+lastName);
		System.out.println("emailId-"+emailId);
		System.out.println("password-"+password);		
		System.out.println("gender-"+gender);
		System.out.println("timing-"+timing);
		
		
		for (String course : courses) {
			System.out.println("Course-"+course);
		}
		
		
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
		
		/*
		 * Home Work
		 * Add all the remaining attribute in response 
		 * */
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
		System.out.println("END-***********doPost()****************");
		
		System.out.println("remarks-"+remarks);
	}

}
