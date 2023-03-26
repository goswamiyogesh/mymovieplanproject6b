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
h1 {
  text-align: center;
  font-family:verdana;
  font-size:300%;
  color:#006400;
}
h2 {
  text-align: center;
  font-family:verdana;
  font-size:300%;
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
<h1><b><i>"Showing Theatre List"</i></b></h1><br><br>
<%List<Theatre> e=(List<Theatre>)request.getAttribute("list"); %>
<table  class="table table-hover">
<tr><th>Theatre_ID</th><th>Theatre Name</th><th>Theatre Type</th><th>Address</th><th>Complex Picture</th></tr>

<%for(Theatre es:e){%>
<tr><td><%=es.getTid()%></td><td><%=es.getTname()%></td><td><%=es.getTtype()%></td><td><%=es.getAddress()%></td>
<td>
<%String path=es.getFile_path();
byte[] images=Files.readAllBytes(new File(path).toPath());
byte[] encodeBase64 = Base64.getEncoder().encode(images);
String base64Encoded = new String(encodeBase64, "UTF-8");
%>
<img alt="image" src="data:image/png;base64,<%=base64Encoded%>" width="100" height="100"/>
</td>
</tr>
<%}%>
</table>
</body>
</html>