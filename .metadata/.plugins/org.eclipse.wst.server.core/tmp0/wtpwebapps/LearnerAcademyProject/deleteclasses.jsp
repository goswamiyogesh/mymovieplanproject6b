<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Classes</title>
</head>
<body>
<h1><i>deleting the class id</i></h1>
<form action="deleteclassescontroller.jsp">
<input type="hidden" name=<%=request.getParameter("id") %>>
<input type="submit" value="delete">
</form>
</body>
</html>