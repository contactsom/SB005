<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show data</title>
</head>
<body>
		<h1>Congratulation!!! You registration is successfull  </h1>
		<h2>We will get back to you for next batch </h2>
	First Name : <%= request.getAttribute("Fname") %>
	<br>
	Last Name : <%= request.getAttribute("Lname") %>
	<br>
	Email  : <%= request.getAttribute("Email") %>
	<br>
	Password : <%= request.getAttribute("Pass") %>
	<br>
</body>
</html>