<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Register User</title>
		<%@ include file="../others/includes/stylish.jsp"%>
	</head>

<body>
	
	<%@ include file="../others/includes/navbar.jsp"%>
	
	<div class='container container-fluid'>
		
		<br><br><br><br>
		
		<div class='container container-fluid'>
			
			<form action='registerUser' method='POST' >
				
				<center>
					<input name='fname' type='text' class='form-control col-sm-4' placeholder='Enter firstname..' required /><br>
					<input name='lname' type='text' class='form-control col-sm-4' placeholder='Enter lastname..' required /><br>
					<input name='email' type='email' class='form-control col-sm-4' placeholder='Enter email..' required /><br>
					<input name='password' type='password' class='form-control col-sm-4' placeholder='Enter password..' required /><br>
					<input name='confirmPassword' type='password' class='form-control col-sm-4' placeholder='Confirm password..' required /><br><br>
					<input type='submit' value='Sign Up' class='btn btn-primary col-lg-6' /><br><br>
					<h5 class='text-danger'> <i> ${error} </i> </h5><br><br>
				</center>
				
				<br><br><br><br><br><br><br>
				
			</form>
			
		</div>
		
	</div>
	
	<%@ include file="../others/includes/footer.jsp"%>
	
</body>

</html>
