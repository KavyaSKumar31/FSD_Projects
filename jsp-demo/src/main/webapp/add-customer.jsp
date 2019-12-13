<!DOCTYPE h2 PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.List"%>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>add customer</title>
</head>
<body>


	<%
		List<String> list = (List<String>) request.getAttribute("errors");
		if (list != null) {
			for (String str : list) {
				out.println(str + "<br/>");
			}

		}
	%>

	<form class="text-center border border-light p-5"
		action="controller.do">

		<p class="h4 mb-4">Customer Form</p>


		<input type="text" id="defaultContactFormName"
			class="form-control mb-4" placeholder="first Name" name="fName">

		<input type="text" id="defaultContactFormName"
			class="form-control mb-4" placeholder="last Name" name="lName">
		<input type="text" id="defaultContactFormName"
			class="form-control mb-4" placeholder="email" name="email">


		<button class="btn btn-info btn-block" type="submit">Add
			Customer</button>

	</form>
</body>
</html>
