<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show</title>
</head>
<body>
	Email from Request : <%= request.getAttribute("EM1") %>
	<br>
	Email from Session : <%= session.getAttribute("EM2") %>
	<br>
	Email from Application : <%= application.getAttribute("EM3") %>

</body>
</html>