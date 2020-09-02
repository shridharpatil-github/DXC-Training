<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action='update' method="post">
	  
	  Employee ID:<br>
	  <input type="hidden" id="employeeId" name="employeeId" value="${employee.empId}"><br>
	   Name:<br>
	  <input type="text" id="name" name="name" value="${employee.name}"><br>
	  Designation:<br>
	  <input type="text" id="designation" name="designation" value="${employee.designation}"><br>
	  Department:<br>
	  <input type="text" id="department" name="department" value="${employee.department}"><br>
	  Basic:<br>
	   <input type="text" id="basic" name="basic" value="${employee.basic}"><br>
	  <br>
	  <br>
	  <input type="submit" value="Update">
	  
	</form> 
</body>
</html>