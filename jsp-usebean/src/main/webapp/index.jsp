<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Use Bean demo</title>
</head>
<body>

<form action="result.jsp" method="post">

	<label>President Name</label>
	<input name="presidentName" placeholder="presedent name" required="true" type="text"/>
	<br/>
	<label>President Age</label>
	<input  name="presidentAge" placeholder="presedent age" required="true" type="text"/>
	<br/>
	<label >Joining Date</label>
	<input name="joiningYear" placeholder="presedent joining year" required="true" type="text"/>
	<br/>
	<label >Release Date</label>
	<input name="releaseYear" placeholder="presedent release year" required="true" type="text"/>
	<br/>
	<input type="submit" value="New President"/>
</form>
</body>
</html>