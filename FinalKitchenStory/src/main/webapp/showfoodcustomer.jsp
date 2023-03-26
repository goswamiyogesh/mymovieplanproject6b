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

.button { 
height: 45px; 
width: 320px;
color:Crimson;
font-size:250%;
background-color:#DAF7A6 ;
font-family:Brush Script MT;
} 
h1 {
  text-align: center;
  font-family:verdana;
  font-size:300%;
  color:DarkRed;
}
h2 {
  text-align: center;
  font-family:verdana;
  font-size:200%;
  color:DarkRed;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><b>Search by Name</b></h2>
<form action="searchfooditem">
Filter:<input type="text" name="keyword">
<input type="hidden" name="name" value=<%=request.getAttribute("name") %>>
<input type="submit" class="button" value="search">
</form>
<br>
<h1>
<%=request.getAttribute("s") %>

</h1>
<form action="displayfooditemcustomer">
<input type="hidden" name="usnm" value=<%=request.getAttribute("username") %>>
<input type="submit" class="button" value="Display All FoodItem">
</form>
</body>
</html>