<%@ page import="java.util.List,com.model.Student" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="StudentController" method="post">
roll<input type="text" name="roll"/><br>
name<input type="text" name="name"/><br>
marks<input type="text" name="marks"/> <br>
<input type="submit" value="add student"/><br>
<a href="Home.html">Back</a>
</form>
<table>
<% List<Student> studentList=(List)request.getAttribute("studentList");
if(studentList!=null)
for(Student student : studentList)
{ %>
    <tr>
    <td><%=student.getRoll()%></td> <td><%=student.getName()%></td><td><%=student.getMarks()%></td>  
    </tr>
<% } %>
</table>
</body>
</html>