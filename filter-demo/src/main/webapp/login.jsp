<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login.do" method="post">
	<label for="input-1">User Name:</label>
	<input id="input-1" name="uName" placeholder="user name" type="text"/>
<br/>
<label for="input-2">Password</label>
<input id="input-2" name="uPassword" placeholder="password" required="true" type="password"/>
<br/>
<input type="submit" value="Login"/>

</form>
</body>
</html>