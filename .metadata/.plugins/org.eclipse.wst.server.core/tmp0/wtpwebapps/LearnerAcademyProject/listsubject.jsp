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
<a href="addsubject.jsp">Add New subject</a>
</h3>
<h2><i>List of Subjects</i></h2>
<table>
<tr><th>Id</th><th>SubjectName</th><th>Edit Action</th><th>Delete Action</th></tr>
<%
SubjectsDao dao=new SubjectsDao();
List<Subjects> list=dao.display();
for(Subjects su:list){
%>
<tr><td><%=su.getId()%></td><td><%=su.getSubjectName()%></td><td><td><a href="/LearnerAcademyProject/editsubject.jsp?id=<%=su.getId()%>">Edit </a></td><td><a href="/LearnerAcademyProject/deletesubject.jsp?id=<%=su.getId()%>">Delete </a></td></tr>
<%} %>

</body>
</html>