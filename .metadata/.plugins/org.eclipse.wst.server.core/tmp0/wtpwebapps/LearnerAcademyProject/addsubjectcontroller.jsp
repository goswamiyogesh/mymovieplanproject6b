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
SubjectsDao dao=new SubjectsDao();
Subjects  su=new Subjects();
su.setId(Integer.parseInt(request.getParameter("Id")));
su.setSubjectName(request.getParameter("SubjectName"));
Integer row= dao.insert(su);
if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>