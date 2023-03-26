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
h2 {
  text-align: center;
  font-family:verdana;
  font-size:200%;
}
.button { 
font-style: italic;
height: 50px; 
width: 310px;
color:Crimson;
font-size:200%;
font-family:verdana;
 background-color:#FFA07A;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert FoodItem</title>
</head>
<body>

<h2>Insert a new fooditem</h2>
<form action="insertFooditem">
<table>
<tr><td>Fd_ID:</td><td><input type="number" name="fdid"></td></tr>
<tr><td>Name:</td><td><input type="text" name="name"></td></tr>
<tr><td>Price:</td><td><input type="number" name="price"></td></tr>
<tr><td><div style="text-align:center"><input type="submit" class="button" value="Insert"></div></td></tr>
</table>
</form><br>

<h2>Display/Edit FoodItem</h2>
<form action="showfooditemadmin">
<div style="text-align:center">  
    <input type="submit" class="button" value="Show All">  
</div> 
</form> 
<br><br>
<h2>Show All Customers</h2>
<form action="displayallcustomer">
<div style="text-align:center">
<input type="submit" class="button" value="Show Customer">
</div>
</form>
<h2><b><i>Purchase details</i></b></h2>
<form action="purchasep_repo">
<div style="text-align:centre"><input type="submit" class="button" value="Purchased">  
 </div>
</form>
<br><br>
</body>
</html>