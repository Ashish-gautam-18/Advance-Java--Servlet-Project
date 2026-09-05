<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<style>
div {
	margin-top: 40px;
}

.c1 {
	margin: 40px;
	border-radius: 50px;
	border: 1px solid black;
	background-color: rgb(255, 128, 128);
	color: rgb(0, 128, 255);
	padding: 10px 15px;
	text-decoration: none;
	display: table; 
	margin: 0 auto;
	display: table-cell;
}
.c2{background-color: rgb(255, 128, 128);
	color: rgb(0, 128, 255);
	text-decoration: none;
	display: table; 
	margin: 0 auto;
	display: table-cell;
	border:none;
	font-weight: bold;
}

.c1:hover {
	background-color: #00e6e6;
	color: white;
}
.c2:hover{
	background-color: #00e6e6;
	color: white;
}

h2 {
	font-size: 70px;
	font-family: sans-serif;
	font-style: oblique;
	font-style: bold;
	color: #ff00bf;
	text-shadow: 1px 1px 2px skyblue, 0 0 25px blue, 0 0 5px green;
}
h1 {
	font-size: 60px;
	color: lightgreen;
	text-align: center;
	text-shadow: 2px 2px white;
	}

.footer {
	margin-top: 100px;
	color: #00ffff;
	text-align: center;
	direction: right;
}

#bg {
	background-size: 1500px 700px;
	background-repeat: no-repeat;
	background-position: top;
	background-attachment: fixed;
}

input {
	font-size: 12px;
	font-family: "Arial Black";
	color: black;
	align-self: auto;
}
</style>
<body>
	<h1>You Entered Wrong Credentials</h1>
	<center>
		<b><h2>Sathya Technology</h2></b>
	<div class="container">
		<div>
			<jsp:include page="Home.html"></jsp:include>
		</div>
	</div>
	</center>
	<footer class="footer">
		<marquee>
			<h1>Welcome To Sathya Technology</h1>
		</marquee>
	</footer>
</body>
</html>