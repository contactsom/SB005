<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zomato</title>
</head>
<body>
		
		<jsp:include page="header.jsp">
			<jsp:param value="Zomato !!! Every meal matters" name="header"/>
		</jsp:include>
	
		<h1> Welcome to Zomato </h1>
		<h2> Discover the best food & drinks to your door</h2>
		
		Click on the URL to redirect our portal ${param.URL}
		<br>
		
		for any query and support reach out to our customer support ${param.help}
		
		
		<jsp:include page="footer.jsp">
			<jsp:param value="By continuing past this page, you agree to our Terms of Service, Cookie Policy, Privacy Policy and Content Policies. All trademarks are properties of their respective owners. 2008-2022 © Zomato™ Ltd. All rights reserved." name="footer"/>
		</jsp:include>
</body>
</html>