<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
<link rel="stylesheet" href="../css/bootstrap.css">
</head>
<body>
	<div class="container mt-5">
		<h2>Delete Employee</h2>
		<%-- Handle deletion based on ID --%>
		<% 
            int employeeId = Integer.parseInt(request.getParameter("id"));
        %>
		<div class="alert alert-success" role="alert">
			Employee with ID
			<%= employeeId %>
			deleted successfully.
		</div>
		<a href="viewEmployees.jsp" class="btn btn-primary">Back to
			Employee List</a>
	</div>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
