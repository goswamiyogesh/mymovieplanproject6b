<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "com.simplilearn.pojo.*" %>
    <%@page import = "com.simplilearn.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
StudentsDao dao=new StudentsDao();
Students st=new Students();
st.setId(Integer.parseInt(request.getParameter("Id")));
st.setFirstName(request.getParameter("firstName"));
st.setLastName(request.getParameter("lastName"));
st.setDob(request.getParameter("Dob"));
st.setAddress(request.getParameter("Address"));
st.setPhone(Integer.parseInt(request.getParameter("Phone")));
 String s= (String)dao.update(st);
 if(s!=null){
	 response.sendRedirect("success2.jsp");
 }
 else{
 	response.sendRedirect("fail2.jsp");
 }
%>
</body>
</html>