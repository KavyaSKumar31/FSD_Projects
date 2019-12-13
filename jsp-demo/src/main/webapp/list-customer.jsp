
<!DOCTYPE html>



<%@ page contentType="text/html" isELIgnored="false"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html" isELIgnored="false"%>
<html lang="en">
<head>
<title>list all customer</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

</head>
	
<body>


	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">


			<input type="button" value="Add Customer"
				onclick="window.location.href='add-customer.jsp'; return false;"
				class="add-button" />
		</div>
	</div>

	<div class="container">
		<h2>Customer Details</h2>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>



				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
	</div>

</body>
</html>
