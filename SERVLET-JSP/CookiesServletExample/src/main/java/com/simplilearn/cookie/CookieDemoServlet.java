package com.simplilearn.cookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CookieDemoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		Cookie cookies[]=request.getCookies();
		
		if(cookies!=null) {
			if(cookies.length!=0) {
				for(Cookie cookie:cookies) {
					String cookiename=cookie.getName();
					if(cookiename.equals("JSESSIONID")) {
						System.out.println("You are the OLD User");
					}else {
						System.out.println("You are the New User");
					}
					String cookieValue=cookie.getValue();
					System.out.println("Cookie Value - "+cookieValue);
					String cookieDomain=cookie.getDomain();
					System.out.println("Cookie Domain - "+cookieDomain);
				}
				
			}else {
				System.out.println("Cookie Not Found");
			}
		}else {
			System.out.println("Cookie Not Found");
		}

		HttpSession	session = request.getSession();
		boolean isNew= session.isNew();
		
		if(isNew) {
			System.out.println("You are the new User as per session");
		}else {
			System.out.println("You are the old User as per session");
		}
		
		Cookie c1= new Cookie("EMAIL", email);
		response.addCookie(c1);
		
		Cookie c2= new Cookie("PHONE", "9852125");
		response.addCookie(c2);
		
		RequestDispatcher rd= request.getRequestDispatcher("cookiedemo.jsp");
		/*Home Work*/
		/*Create the cookie.jsp and recive the data*/
		rd.forward(request, response);
		
	}
	
}
