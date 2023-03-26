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
width: 200px;
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
<%List<FoodItem> a=(List<FoodItem>)request.getAttribute("list");%>

<table border="1">
<tr><th>Fd_ID</th><th>Name</th><th>Price</th></tr>

<%for(FoodItem as:a){%>
<tr><td><%=as.getFd_id()%></td><td><%=as.getName()%></td><td><%=as.getPrice()%></td><td>
<form action="proceedpay1.jsp">
<input type="hidden" name="price" value=<%=as.getPrice()%>>
<input type="hidden" name="name" value=<%=as.getName()%>>
<input type="hidden" name="usnm" value=<%=request.getParameter("usnm")%>>
<input type="submit" class="button" value="Buy Now">
</form></td>
</tr>
<%}%>
</table>
</body>
</html>