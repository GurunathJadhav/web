<%@ include file="navbar.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
<!-- Bootstrap CSS for styling -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>


<div class="container mt-4">
    <h2>Employee Details</h2>
    <%
        // Retrieve the ResultSet from the request attribute
        ResultSet result = (ResultSet) request.getAttribute("details");
        if (result != null) {
    %>
    <table class="table table-bordered table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Salary</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
        <%
            // Iterate through the ResultSet and display employee details
            while (result.next()) {
        %>
            <tr>
                <td><%= result.getInt("id") %></td>
                <td><%= result.getString("first_name") %></td>
                <td><%= result.getString("last_name") %></td>
                <td><%= result.getString("email") %></td>
                <td><%= result.getDouble("salary") %></td>
                 <td><a href="delete?id=<%=result.getInt("id")%>">Delete</a></td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
    <%
        } else {
    %>
    <p>No employee details available.</p>
    <%
        }
    %>
    
    <div class="mt-3">
                <%
                if (request.getAttribute("status") != null) {
                    out.print("<div class='alert alert-info'>" + request.getAttribute("status") + "</div>");
                }
                %>
            </div>
</div>

<!-- Bootstrap JS for responsiveness -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
