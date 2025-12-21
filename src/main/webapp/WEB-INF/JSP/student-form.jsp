<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

	<h2>Student Form</h2>

	<!-- http://localhost:8080/RadheySpringMvc/ -->
	<form action="${pageContext.request.contextPath}/getstu"
		method="post">
		<label for="name">Name:</label>
		<input type="text" id="name"name="name" />
		<br /> <br /> 
		<label for="department">Department:</label>
		<input type="text" id="department" name="department" />
		<br /> <br />
		 <label for="age">Age:</label> 
			<input type="number" id="age" name="age" />
			<br /><br />
			<label for="mark">Mark:</label>
		<input type="number" id="mark"name="mark" />
		<br /> <br /> 
		<label for="address">Address:</label>
		<input type="text" id="address" name="address" />
		<br /> <br />
		 <label for="phnum">PH:</label> 
			<input type="number" id="phnum" name="phnum" />
			<br /><br />
		<button type="submit">Submit</button>
	</form>

</body>
</html>