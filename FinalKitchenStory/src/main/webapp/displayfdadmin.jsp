<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.example.demo.entity.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
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
  font-size:300%;
}

.button { 
height: 50px; 
width: 180px;
color:Crimson;
font-size:250%;
font-family:Lucida Console;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>FoodItem</h1>
<%List<FoodItem> a=(List<FoodItem>)request.getAttribute("list"); %>

<table border="1">
<tr><th>Fd_ID</th><th>Name</th><th>Price</th></tr>

<%for(FoodItem as:a){%>
<tr><td><%=as.getFd_id()%></td><td><%=as.getName()%></td><td><%=as.getPrice()%></td><td>
<form action="deletefooditem">
<input type="hidden" name="fdid" value=<%=as.getFd_id() %>>
<input type="submit" class="button" value="Delete">
</form></td>
<td>
<form action="editfooditem1.jsp">
<input type="hidden" name="fdid" value=<%=as.getFd_id() %>>
<input type="submit" class="button" value="Edit">
</form></td>
</tr>
<%}%>
</table>
<br><br>
</body>
</html>