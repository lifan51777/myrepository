<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><bean:message key="userRegistrationList.title"/></title>
</head>
<body>
<div align="center" style="font-size:20px"><bean:message key="userRegistrationList.title"/></div>
<table border="1">
	<tr>
		<td><bean:message key="userRegistration.userName"/></td>
		<td><bean:message key="userRegistration.logName"/></td>
		<td><bean:message key="userRegistration.email"/></td>
		<td><bean:message key="userRegistration.phone"/></td>
		<td><bean:message key="userRegistration.fax"/></td>
	</tr>
	
	<logic:iterate id="user" name="users">
	<tr>
		<td><bean:write name="user" property="userName"/></td>
		<td><bean:write name="user" property="logName"/></td>
		<td><bean:write name="user" property="email"/></td>
		<td><bean:write name="user" property="phone"/></td>
		<td><bean:write name="user" property="fax"/></td>
	</tr>
	</logic:iterate>
</table>
</body>
</html>