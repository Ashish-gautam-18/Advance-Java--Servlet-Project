<%@page language="java" contentType="text/html" import="java.util.*" import ="com.main.registration.servlets.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit User</title>
<style>
form {
	margin-top: 7%;
	background-color: aquamarine;
	padding: 20px;
	width: 50%;
	border-radius: 20px;
	border: 3px blue solid;
}
center{
	font-size: 15px;
	font-family: "Arial Black";
	color: blue;
}
body {
	background-image: url("sp4.jpg");
	background-color: aquamarine;
}
h1 {
	text-align: center;
	font-size: 40px;
	font-family: bold;
	color: #ff1a75;
    border: 1px solid rgb(69, 7, 40);
    background-color:rgb(69, 7, 40);
    height: 60px;
}
input {
	font-size: 12px;
	font-family: "Arial Black";
	color: black;
}
label {
	font-size: 15px;
	font-family: "Arial Black";
	color: blue;
}
</style>
</head>
<body>
	<%
		String username = request.getParameter("username");
	%>
	<center>
	<h1>Edit User: <%= username %></h1>
	<form action="./ViewServlet" method="GET">
	<input type="hidden" name="linkName" value="edit" />
		<table>
				<tr>
					<td><label>Current Username:</label></td>
					<td><input type="text" placeholder="<%= username %>" name="uname" value="<%= username %>" readonly="readonly"></td>
				</tr>
				<tr>
					<td><label>Email:</label></td>
					<td><input type="text" placeholder="Enter Email" name="email"></td>
				</tr>
				<tr>
					<td><label>New Username:</label></td>
					<td><input type="text" placeholder="Enter Username"
						name="username"></td>
				</tr>
				<tr>
					<td><label>Password:</label></td>
					<td><input type="password" placeholder="Enter Password"
						name="password"></td>
				</tr>
				<tr>
					<td><label>Number:</label></td>
					<td><input type="text" placeholder="Enter Mobile Number"
						name="number"></td>
				</tr>
		</table>
		<input type="submit" value="Save">
	</form>
	</center>
</body>
</html>
