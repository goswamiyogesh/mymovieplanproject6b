<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "com.simplilearn.pojo.*" %>
    <%@page import = "com.simplilearn.dao.*" %>
    <%@page import = "java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>
<a href="addteacher.jsp">Add New Teacher</a>
</h3>
<h2><i>List of Teachers</i></h2>
<table>
<tr><th>Id</th><th>firstName</th><th>lastName</th><th>Dob</th><th>Address</th><th>Phone</th><th>Designation</th><th>Edit Action</th><th>Delete Action</th></tr>
<%
TeachersDao dao=new TeachersDao();
List<Teachers> list=dao.display();
for(Teachers t:list){
%>
<tr><td><%=t.getId()%></td><td><%=t.getFirstName()%></td><td><%=t.getLastName()%></td><td><%=t.getDob()%></td><td><%=t.getAddress()%></td><td><%=t.getPhone()%></td><td><%=t.getDesignation()%></td><td><td><a href="/LearnerAcademyProject/editteacher.jsp?id=<%=t.getId()%>">Edit </a></td><td><a href="/LearnerAcademyProject/deleteteacher.jsp?id=<%=t.getId()%>">Delete </a></td></tr>
<%} %>
 
</body>
</html>