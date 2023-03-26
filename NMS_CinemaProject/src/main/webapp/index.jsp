<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
	<%@page import="com.example.demo.model.*" %>
    <%@page import="com.example.demo.service.*"%>
    <%@page import="java.nio.file.Files" %>
    <%@page import="java.io.File" %>
    <%@page import="java.util.Base64.*" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
 
<style>
*{
margin:0px;
padding:0px;
background-color:#F3D77D ;
}
div {
  text-align: center;
   font-size:300%;
  background-color: #d5f4e6;
}
h1 {
  text-align: center;
  font-family:verdana;
  font-size:400%;
  color:DarkRed;
},
a :hover {
  text-align: right;
  font-family:verdana;
  font-size:800%;
  color:green;
},

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i><b>Welcome To NMS Cinema</b></i></h1>

<div><a href="adminlogin.jsp">Admin Login</a></div><br>

<div><a href="userlogin.jsp">User Login</a></div><br>

<%String path="c:/image/cinema.jpg";
byte[] images=Files.readAllBytes(new File(path).toPath());
byte[] encodeBase641 = Base64.getEncoder().encode(images);
String base64Encoded1 = new String(encodeBase641, "UTF-8");
%>
<img alt="image" src="data:image/jpg;base64,<%=base64Encoded1%>" width="60%" height="60%"/>

</body>
</html>