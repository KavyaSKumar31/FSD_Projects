<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EMS</title>
</head>
<body>
	<h2>EMS</h2>
<table>
<tr>
<td>first name</td>
<td>last name</td>
<td>email</td>
</tr>
<c:forEach var="employee" items="${employees}">
<tr>
<td>${employee.firstName}</td>
<td>${employee.lastName}</td>
<td>${employee.emailName}</td>
</tr>
</c:forEach>
</table>

</body>
</html>