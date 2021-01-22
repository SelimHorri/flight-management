<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>Navbar_page</title>
</head>

<body>

	<!-- ******************** NavVar ***************** -->

	<!-- 
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="/demo_pack/">Logo</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
						<li class="active"><a href="index.jsp">Home</a></li>
						<li><a href="#">About</a></li>
						<li><a href="#">Projects</a></li>
						<li><a href="#">Contact</a></li>
					</ul>
					
					<ul class="nav navbar-nav navbar-right">
						<li><a href="register.jsp"><span class="glyphicon glyphicon-log-in"></span>
								Register</a></li>
					</ul>
					
					<ul class="nav navbar-nav navbar-right">
						<li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span>
								Login</a></li>
					</ul>
					
										
				</div>
			</div>
		</nav>
		 -->
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary sticky-top">
		<a class="navbar-brand" href="/reservationwebapp/">Navbar</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarColor01" aria-controls="navbarColor01"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor01">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="/reservationwebapp/login">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Features</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Pricing</a></li>
				<li class="nav-item"><a class="nav-link" href="#">About</a></li>
			</ul>
			
			
			<ul class="nav navbar-nav navbar-right btn">
				<li><a href="login"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		    
		    <ul class="nav navbar-nav navbar-right btn">
				<li><a href="register"><span class="glyphicon glyphicon-log-in"></span>
						Register</a></li>
			</ul>
			
			
			
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search">
				<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

</body>

</html>