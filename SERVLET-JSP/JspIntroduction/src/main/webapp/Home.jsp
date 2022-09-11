<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Tutorials</title>
</head>
<body>
	
	<h1> This is JSP First Example</h1>
	<h2> JSP Decleration using Declarative tag  </h2>
	<h2> This is JAVA Code Written in JSP</h2>
	
		<%!
		
			int a=30;
			int b=90;
			String course="JSP Tutorials";
			
			public int addNum(){
				return a+b;
			}
		
			public String getCourse(){
				return "I am Learning "+course;
			}
		%>
	
	<h2> ***************** JSP Calling JAVA Code using Scriptlet tag ********************</h2>
	
	<%
		out.print(a);
		out.print("<br>");		
		out.print(b);
		out.print("<br>");
		out.print(course);
		out.print("<br>");
		out.print(addNum());
		out.print("<br>");
		out.print(getCourse());
	
	%>
	
	<h2> ***************** JSP Calling  JAVA Code using JSP Expression tag ********************</h2>
	
	<%= a %>
	<br>
	<%= b %>
	<br>
	<%= addNum() %>
		<br>
	<%= getCourse() %>
	
	
	
	
	
	
	<h2> END- JSP Calling</h2>
	
</body>
</html>