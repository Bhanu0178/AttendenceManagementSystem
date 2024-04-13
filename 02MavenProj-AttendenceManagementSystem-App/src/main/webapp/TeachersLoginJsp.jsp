<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.model.TeachersLoginBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 
</head>
<body>
	<%
		TeachersLoginBean tlb = (TeachersLoginBean)session.getAttribute("teachersloginbean");
		String msg = (String)request.getAttribute("message");
		out.print(msg);
		out.print("Name::" + tlb.getName() + "<br>");
		out.print("Subject::" + tlb.getSubject() + "<br>");
	%>
	<a href="StudentLogin.html">Students</a>
	<a href="logout">Logout</a>
</body>
</html>