<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>Keep-Board</title>
</head>


	<!-- Create a form which will have text boxes for Note title, content and status along with a Add 
		 button. Handle errors like empty fields -->

	<!-- display all existing notes in a tabular structure with Title,Content,Status, Created Date and Action -->
<body>
	<h2>Employee Information</h2>
	
	<form action='add' method="post">
	  
	  
	  Name:<br>
	  <input type="text" name="name"><br>
	  Designation:<br>
	  <input type="text" name="designation"><br>
	  Department:<br>
	  <input type="text" name="department"><br>
	  Basic:<br>
	  <input type="text" name="basic"><br>
	  <br>
	  <br>
	  <input type="submit" value="Submit">
	  
	</form> 
	<br>
	
	<c:if test="${not empty errorMessage}">
	   <p style="color:red">Error</p>: ${errorMessage}
	</c:if>
	<h2>Employees</h2>
	<table border="2">
	
	<tr>
	    <td>name</td>
		<td>designation</td>
		<td>department</td>
		<td>Joining Date</td>
	    <td>basic</td>
		<td>Delete Row</td>
		<td>Update Row</td>
	</tr>
	<c:forEach items="${employeeList}" var="employee">
		
		<tr>
		<td>${employee.name}</td>
		<td>${employee.designation}</td>
		<td>${employee.department}</td>
		<td>${employee.joiningDate}</td>
		<td>${employee.basic}</td>
		
		
		<td>
		<form action="delete" method="post">
			<input type="hidden" id="employeeId" name="employeeId" value="${employee.empId}"/>
			<button type="submit">Delete</button>
		</form>
		</td>
		
		<td>
		<form action="updateEmployee" method="post">
			<input type="hidden" id="employeeId" name="employeeId" value="${employee.empId}"/>
			<button type="submit">Update</button>
		</form>
		</td>
		</tr>
		</c:forEach>	
	</table>
	
</body>
</body>

</html>