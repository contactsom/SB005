package com.simplilearn.session;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name= (String)request.getParameter("name");
		String email= (String)request.getParameter("email");
		
		HttpSession session = request.getSession();
		
		System.out.println("Name "+name);
		System.out.println("Email "+email);
		
		System.out.println("IS NEW - "+session.isNew());
		System.out.println("SESSION ID - "+session.getId());
		System.out.println("SESSION Creation TIME - "+session.getCreationTime());
		System.out.println("SESSION Last Access TIME - "+session.getLastAccessedTime());
		
		
		ServletConfig sconfig=getServletConfig();
		ServletContext context=sconfig.getServletContext();
		
		request.setAttribute("EM1", email);
		session.setAttribute("EM2", email);
		context.setAttribute("EM3", email);
		
		/*HOME WORK*/
		/*Send Name also*/
		
		
		RequestDispatcher rd= request.getRequestDispatcher("show.jsp");
		
		rd.forward(request, response);
		
		
	}

}
