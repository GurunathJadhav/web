<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="reg" method="post">

<input type="text" name="name" />
<button type="submit">Save</button>
</form>

<%
	if(request.getAttribute("name")!=null){
		out.print(request.getAttribute("name"));
	}
%>

</body>
</html>