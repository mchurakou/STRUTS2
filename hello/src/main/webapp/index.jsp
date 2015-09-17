<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<h1>Welcome To Struts 2!</h1>

<s:url action="hello" var="helloLink">
    <s:param name="name">Bruce Phillips</s:param>
</s:url>

<p><a href="${helloLink}">Hello World</a></p>

<h4>Enter your name </h4>
<s:form action="hello">
    <s:textfield name="name" label="Your name"/>
    <s:submit value="Submit"/>
</s:form>

<p><a href="register.jsp">Please register</a> for our prize drawing.</p>
</body>
</html>