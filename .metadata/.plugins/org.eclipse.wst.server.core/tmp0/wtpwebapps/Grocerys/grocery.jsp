<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
	<style type="text/css">
body {
	background:
		<img src=""E:\Images\food.jpg"">
	background-repeat: no-repeat;
	background-size: cover;
}

</style>
	
</head>
<body>
	<nav class="navbar bg-primary" data-bs-theme="dark">
		<ul class="nav justify-content-end">
			<li class="nav-item">
			<a class="nav-link" href="index.jsp">Home</a>
			</li>

		</ul>
	</nav>
	
	<h1>WELCOME TO GROCERY PAGE..... </h1>
	
	<form action="grocery" method="post">
		<div class="mb-3">
			<label for="name" class="form-label">Name</label> <input type="text"
				class="form-control" id="name" placeholder="your name" name="name">
		</div>
		<select class="form-select" aria-label="Default select example" name="Type">
  <option selected>Select the Type</option>
  <option value="1">Earings</option>
  <option value="2">Bangls</option>
  <option value="3">Watch</option>
</select>
         <div class="mb-3">
			<label for="price" class="form-label">Price</label> <input type="number"
				class="form-control" id="name" placeholder="Enter Price" name="price">
		</div>
        <div class="mb-3">
			<label for="Quantity" class="form-label">Quantity</label> <input type="number"
				class="form-control" id="name" placeholder="Enter your Quantity" name="Quantity">
		</div>
		</lable>
		<button type="submit" value="Send" class="btn btn-primary">Send</button>
	</form>
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>



</body>
</html>