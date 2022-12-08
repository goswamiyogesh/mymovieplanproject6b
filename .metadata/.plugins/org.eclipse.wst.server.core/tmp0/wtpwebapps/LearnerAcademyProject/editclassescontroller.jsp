<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.simplilearn.pojo.*" %>
    <%@page import ="com.simplilearn.dao.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ClassesDao dao=new ClassesDao();
Classes c=new Classes();
c.setClassName(request.getParameter("ClassName"));
c.setClassId(Integer.parseInt(request.getParameter("ClassId")));
 String s=dao.update(c);
 if(s!=null){
	 response.sendRedirect("success2.jsp");
 }
 else{
 	response.sendRedirect("fail2.jsp");
 }
 %>
</body>
</html>