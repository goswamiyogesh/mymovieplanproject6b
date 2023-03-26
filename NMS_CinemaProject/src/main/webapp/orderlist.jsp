<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>.
     <%@page import="java.util.*" %>
	<%@page import="com.example.demo.model.*" %>
    <%@page import="com.example.demo.service.*"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style>
h2 {
  text-align: center;
  font-family:verdana;
  font-size:300%;
  color:#006400;
}
body {
  background-color: #fefbd8;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><i><b>Order Summary</b></i></h2>
<%List<OrderTable> e=(List<OrderTable>)request.getAttribute("list"); %>
<table  class="table table-hover">
<tr><th>Order_ID</th><th>Movie Name</th><th>Movie Price</th></tr>

<%for(OrderTable es:e){%>
<tr><td><%=es.getOid()%></td><td><%=es.getMoviename()%></td><td><%=es.getMovieprice()%></td>
<td></td>
</tr>
<%}%>
</table>
</body>
</html>