<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>Adding teacher detail</i></h1>
<form action="addteachercontroller.jsp">
<table>
<tr><td>Id</td><td><input type="text" name="Id"></td></tr>
<tr><td>firstName</td><td><input type="text" name="firstName"></td></tr>
<tr><td>lastName</td><td><input type="text" name="lastName"></td></tr>
<tr><td>Dob</td><td><input type="text" name="Dob"></td></tr>
<tr><td>Address</td><td><input type="text" name="Address"></td></tr>
<tr><td>Phone</td><td><input type="text" name="Phone"></td></tr>
<tr><td>Designation</td><td><input type="text" name="Designation"></td></tr>
<tr><td><input type="submit" value="add teacher"></td></tr>
</table>
</form>
</body>
</html>