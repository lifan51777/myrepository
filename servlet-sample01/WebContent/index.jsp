<%@page import="java.beans.Expression"%>
<%@page import="java.util.Date"%>
<%@ page 
	language="java" 
	contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8" 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World!</h1>

<form action="login.do" method="post">
	<input type="text" width="100" name="name">
	<input type= "submit" value="提交">
</form>

<%out.print("hello world"); %>

<%=new Date() %>

</body>
</html>