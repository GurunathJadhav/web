<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h3 class="text-center mb-4">Registration Form</h3>
            <form action="reg" method="post" class="card p-4 shadow">
                <div class="mb-3">
                    <label for="id" class="form-label">ID</label>
                    <input type="text" name="id" class="form-control" id="id" required>
                </div>
                <div class="mb-3">
                    <label for="first_name" class="form-label">First Name</label>
                    <input type="text" name="first_name" class="form-control" id="first_name" required>
                </div>
                <div class="mb-3">
                    <label for="last_name" class="form-label">Last Name</label>
                    <input type="text" name="last_name" class="form-control" id="last_name" required>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" name="email" class="form-control" id="email" required>
                </div>
                <div class="mb-3">
                    <label for="salary" class="form-label">Salary</label>
                    <input type="text" name="salary" class="form-control" id="salary" required>
                </div>
                <button type="submit" class="btn btn-primary w-100">Save</button>
            </form>

            <!-- Status message -->
            <div class="mt-3">
                <%
                if (request.getAttribute("status") != null) {
                    out.print("<div class='alert alert-info'>" + request.getAttribute("status") + "</div>");
                }
                %>
            </div>
        </div>
    </div>
</div>


</body>
</html>