<html><%@page language="java" contentType="text/html" import="java.util.*" import ="com.main.registration.servlets.User" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>View Page</title>
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
h2 {
	font-size: 30px;
	color: green;
	text-align: center;
}

#bg {
	background-size: 1300px 700px;
	background-repeat: no-repeat;
	background-position: top;
	background-attachment: fixed;
}

a {
	font-size: 20px;
	font-family: "Arial Black";
	color: gold;
}
</style>
<body style="background-color: white;">
<%List<User> users = (List<User>)request.getAttribute("listUser");
	request.setAttribute("users", users);
	String msg = (String)request.getAttribute("msg");
	request.setAttribute("ms", msg);%>
	<h2><c:out value="${ms}" /></h2>
	<h1>Registered Person</h1>
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
					<th>Action</th>
				</tr>
				<c:forEach items = "${users}" var="user">
				<tr>
					<td><c:out value="${user.email}" /></td>
					<td><c:out value="${user.getUsername()}" /></td>
					<td><c:out value="${user.getPassword()}" /></td>
					<td><c:out value="${user.getMobileNo()}" /></td>
					<td><c:out value="${user.getTotalQual()}" /></td>
					<td><c:out value="${user.gender}" /></td>
					<td><c:out value="${user.totalTech}" /></td>
					<td><c:out value="${user.country}" /></td>
					<td><c:out value="${user.totalAddrs}" /></td>
					<td><c:out value="${user.review}" /></td>
					<td>
					    <a href="edit.jsp?username=<c:out value='${user.username}'/>">Edit</a>
					    &nbsp;&nbsp;&nbsp;&nbsp;
					    <a href="ViewServlet?linkName=delete&username=<c:out value='${user.username}' />">Delete</a>
					</td>
				</tr>
				</c:forEach>
			</table>
			<center>
			<a
				href="Home.html"><input type="button" value="Home"></a>
			</center>
		</div>
</body>
</html>