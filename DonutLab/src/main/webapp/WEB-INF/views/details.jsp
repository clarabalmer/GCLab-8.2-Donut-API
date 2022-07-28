<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${donut.name} Details</title>
</head>
<body>
	<h1>Donut</h1>
	Name: ${donut.name} <br>
	Calories: ${donut.calories}<br>
	Extras: <br>
	<ul>
		<c:forEach var="unit" items="${donut.extras}">
			<li>${unit}</li>
		</c:forEach>
	</ul>
	<a href="/">Home</a><br>
	<img src="${donut.photo}" alt="GIANT Photo of ${donut.name}" width="3000" height="3000">
</body>
</html>