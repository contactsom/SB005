<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Foodpanda</title>
</head>
<body>

		<jsp:include page="header.jsp">
			<jsp:param value="Food Panda !!! BRINGING GOOD FOOD INTO YOUR EVERYDAY" name="header"/>
		</jsp:include>
	
		<h1> Welcome to Food Panda </h1>
		<h2> Eat with Food Panda - Be Your Own Boss for your test</h2>
		
		Click on the URL to redirect our portal ${param.URL}
		<br>
		
		for any query and support reach out to our customer support ${param.help}
		
		
		<jsp:include page="footer.jsp">
			<jsp:param value="By continuing past this page, you agree to our Terms of Service, Cookie Policy, Privacy Policy and Content Policies. All trademarks are properties of their respective owners. 2008-2022 © FoodPanda™ Ltd. All rights reserved." name="footer"/>
		</jsp:include>
		
</body>
</html>