<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css">
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">

<h1 class="text-center">Welcome to Todo manager</h1>

<div class="row mt-5">

<div class="col-md-3">
	<div class="list-group">
	  <a href='<c:url value="/home"></c:url>' class="list-group-item list-group-item-action active" aria-current="true">Menu</a>
	  <a href='<c:url value="/addtodo"></c:url>' class="list-group-item list-group-item-action">Add Todo</a>
	  <a href='<c:url value="/home"></c:url>' class="list-group-item list-group-item-action">View Todo</a>
	</div>
</div>

<div class="col-md-9">

<c:if test="${screenName=='home'}">
<h2>View all todo</h2>
</c:if>

<c:if test="${screenName=='addtodo'}">
<h2>add todo</h2>
</c:if>

</div>


</div>


</div>

</body>
</html>