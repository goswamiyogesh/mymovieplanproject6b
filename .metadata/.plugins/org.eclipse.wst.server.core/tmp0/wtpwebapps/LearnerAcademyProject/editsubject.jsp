<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>Editing the subject</i></h1>
<form action="editsubjectcontroller.jsp">
<input type="hidden" name="Id" value=<%=request.getParameter("Id") %>>
Name to be edited <input type="text" name="SubjectName">
<input type="submit" value="edit">
</form>
</body>
</html>