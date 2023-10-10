<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "jstl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Temple</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar bg-primary" data-bs-theme="dark">
		<ul class="nav justify-content-end">
		<h1 style="font-style: italic;">This is Temple Page...!</h1>
			<li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
			<li class="nav-item"><a class="nav-link active" href="Temple.jsp">vegatable</a></li>
		</ul>
	</nav>
	<h1>This is Vegetable Success JSP</h1>
	id is ${key1 }
	name is ${key2 }
	price is ${key3 }
	weight is ${key4 }
	
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>