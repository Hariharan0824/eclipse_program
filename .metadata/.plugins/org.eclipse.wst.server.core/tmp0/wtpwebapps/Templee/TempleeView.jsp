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
<form action="templeeview" method="post">
	<nav class="navbar bg-primary" data-bs-theme="dark">
		<ul class="nav justify-content-end">
		
			<li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
			<li class="nav-item"><a class="nav-link active" href="Temple.jsp">Temple</a></li>
		</ul>
	</nav>
	<div>
	<table class=border=2>
	<tr>
	<th>Name</th>
	<th>place</th>
	<th>mainGod</th>
	<tr>year</tr>
	<th>constBy</th>
	</tr>
	<tr>
	<td>${dto.name }</td>
	<td>${dto.place }</td>
	<td>${dto.mainGod }</td>
	<td>${dto.year }</td>
	<td>${dto.constBy }</td>
	</table>
	<jstl:foreach items="${view }" var="dto">
	${dto.name } ${dto.place }
	${dto }
	</jstl:foreach>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>