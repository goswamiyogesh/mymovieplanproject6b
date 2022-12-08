<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.learneracademy.pojo.*" %>
    <%@page import ="com.learneracademy.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
ClassesDao dao=new ClassesDao();
Classes  c=new Classes();
c.setClassId(Integer.parseInt(request.getParameter("ClassId")));
c.setClassName(request.getParameter("ClassName"));
Integer row= dao.insert(c);
if(row>0){
	response.sendRedirec("index.jsp");
}
else{
	out.println("failed to insert");
}
%>
</form>
</body>
</html>