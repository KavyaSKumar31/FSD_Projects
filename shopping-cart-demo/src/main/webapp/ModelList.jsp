<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Model List</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body>
	<p>
		<font size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Model
				List </strong></font>
	</p>
	<a href="ShoppingCart.jsp">View Cart</a>
	<p />
	<table width="75%" border="1">
		<tr>
			<td><form method="POST" action="CartController">
					<strong>Model:</strong> TF-Model1<input type="hidden"
						name="modelNo" value="TF-MODEL1"> <strong>Description:</strong>
					Model 1 <input type="hidden" name="description" value="Model 1">
					<strong>Quantity:<input type="text" size="2" value="1"
						name="quantity"></strong> <strong>Price:</strong> $10.00 <input
						type="hidden" name="price" value="10"> <input
						type="hidden" name="action" value="add"> <input
						type="submit" name="addToCart" value="Add To Cart">
				</form></td>
			<td>
				<form  method="POST" action="CartController">
					<strong>Model:</strong> TF-Model2 <input type="hidden"
						name="modelNo" value="TF-MODEL2"> <strong>Description</strong>Model2
					<input type="hidden" name="description" value="Model 2">
					</p>
					<strong>Quantity</strong><input type="text" size="2" value="1"
						name="quantity"> <strong>Price</strong>$20.00 <input
						type="hidden" name="price" value="20"> <input
						type="hidden" name="action" value="add"> <input
						type="submit" name="addToCart" value="Add To Cart">
				</form>
			</td>
		</tr>
		<tr>
			<td><form method="POST" action="CartController">
					<strong>Model:</strong> TF-Model3<input type="hidden"
						name="modelNo" value="TF-MODEL3"> <strong>Description:</strong>
					Model 1 <input type="hidden" name="description" value="Model 3">
					<strong>Quantity:<input type="text" size="2" value="1"
						name="quantity"></strong> <strong>Price:</strong> $30.00 <input
						type="hidden" name="price" value="30"> <input
						type="hidden" name="action" value="add"> <input
						type="submit" name="addToCart" value="Add To Cart">
				</form></td>
			<td>
				<form  method="POST" action="CartController">
					<strong>Model:</strong> TF-Model4 <input type="hidden"
						name="modelNo" value="TF-MODEL4"> <strong>Description</strong>Model2
					<input type="hidden" name="description" value="Model 4">
					</p>
					<strong>Quantity</strong><input type="text" size="2" value="1"
						name="quantity"> <strong>Price</strong>$40.00 <input
						type="hidden" name="price" value="40"> <input
						type="hidden" name="action" value="add"> <input
						type="submit" name="addToCart" value="Add To Cart">
				</form>
			</td>
		</tr>
	</table>
	<p></p>
</body>
</html>