<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.learneracademy.pojo.*" %>
    <%@page import ="com.learneracademy.dao.*" %>
     <%@page import="java.util.*" %>       

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
<a href="Classes.java">Classes</a>
         &nbsp;&nbsp;&nbsp;
<a href="Students.java">Student</a>
         &nbsp;&nbsp;&nbsp;
<a href="Teachers.java">Teacher</a>
         &nbsp;&nbsp;&nbsp;
 <a href="Subjects.java">Subject</a>
         &nbsp;&nbsp;&nbsp;
 <a href="./logout">Logout</a>        
</h2>
<h3>
<a href="addclasses.jsp">Add New Class</a>
</h3>
<h2><i>List of Classes</i></h2>
<table border="1">
<tr><th>ClassId</th><th>ClassName</th><th>Action</th></tr>
<%
ClassesDao dao=new ClassesDao();
List<Classes> list=dao.display();
for(Classes c:list){
%>
<tr><td><%=c.getClassId()%></td><td><%=c.getClassName()%></td><td><a href="editclasses.jsp?id=<%c.get>">edit</a></td><td><a href="deleteclasses.jsp?id=<%=c.getClassId()%>">delete</a></td></tr>
<%} %>
</table>
</body>
</html>