<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style>
h1 {
  text-align: center;
  font-family:verdana;
  font-size:300%;
  color:#006400;
}
h2 {
  text-align: center;
  font-family:verdana;
  font-size:250%;
  color:DarkRed;
}
body {
  background-color: #fefbd8;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><b><i>Welcome User</i></b></h1>
<h2><b><i>Login</i></b></h2>
<form action="loginuser">
<table>
<tr><td>Username:</td><td><input type="text" name="uusnm"></td></tr>
<tr><td>Password:</td><td><input type="password" name="upass"></td></tr>
<tr><td><div style="text-align:center">
<button type="submit" class="btn btn-primary">Login</button>
</div></td></tr>
</table>
</form><br><br>

<h2>Update Password :</h2>
<form action="updateuser.jsp">
<button type="submit" class="btn btn-primary">Update NOW</button>
</form>


<h2><b><i>Insert User</i></b></h2>
<form action="insertuser">
<table>

<tr><td> Name:</td><td><input type="text" name="uname"></td></tr>
<tr><td>Email:</td><td><input type="email" name="email"></td></tr>
<tr><td>Username:</td><td><input type="text" name="uusername"></td></tr>
<tr><td>Password:</td><td><input type="password" name="upassword"></td></tr>

<tr><td><div style="text-align:center">
<button type="submit" class="btn btn-primary">Sign-Up</button>
</div></td></tr>
</table>
</form>
</body>
</html>