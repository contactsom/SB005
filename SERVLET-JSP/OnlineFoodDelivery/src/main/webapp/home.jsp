<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>


	<jsp:include page="header.jsp">
		<jsp:param value="Top Online Food Delivery Services In Town And What To Order From Them" name="header"/>
	</jsp:include>
	
	
	<h2> Find the best restaurants, cafés and bars on foodbox</h2>
	<h2> Food Box</h2>
	
		<h3> Select Your favourite food delivery partners</h3>
			
			<form action="service.jsp">
				
				<select name="deliverypartner">
					<option value="ZO">Zomato</option>
					<option value="UB">UberEats</option>
					<option value="FO">FoodPanda</option>
					<option value="SW">Swiggy</option>				
				</select>
			
				<input type="submit" value="Submit">
			</form>
	
	
	<jsp:include page="footer.jsp">
		<jsp:param value="By continuing past this page, you agree to our Terms of Service, Cookie Policy, Privacy Policy and Content Policies. All trademarks are properties of their respective owners. 2008-2022 © FoodBox™ Ltd. All rights reserved." name="footer"/>
	</jsp:include>
	
</body>
</html>