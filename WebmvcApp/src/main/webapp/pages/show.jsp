<%@page import="cdac.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
<%
	List<User> user =(List<User>)request.getAttribute("USER_LIST");
	for(User u:user)
	{
%>
		<%=u.getUname() %><br>
		<%=u.getUpass() %><br>
		<%=u.getEmail() %><br>
<%}
%>
</body>
</html>