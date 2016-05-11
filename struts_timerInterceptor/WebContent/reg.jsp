<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Interceptor unity</title>
</head>
<body>
	<h1>user registion</h1>
	<s:form id="id" action="helloaction">
		<s:textfield name="username" label="username"></s:textfield>
		<s:password name="pass1" label="password"></s:password>
		<s:password name="pass2" ;label="reinput password"></s:password>
		<s:submit value="regestion"></s:submit>
	</s:form>
</body>
</html>