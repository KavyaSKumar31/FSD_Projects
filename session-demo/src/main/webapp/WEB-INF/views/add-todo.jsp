<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Todos</title>
</head>
<body>
	<nav class="navbar navbar-default">
		<ul class="nav navbar-nav navbar-right">
			<li><a href="logout.do">Logout</a></li>
		</ul>
	</nav>
	<div class="container">
		Your New Action Item:
		<form method="POST" action="add-todo.do">
			New Todo : <input name="todo" type="text" />
			 <input name="add" type="submit" />
		</form>
	</div>
</body>
</html>
