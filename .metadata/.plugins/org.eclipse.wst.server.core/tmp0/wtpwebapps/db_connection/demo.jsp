<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String email=request.getParameter("email");


try {
Class.forName("com.mysql.jdbc.Driver");
Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/aits","root","root");
System.out.println(con);
java.sql.PreparedStatement pst=	con.prepareStatement("update stdemo set column='virat' where id=109");

int i=pst.executeUpdate();
out.println("sucess"+i);
}catch(Exception e) {
	e.printStackTrace();
}
%>
</body>
</html>