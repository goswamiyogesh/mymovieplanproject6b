
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>Editing the class name</i></h1>
<form action="editclassescontroller.jsp">
<input type="hidden" name=<%=request.getParameter("ClassId")%>>
Name to be edited <input type="text" name="ClassName">
<input type="submit" value="edit">

</body>
</html>