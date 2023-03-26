<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.demo.entity.*" %>
    <%@ page import="com.example.demo.service.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<style >
*{
margin:0px;
padding:0px;
background-color:#F3D77D ;
}
h2 {
  text-align: center;
  font-family:verdana;
  font-size:300%;
  color:DarkBlue;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><i><b>Purchased</b></i></h2>
<%List<Purchase>a=(List<Purchase>)request.getAttribute("list"); %>
<table>
<tr><th>Purchase_ID</th><th>Customer_Name</th><th>item_purchased</th><th>Price</th><tr>
<%for(Purchase as:a){%>
<tr><td><%=as.getP_id()%></td><td><%=as.getF_name()%><td><%=as.getName() %></td><td><%=as.getPrice()%></td>
<td></td>
</tr>
<%} %>
</table>
</body>
</html>