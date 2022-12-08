<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>Editing the teacher detail</i></h1>
<form action="editteachercontroller.jsp">
<input type="hidden" name="Id" value=<%=request.getParameter("Id") %>>
firstName to be edited <input type="text" name="FirstName">
lastName to be edited <input type="text" name="LastName">
dob to be edited <input type="text" name="Dob">
Address to be edited <input type="text" name="Address">
phone to be edited <input type="text" name="Phone">
designation to be edited <input type="text" name="Designation">
<input type="submit" value="edit">
</form>
</body>
</html>