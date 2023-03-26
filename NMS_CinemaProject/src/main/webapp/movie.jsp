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
<h2><i><b>Insert Movie</b></i></h2>

<form action="insertmovie" method="post" enctype="multipart/form-data" >
<table class="table table-hover" >
<tr><td>Movie_ID:</td><td><input type="number" name="mid"></td></tr>
<tr><td>Title:</td><td><input type="text" name="title"></td></tr>
<tr><td>Language:</td><td><input type="text" name="language"></td></tr>
<tr><td>genre:</td><td><input type="text" name="genre"></td></tr>
<tr><td>Tickets</td><td><input type="number" name="tickets"></td></tr>
<tr><td>Price:</td><td><input type="number" name="price"></td></tr>
<tr><td>Time:</td><td><input type="text" name="time"></td></tr>
<tr><td>Poster:</td><td><input type="file" name="file"></td></tr>
<tr><td><div style="text-align:center"><button type="submit" class="btn btn-primary">Insert Movie Detail</button></div></td></tr>
</table><br>
</form>
<h2><b><i>Display/Movie Details</i></b></h2>
<form action="showmovieadmin">
<div style="text-align:center">
<button type="submit" class="btn btn-primary">Show Movies</button>
</div>
</form> 
<br><br>
<h2><b><i>Show All User</i></b></h2>
<form action="displayalluser">
<div style="text-align:center">
<button type="submit" class="btn btn-primary">Show Users</button> 
</div>
</form>
<br><br>
<h2><b><i>Insert Theatre Details</i></b></h2>
<form action="theatre.jsp">
<div style="text-align:center">
<button type="submit" class="btn btn-primary">Insert theatre</button>
</div>
</form> 
<h2><b><i>Order Summary</i></b></h2>
<form action="orderrepo">
<div style="text-align:center">
<button type="submit" class="btn btn-primary">Order Summary</button> 
</div>
</form>
<br><br>
</body>
</html>