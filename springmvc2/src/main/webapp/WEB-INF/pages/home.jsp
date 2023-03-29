<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Home JSP Page - RS</h1>



<h2>Employee is : ${EMPNAME} </h2>

<h2>Names : </h2>

<c:forEach items="${NAMES}" var="item">
  <h2>Name : ${item}</h2>
</c:forEach>


</body>
</html>