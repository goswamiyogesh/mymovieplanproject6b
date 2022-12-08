<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.simplilearn.pojo.*" %>
    <%@page import ="com.simplilearn.dao.*" %>
     <%@page import="java.util.*" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>Welcome to learners Academy</h1>
<h2>
<a href="index.jsp">Classes</a>
         &nbsp;&nbsp;&nbsp;
<a href="liststudents.jsp">Student</a>
         &nbsp;&nbsp;&nbsp;
<a href="listteacher.jsp">Teacher</a>
         &nbsp;&nbsp;&nbsp;
 <a href="listsubject.jsp">Subject</a>
         &nbsp;&nbsp;&nbsp;
 <a href="Logout.jsp">Logout</a>     
</h2>
<h3>
<a href="addclasses.jsp">Add New Class</a>
</h3>
<h2><i>List of Classes</i></h2>
<table border="1">
<tr><th>ClassId</th><th>ClassName</th><th>Edit Action</th><th>Delete Action</th></tr>
<%
ClassesDao dao=new ClassesDao();
List<Classes> list=dao.display();
for(Classes c:list){
	%>
	<tr><td><%=c.getClassId()%></td><td><%=c.getClassName()%></td><td><a href="/LearnerAcademyProject/editclasses.jsp?id=<%=c.getClassId()%>">Edit with classname</a></td><td><a href="/LearnerAcademyProject/deleteclasses.jsp?id=<%=c.getClassId()%>">Delete class</a></td></tr>
	<%} %>

</table>
</body>
</html>