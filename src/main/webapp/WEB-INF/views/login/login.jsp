<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Login User</title>
		<%@ include file="../others/includes/stylish.jsp"%>
	</head>

<body>
	
	<%@ include file="../others/includes/navbar.jsp"%>
	
	<div class='container container-fluid'>
		
		<br><br><br><br>
		
		<div class='container container-fluid'>
			
			<form action='loginUser' method='POST' >
				
				<center>
					<input name='email' type='email' class='form-control col-sm-4' placeholder='Enter email..' required /><br>
					<input name='password' type='password' class='form-control col-sm-4' placeholder='Enter password..' required /><br><br><br>
					<input type='submit' value='Login' class='btn btn-primary col-lg-6' /><br><br><br>
					
					<h5 class='text-danger'><i> ${error} </i></h5>
				</center>
				
				<br><br><br><br><br><br><br>
				
			</form>
			
		</div>
		
	</div>
	
	<%@ include file="../others/includes/footer.jsp"%>
	
</body>

</html>
