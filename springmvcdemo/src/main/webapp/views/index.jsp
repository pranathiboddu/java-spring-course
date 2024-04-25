<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding ="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hi</title>
</head>
<body>
Welcome to Spring course

<form action ="addAlien">
	
	Enter your id : <input type="text" name="id"><br>
	<br>
	Enter your name : <input type="text" name="name"><br>
	<input type ="submit">	
</form>
<hr>
<form action ="getAlien">
	Enter your id : <input type="text" name="id"><br>
	<input type="submit"><br>
	
</form>
<hr>
<form action ="getAlienByName">
	Enter your name : <input type="text" name="name"><br>
	<input type="submit"><br>
	
</form>
	
	
	
</body>
</html>