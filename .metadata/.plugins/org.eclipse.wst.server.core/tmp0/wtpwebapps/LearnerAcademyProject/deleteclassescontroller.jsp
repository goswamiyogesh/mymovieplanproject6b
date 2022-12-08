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
c.setClassId(Integer.parseInt(request.getParameter("ClassId")));
c. setClassName(request.getParameter("ClassName"));
 String s=(String)dao.delete(c);
 if(s!= null){
		response.sendRedirect("success3.jsp");
		}
		else{
			response.sendRedirect("fail3.jsp");
		}
	%>

</body>
</html>