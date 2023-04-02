<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/style.css"></c:url>" rel="stylesheet">
</head>
<body>

<h1>${msg}</h1>
<img class="photoboxBig" alt="img" src="<c:url value="/resources/images/${filename}"></c:url>">

</body>
</html>