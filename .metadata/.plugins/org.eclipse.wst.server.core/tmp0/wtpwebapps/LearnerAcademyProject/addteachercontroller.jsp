<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "com.simplilearn.pojo.*" %>
    <%@page import = "com.simplilearn.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
TeachersDao dao=new TeachersDao();
Teachers  t=new Teachers();
t.setId(Integer.parseInt(request.getParameter("Id")));
t.setFirstName(request.getParameter("firstName"));
t.setLastName(request.getParameter("lastName"));
t.setDob(request.getParameter("Dob"));
t.setAddress(request.getParameter("Address"));
t.setPhone(Integer.parseInt(request.getParameter("Phone")));
t.setDesignation(request.getParameter("Designation"));
Integer row= dao.insert(t);

if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>