<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><bean:message key="userRegistration.title"/></title>
</head>
<body>
<div align="center"><h1><bean:message key="userRegistration.title"/></h1></div>
<ul>
<html:errors/>
</ul>
<table>
	<html:form action="userRegistration">
	<tr>
		<td><bean:message key="userRegistration.userName"/></td>
		<td><html:text property="userName"></html:text></td>
	</tr>
	<tr>
		<td><bean:message key="userRegistration.logName"/></td>
		<td><html:text property="logName"></html:text></td>
	</tr>
	<tr>
		<td><bean:message key="userRegistration.password"/></td>
		<td><html:password property="password"></html:password></td>
	</tr>
	<tr>
		<td><bean:message key="userRegistration.password"/></td>
		<td><html:password property="passwordCheck"></html:password></td>
	</tr>
	<tr>
		<td><bean:message key="userRegistration.email"/></td>
		<td><html:text property="email"></html:text></td>
	</tr>
	<tr>
		<td><bean:message key="userRegistration.phone"/></td>
		<td><html:text property="phone"></html:text></td>
	</tr>
	<tr>
		<td><bean:message key="userRegistration.fax"/></td>
		<td><html:text property="fax"></html:text></td>
	</tr>
	<tr>
		<td><html:submit/></td>
		<td><html:cancel/></td>
	</tr>
	</html:form>
</table>

</body>
</html>