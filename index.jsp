<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management</title>
<link rel="stylesheet" href="css/bootstrap.css">
<style>
body {
	padding-top: 70px;
	padding-bottom: 30px;
	background-color: #f5f5f5;
}

.jumbotron {
	background-color: #ffffff;
	border-radius: 0;
	padding: 60px 30px;
	margin-bottom: 0;
}

footer {
	background-color: #333333;
	color: #ffffff;
	padding: 10px 0;
}
</style>
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Employee Management</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarColor01"
					aria-controls="navbarColor01" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarColor01">
					<ul class="navbar-nav me-auto">
						<li class="nav-item"><a class="nav-link active"
							href="index.jsp">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="#">About</a></li>
						<li class="nav-item"><a class="nav-link"
							href="Admin/employee_reg_form.jsp">Register</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<main>
		<div class="container">
			<div class="jumbotron">
				<h1 class="display-4">Welcome to Employee Management</h1>
				<p class="lead">Manage your employees with ease and efficiency.</p>
				<hr class="my-4">
				<p>Use our intuitive interface to add, edit, and delete employee
					records.</p>
				<p class="lead">
					<a class="btn btn-primary btn-lg"
						href="Admin/employee_reg_form.jsp" role="button">Register
						Employee</a>
				</p>
			</div>
		</div>
	</main>
	<footer class="fixed-bottom bg-primary text-white">
		<div class="container text-center">
			<p>
				&copy;
				<%=java.time.LocalDate.now().getYear()%>
				Employee Management
			</p>
		</div>
	</footer>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz4fnFO9gybBud7TlRbs/ic4AwGcFZOxg5DpPt8EgeUIgIwzjWfXQKWA3"
		crossorigin="anonymous"></script>
	<script