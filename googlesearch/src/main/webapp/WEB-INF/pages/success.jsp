<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Name : ${studentVO.stud_name}</h1>
<h1>Email : ${studentVO.stud_email}</h1>

<h1>Street : ${studentVO.address.street}</h1>

<!-- Class r object ta always camalcase e create hbe..1st letter small
Pojo class name is : StudentVO ,  so object name is :: studentVO
 -->

</body>
</html>