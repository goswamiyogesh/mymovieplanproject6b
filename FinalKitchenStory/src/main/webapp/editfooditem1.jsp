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
height: 50px; 
width: 200px;
color:DarkBlue;
font-size:200%;
font-family:verdana;
} 
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="editfooditem">
<table>
<tr><td><input type="hidden" name="fdid" value=<%=request.getParameter("fdid") %>></td></tr>
<tr><td>Edit Name:</td><td><input type="text" name="name"></td></tr>
<tr><td>Edit Price:</td><td><input type="number" name="price"></td></tr>
<tr><td><input type="submit" class="button" value="Edit Now"></td></tr>
</table>
</form><br>
</body>
</html>