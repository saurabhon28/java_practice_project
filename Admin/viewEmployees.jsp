<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
<link rel="stylesheet" href="../css/bootstrap.css">
<style>
.btn-action {
	margin-right: 5px;
}
</style>
</head>
<body>
	<div class="container mt-5">
		<h2>Employee Details</h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Employee ID</th>
					<th>Full Name</th>
					<th>Email</th>
					<th>Phone Number</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<%-- Example data (replace with actual data retrieval logic) --%>
				<% for (int i = 1; i <= 5; i++) { %>
				<tr>
					<td><%= i %></td>
					<td>John Doe <%= i %></td>
					<td>john<%= i %>@example.com
					</td>
					<td>123456789<%= i %></td>
					<td><a href="editEmployee.jsp?id=<%= i %>"
						class="btn btn-primary btn-action">Edit</a> <a
						href="deleteEmployee.jsp?id=<%= i %>"
						class="btn btn-danger btn-action">Delete</a></td>
				</tr>
				<% } %>
			</tbody>
		</table>
		<p>
			<a href="employee_reg_form.jsp" class="btn btn-primary">Back to
				Form</a>
		</p>
	</div>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
