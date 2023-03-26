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
  color:DarkRed;
}
h3 {
  text-align: center;
  font-family:verdana;
  font-size:200%;
  color:DarkBlue;
}
.button {

height: 50px; 
width: 300px;
color:DarkBlue;
font-size:250%;
background-color:#FFA07A;
font-family:Brush Script MT;
} 
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Customer</h1>

<h3><i>"LogIn"</i></h3>
<form action="logincustomer">
<table>
<tr><td>Username:</td><td><input type="text" name="usnm"></td></tr>
<tr><td>Password:</td><td><input type="text" name="pass"></td></tr>
<tr><td><input type="submit" class="button" value="Log In"></td></tr>
</table>
</form><hr>

<h3><i>"Sign Up"</i></h3>
<form action="insertcustomer">
<table>
<tr><td>First_name:</td><td><input type="text" name="fname"></td></tr>
<tr><td>Last_Name:</td><td><input type="text" name="lname"></td></tr>
<tr><td>Date Of Birth:</td><td><input type="text" name="dob"></td></tr>
<tr><td>Username:</td><td><input type="text" name="cusnm"></td></tr>
<tr><td>Password:</td><td><input type="text" name="cpass"></td></tr>
<tr><td><input type="submit" class="button"  value="Sign Up"></td></tr>
</table>
</form>
</body>
</html>