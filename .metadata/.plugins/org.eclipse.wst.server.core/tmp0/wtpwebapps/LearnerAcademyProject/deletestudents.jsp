<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>deleting the student id</i></h1>
<form action="deletestudentscontroller.jsp">
<input type="hidden" name="Id" value=<%=request.getParameter("Id") %>>
<input type="submit" value="delete">
</form>
</body>
</html>