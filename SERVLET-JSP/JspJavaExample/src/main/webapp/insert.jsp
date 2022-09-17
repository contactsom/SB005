<%@page import="com.simplilearn.beans.Customer" %>

<html>
<head>
<meta charset="UTF-8">
<title>insert.jsp</title>
</head>
<body>
	
		<%
			Customer cust = new Customer();
			cust.setCid(202);
			cust.setCname("Deepak");
			cust.setEmail("deepak@gmail.com");
			cust.setPhone(12345);		
			session.setAttribute("CUST", cust);
			
				
			Customer cust1 = new Customer();
			cust1.setCid(203);
			cust1.setCname("Kiku");
			cust1.setEmail("kiku@gmail.com");
			cust1.setPhone(99999);		
			session.setAttribute("CUST1", cust1);
			
		%>
		
		<jsp:forward page="display.jsp"/>
		
</body>
</html>