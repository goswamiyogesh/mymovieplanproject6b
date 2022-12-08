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
<a href="addstudent.jsp">Add New Student</a>
</h3>
<h2><i>List of Students</i></h2>
<table>
<tr><th>Id</th><th>firstName</th><th>lastName</th><th>Dob</th><th>Address</th><th>Phone</th><th>Edit Action</th><th>Delete Action</th></tr>
<%
StudentsDao dao=new StudentsDao();
List<Students> list=dao.display();
for(Students st:list){
%>
<tr><td><%=st.getId()%></td><td><%=st.getFirstName()%></td><td><%=st.getLastName()%></td><td><%=st.getDob()%></td><td><%=st.getAddress()%></td><td><%=st.getPhone()%></td><td><a href="/LearnerAcademyProject/editstudents.jsp?id=<%=st.getId()%>">Edit </a></td><td><a href="/LearnerAcademyProject/deletestudents.jsp?id=<%=st.getId()%>">Delete </a></td></tr>
<%} %>
</table>
</body>
</html>