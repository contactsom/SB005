<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Service</title>
</head>
<body>
	<h1> I am Service</h1>
	
	<%
		String partner=request.getParameter("deliverypartner");
		if(partner.equalsIgnoreCase("ZO")){
			
	
	%>
	
		<jsp:forward page="zomato.jsp">
			<jsp:param value="https://www.zomato.com/" name="URL"/>
			<jsp:param value="support@zomato.com" name="help"/>
		</jsp:forward>
		
	<%
		} else if (partner.equalsIgnoreCase("UB")){
	
	%>
	
		<jsp:forward page="ubereats.jsp">
			<jsp:param value="https://www.ubereats.com/" name="URL"/>
			<jsp:param value="support@ubereats.com" name="help"/>
		</jsp:forward>
	
	
	<%
		} else if (partner.equalsIgnoreCase("FO")){
	
	%>
	
		<jsp:forward page="foodpandas.jsp">
			<jsp:param value="https://www.foodpanda.com/" name="URL"/>
			<jsp:param value="support@foodpanda.com" name="help"/>
		</jsp:forward>
		
		
	<%
		} else if (partner.equalsIgnoreCase("SW")){
	
	%>
	
		<jsp:forward page="swiggy.jsp">
			<jsp:param value="https://www.swiggy.com/" name="URL"/>
			<jsp:param value="support@swiggy.com" name="help"/>
		</jsp:forward>
	
	<%
		} else {
	
	%>
	
		<jsp:forward page="error.jsp">
			<jsp:param value="You have not selected any resto" name="URL"/>
			<jsp:param value="support@foodbox.com" name="help"/>
		</jsp:forward>
		
	<%
			
		}
	
	%>
	
</body>
</html>