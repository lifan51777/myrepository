<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><bean:message key="registration.success"/></title>
</head>
<body>
<h1>
<bean:message key="registration.success"/>
</h1>
<table>
	<tr>
		<td><bean:message key="userRegistration.userName"/></td>
		<td><bean:write name="user" property="userName"/></td>
	</tr>
	<tr>
		<td><bean:message key="userRegistration.logName"/></td>
		<td><bean:write name="user" property="logName"/></td>
	</tr>
	<tr>
		<td><bean:message key="userRegistration.email"/></td>
		<td><bean:write name="user" property="email"/></td>
	</tr>
	<tr>
		<td><bean:message key="userRegistration.phone"/></td>
		<td><bean:write name="user" property="phone"/></td>
	</tr>
	<tr>
		<td><bean:message key="userRegistration.fax"/></td>
		<td><bean:write name="user" property="fax"/></td>
	</tr>
</table>
<html:link forward="display">所有用户</html:link>
</body>
</html>