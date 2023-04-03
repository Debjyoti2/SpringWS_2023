<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/976ac8ac6d.js" crossorigin="anonymous"></script>
</head>
<body>

<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand h4" href="#">Product List</a>
  </div>
</nav>


<div class="container">

<c:if test="${successmsg!=null}">
<div class="alert alert-success" role="alert">
 ${successmsg}
</div>
</c:if>

 <table class="table table-striped table-hover" style="margin-top:20px;margin-bottom:40px;">
    <thead>
    <tr>
      <th scope="col">ProductId</th>
      <th scope="col">Product Name</th>
      <th scope="col">Product Desc</th>
      <th scope="col">Product Price</th>
      <th scope="col">Product Created On</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  
   <tbody>
    <c:forEach var="i"  items="${productList}">
      <tr>
        <td scope="row">${i.productid}</td>
        <td scope="row">${i.productname}</td>
        <td scope="row">${i.productdesc}</td>
        <td scope="row">${i.productprice}</td>
        <td scope="row">${i.productCreationDate}</td>
        <td scope="row">
         <span><a href="editproduct/${i.productid}"><i class="fa-solid fa-pen-to-square"></i></a></span>
         <span style="margin-left:10px;"><a href="deleteproduct/${i.productid}"><i class="fa-solid fa-trash"></i></a></span>
        </td>
      </tr>
    </c:forEach>
	
  </tbody>
  
  
</table> 

<div class="text-center">
 <a class="btn btn-outline-primary" type="button" role="button" href="createproduct">Create New Product</a>
</div>


</div>

</body>
</html>