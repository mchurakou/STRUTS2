<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <title>Register</title>
    <s:head/>
</head>
<body>
<h3>Register for a prize by completing this form.</h3>

<s:form action="register">

    <s:textfield key="firstName"/>
    <s:textfield key="lastName"/>
    <s:textfield key="email"/>
    <s:textfield key="age"/>
    <s:select key="sport" list="sports"/>
    <s:radio key="gender" list="genders"/>
    <s:select key="residency" list="states" listKey="stateAbbr" listValue="stateName"/>
    <s:checkbox key="over21"/>
    <s:checkboxlist key="carModels" list="carModelsAvailable"/>

    <s:submit/>

</s:form>

</body>
</html>