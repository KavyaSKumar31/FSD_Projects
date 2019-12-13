

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success page</title>
</head>
<body>
<%

	Customer customer=(Customer)request.getAttribute("success");
	out.println("First Name: "+customer.getFirstName());

%>
</body>
</html>