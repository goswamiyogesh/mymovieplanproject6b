<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
  color:DarkBlue;
}
.button { 
height: 80px; 
width: 500px;
color:DarkRed;
font-size:250%;
background-color:#FFA07A;
font-family:Brush Script MT;
} 
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Redirecting to your Bank...</h1>

<form action="proceedpay">
<table>
<tr><td>Enter bank ID(1 or 2):</td><td><input type="number" name="bid"></td></tr>
</table>
<input type="hidden" name="price" value=<%=request.getParameter("price") %>>
<input type="hidden" name="name" value=<%=request.getParameter("name") %>>
<input type="hidden" name="usnm" value=<%=request.getParameter("usnm") %>>
<input type="submit" class="button" value="Proceed To Pay">

</form>
</body>
</html>