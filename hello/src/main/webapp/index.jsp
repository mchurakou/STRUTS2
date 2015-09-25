<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Basic Struts 2 Application - Welcome</title>
    <s:head/>
</head>
<body>
<h1><s:text name="greeting"/></h1>

<a href="<s:url action="index" namespace="config-browser" />">Launch the configuration browser</a>

<s:url action="hello" var="helloLink">
    <s:param name="name">Bruce Phillips</s:param>
</s:url>

<p><a href="${helloLink}">Hello World</a></p>


<a href="<s:url action="fileForm" />">File page</a>


<h4>Enter your name </h4>
<s:form action="hello">
    <s:textfield name="name" label="Your name"/>
    <s:submit value="Submit"/>
</s:form>

<s:url action="registerInput" var="registerInputLink">
    <s:param name="request_locale">en</s:param>
</s:url>

<s:url action="legacy!go" var="legacyLink">
    <s:param name="formName">GOODNAME</s:param>
</s:url>

<p><a href="${legacyLink}">Legacy</a></p>
<p><a href="legacy.do?method:go">Legacy2</a></p>



<p><a href="${registerInputLink}">Please register</a> for our prize drawing.</p>

<h3>Registro español</h3>
<s:url action="registerInput" var="registerInputLinkES">
    <s:param name="request_locale">es</s:param>
</s:url>
<p><a href="${registerInputLinkES}">Por favor, regístrese</a> para nuestro sorteo</p>

</body>
</html>