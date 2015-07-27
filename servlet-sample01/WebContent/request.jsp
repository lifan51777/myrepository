<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="org.fanfan.util.StringUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="stringUtil" class="org.fanfan.util.StringUtil" scope="page"></jsp:useBean>
<%
	String name = request.getParameter("name"); 
	name = StringUtil.getUTFString(name);
	session.setAttribute("name", name);
%>

<%=name %>

<!-- <form action="session.jsp" method = "post">
	<input type="submit" value="跳转">
</form> -->

<!-- <a href = "session.jsp">跳转</a> -->
<%if(name.equals("中国")){ %>
	<jsp:forward page="session.jsp"/>
<%
}else{
	out.print("hello world");
}
%>
</body>
</html>