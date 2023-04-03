<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<link href="<c:url value="/resources/css/createproduct.css"></c:url>" rel="stylesheet" >

</head>
<body>

	<form action="savenewproduct" method="post">
	
	<div class="card container marginbox">
	  <div class="card-body">
	    <h5 class="card-title">Create Product</h5>
	    	<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Product Name</label> 
				  <input type="text" class="form-control" name="productname"
					id="exampleFormControlInput1" placeholder="enter product name">
			</div>
			
			<div class="mb-3">
				<label for="exampleFormControlTextarea1" class="form-label">Product Desc</label>
				<input type="text" class="form-control" id="exampleFormControlTextarea1" name="productdesc" style="min-height: 100px;"
					 placeholder="enter product desc"></input>
			</div>
			
			<div class="mb-3">
				<label  for="exampleFormControlInput2" class="form-label">Product Price</label> 
				  <input style="width:50%"  type="number" class="form-control" name="productprice"
					id="exampleFormControlInput2" placeholder="enter product price">
			</div>

	  </div>
	</div>
	
	<div class="text-center" >
	  <button type="submit" class="btn btn-outline-primary">Create</button>
	</div>
	
	</form>

</body>
</html>