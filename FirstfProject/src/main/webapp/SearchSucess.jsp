<%@page language="java" contentType="text/html" import="java.util.*" import ="com.main.registration.servlets.User" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Search Result</title>
</head>
<style>
th, td {
	padding: 10px 20px;
	text-align: center;
	color: blue;
}

h1 {
	font-size: 50px;
	color: red;
	text-align: center;
}

#bg {
	background-size: 1300px 700px;
	background-repeat: no-repeat;
	backgrou nd-position: top;
	background-attachment: fixed;
}

a {
	font-size: 20px;
	font-family: "Arial Black";
	color: gold;
}
</style>
<body style="background-color: white;">
<%User user = (User)request.getAttribute("user");
	request.setAttribute("us", user);%>
	<h1>Searched Person</h1>
		<div align="center">
			<table border=2px>
				<tr>
					<th>Email</th>
					<th>Username</th>
					<th>Password</th>
					<th>Number</th>
					<th>Qualification</th>
					<th>Gender</th>
					<th>Technologies</th>
					<th>Country</th>
					<th>Address</th>
					<th>Review</th>
				</tr>
				<tr>
					<td><c:out value="${us.email}" /></td>
					<td><c:out value="${us.getUsername()}" /></td>
					<td><c:out value="${us.getPassword()}" /></td>
					<td><c:out value="${us.getMobileNo()}" /></td>
					<td><c:out value="${us.getTotalQual()}" /></td>
					<td><c:out value="${us.gender}" /></td>
					<td><c:out value="${us.totalTech}" /></td>
					<td><c:out value="${us.country}" /></td>
					<td><c:out value="${us.totalAddrs}" /></td>
					<td><c:out value="${us.review}" /></td>
				</tr>
			</table>
			<center>
			<a
				href="Home.html"><input type="button" value="Home"></a>
			</center>
		</div>
</body>
</html>
