<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@page import="com.example.demo.entity.*" %>
    <%@page import="java.util.*" %>
<html>
<head>
<style>
*{
margin:0px;
padding:0px;
background-color:#F3D77D ;
}
h1 {
  text-align: center;
  font-family:verdana;
  font-size:200%;
}
.button { 
font-style: italic;
height: 50px; 
width: 210px;
color:Crimson;
font-size:200%;
font-family:verdana;
 background-color:#FFA07A;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customer</h1>

<%List<Customer> a=(List<Customer>)request.getAttribute("list"); %>

<table border="1">
<tr><th>First Name</th><th>Last Name</th><th>Date Of Birth</th><th>Username</th><th>Password</th></tr>
<%for(Customer as:a){%>
<tr><td><%=as.getF_name()%></td><td><%=as.getL_name()%></td><td><%=as.getDOB()%></td><td><%=as.getUsername()%></td><td><%=as.getPassword()%></td></tr>
<%} %>
</body>
</html>