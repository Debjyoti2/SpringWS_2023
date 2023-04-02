<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<link href="<c:url value="/resources/css/style.css"></c:url>" rel="stylesheet">

</head>
<body>

<div class="container">
<form action="submitform" method="post">

<div class="card bgstyle" style="margin-top:20px;padding-bottom:20px;">
  <div class="card-body">
    <h5 class="card-title">Student Login Form</h5>
    <img class="photobox" alt="myPic" src="<c:url value="/resources/images/Photo.png"></c:url>">
   
	<div class="mb-3">
	  <label for="name" class="form-label">Name</label>
	  <input type="text" class="form-control" id="name" name="stud_name" placeholder="enter name">
	</div>
	
	<div class="mb-3">
	  <label for="email" class="form-label">Email address</label>
	  <input type="text" class="form-control" id="email" name="stud_email" placeholder="enter email">
	</div>
	
	<div class="mb-3">
	  <label for="password" class="form-label">Password</label>
	  <input type="password" class="form-control" id="password" name="stud_password" placeholder="enter password">
	</div>
	
	<div class="mb-3 dropdown">
	  <label for="courses" class="form-label">Courses</label>
	 <select class="form-select" aria-label="select Courses" name="stud_courses">
	  <option  value="Java" selected>Java</option>
	  <option value="Spring">Spring</option>
	  <option value="Python">Python</option>
	  <option value="Jdbc">Jdbc</option>
	</select>
	</div>
	
	<div class="mb-3">
	  <label for="dob" class="form-label">DOB</label>
	  <input type="date" class="form-control" name="stud_dob" placeholder="dd/MM/yyyy">

	</div>
	
	<div class="mb-3">
	<label for="agerange" class="form-label">Age Range</label>
	  <div class="form-check">
	  <input class="form-check-input" type="radio" name="stud_age_range" value="20-30" id="age_range_id" checked>
	  <label class="form-check-label" for="age_1">
	    20-30
	  </label>
	 </div>
	
	  <div class="form-check">
	  <input class="form-check-input" type="radio" name="stud_age_range" value="30-40" id="age_range_id">
	  <label class="form-check-label" for="age_2">
	    30-40
	  </label>
	  </div>
	  
	  <div class="form-check">
	  <input class="form-check-input" type="radio" name="stud_age_range"  value="40-50" id="age_range_id">
	  <label class="form-check-label" for="age_2">
	    40-50
	  </label>
	  </div>
	  
	</div>
	
	<div class="mb-3">
	 <label for="degrees" class="form-label">Select Qualifications</label>
		<select class="form-select" name="stud_degrees" multiple aria-label="multiple select example">
		  <option value="X">X</option>
		  <option value="XII">XII</option>
		  <option value="BTech">BTech</option>
		   <option value="MTech">MTech</option>
		</select>
	</div>
	
	
	<div class="mb-3">
	 <label for="agree" class="form-label">I Agree with Conditions</label>
		<div class="form-check">
		  <input class="form-check-input" type="checkbox" name="stud_conditions" value="agree" id="agree">
		  <label class="form-check-label" for="agree">
		    I Agree with Conditions
		  </label>
		</div>
	</div>
	
	<div class="card" style="width: 18rem;">
	  <div class="card-body">
	    <h5 class="card-title">Provide Address</h5>
	    
	    <div class="mb-3">
		  <input class="form-control" type="text" name="address.street" id="street">
		  <label class="form-check-label" for="street">
		   Street
		  </label>
	    </div>
	    
	    <div class="mb-3">
		  <input class="form-control" type="text" name="address.city" id="city">
		  <label class="form-check-label" for="city">
		   City
		  </label>
	    </div>
	  
	  
	</div>

  </div>
  
  	<div class="text-center"><button type="submit" class="btn btn-primary">Submit</button></div>
  
</div>

</form>

</div>

</body>
</html>