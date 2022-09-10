<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<h1> Simplilearn Registration Form </h1>
	
	<form action="<%= request.getContextPath()%>/SimplilearnReg" method="post">
	
		First Name: <input type="text" name="firstName"/>
		<br><br>
		
		Last Name: <input type="text" name="lastName"/>
		<br><br>
		
		Email ID: <input type="email" name="emailId"/>
		<br><br>
		
		Password: <input type="password" name="password"/>
		<br><br>
		
		Gender: 
		<input type="radio" name="gender" value="Male"/> Male
		<input type="radio" name="gender" value="Female"/> Female
		<br><br>
		
			<tr>
				<td>Timing</td>
				<td>
					<select name="timing">
						<option value="Select">Select</option>
						<option value="01.00AM-02.00AM">01.00 AM - 02.00 AM </option>
						<option value="02.00AM-03.00AM">02.00 AM - 03.00 AM </option>
						<option value="03.00AM-04.00AM">03.00 AM - 04.00 AM </option>
						<option value="04.00AM-05.00AM">04.00 AM - 05.00 AM </option>
					</select>
				</td>
			</tr>
			
		<br><br>
		
		<tr>
			<td>Course</td><br>
			<td>
				<input type="checkbox" name="course" value="JAVA"/> JAVA<br>
				<input type="checkbox" name="course" value="JDBC"/> JDBC<br>
				<input type="checkbox" name="course" value="HIBERNATE"/> HIBERNATE<br>
				<input type="checkbox" name="course" value="SERVLET"/> SERVLET<br>
				<input type="checkbox" name="course" value="JSP"/> JSP<br>
			
			</td>
		</tr>
		
		<br><br>
		
		<tr>
		
			<td>Remarks</td>
			<td>
				<textarea name="remarks" rows="6" cols="20"></textarea>
			</td>		
		</tr>
		
		
		
		<tr>
			<td colspan="2" align="center"> 
				<input type="submit" value="Register">
			</td>
		</tr>
	
	
	</form>

</body>
</html>