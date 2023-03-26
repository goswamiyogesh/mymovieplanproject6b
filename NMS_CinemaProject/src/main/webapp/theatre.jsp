<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h2><i><b>Insert Theatre</b></i></h2>

<form action="inserttheatre" method="post" enctype="multipart/form-data" >
<table class="table table-hover" >
<tr><td>Theatre_ID:</td><td><input type="number" name="tid"></td></tr>
<tr><td>Theatre name:</td><td><input type="text" name="tname"></td></tr>
<tr><td>Theatre Type:</td><td><input type="text" name="ttype"></td></tr>
<tr><td>Address:</td><td><input type="text" name="address"></td></tr>
<tr><td>Complex Picture:</td><td><input type="file" name="file"></td></tr>
<tr><td><div style="text-align:center"><button type="submit" class="btn btn-primary">Insert Theatre Detail</button></div></td></tr>
</table><br>
</form>
<h2><b><i>Display/Theatre Details</i></b></h2>
<form action="showtheatreuser">
<div style="text-align:center">
<button type="submit" class="btn btn-primary">Show Theatre</button>
</div>
</form> 
<br><br>
</body>
</html>