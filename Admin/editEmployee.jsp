<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>
<link rel="stylesheet" href="../css/bootstrap.css">
</head>
<body>
	<div class="container mt-5">
		<h2>Edit Employee</h2>
		<%-- Fetch employee details based on ID --%>
		<%-- Example: Replace with actual data retrieval logic --%>
		<% 
            int employeeId = Integer.parseInt(request.getParameter("id"));
            String fullName = "John Doe " + employeeId;
            String email = "john" + employeeId + "@example.com";
            String phone = "123456789" + employeeId;
        %>
		<form method="post" action="updateEmployee.jsp">
			<input type="hidden" name="id" value="<%= employeeId %>" />
			<div class="form-group">
				<label for="fullName">Full Name</label> <input type="text"
					class="form-control" id="fullName" name="fullName"
					value="<%= fullName %>" required>
			</div>
			<div class="form-group">
				<label for="email">Email</label> <input type="email"
					class="form-control" id="email" name="email" value="<%= email %>"
					required>
			</div>
			<div class="form-group">
				<label for="phone">Phone Number</label> <input type="text"
					class="form-control" id="phone" name="phone" value="<%= phone %>"
					required>
			</div>
			<button type="submit" class="btn btn-primary">Update</button>
			<a href="viewEmployees.jsp" class="btn btn-secondary">Cancel</a>
		</form>
	</div>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
