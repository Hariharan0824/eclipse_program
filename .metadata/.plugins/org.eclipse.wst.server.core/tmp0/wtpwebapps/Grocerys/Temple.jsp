<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>XWORKZ</title>
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
	
	<h1>WELCOME TO Temple PAGE..... </h1>
	
	
	<form action="temple" method="post">
		<div class="mb-3">
			<label for="name" class="form-label">Name</label> <input type="text"
				class="form-control" id="name" placeholder="your name" name="name">
		</div>
		<div class="mb-3">
			<label for="place" class="form-label">Place</label> <input type="text"
				class="form-control" id="name" placeholder="your place" name="place">
		</div>
		<div class="mb-3">
			<label for="MainGod" class="form-label">MainGod</label> <input type="text"
				class="form-control" id="name" placeholder="your GOD" name="god">
		</div>
         <div class="mb-3">
			<label for="ConstYear" class="form-label">Year</label> <input type="number"
				class="form-control" id="Year" placeholder="Enter Year" name="Year">
		</div>
        <div class="mb-3">
			<label for="ConstBy" class="form-label">ConstBy</label> <input type="text"
				class="form-control" id="ConstBy" placeholder="Enter your ConstBy" name="ConstBy">
		</div>
		</lable>
		<button type="submit" value="save" class="btn btn-primary">save</button>
	</form>
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>



</body>
</html>