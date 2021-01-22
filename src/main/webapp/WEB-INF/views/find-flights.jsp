<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
	<meta charset="UTF-8">
	<title>Find Flights</title>
	<%@ include file="others/includes/stylish.jsp"%>
</head>

<body>
	
	<%@ include file="others/includes/navbar.jsp"%>
	
	<div class='container container-fluid'>
		
		<br><br><br><br><br>
		
		<h1> Find Flights </h1> <br><br>
	
		<h3 class='text-success'>${msg}</h3>
		
		<br><br><br><br><br>
		
		<div class='jumbotron container container-fluid'>
			
			<form action='displayFlights' method='POST'>
				
				<center>
					From : <input name='from' type='text' class='form-control col-sm-8' placeholder='From..' required /><br>
					To : <input name='to' type='text' class='form-control col-sm-8' placeholder='To..' required /><br><br><br>
					Departure Date : <h6><i>yyyy-mm-dd format</i></h6> <input name='departureDate' type='text' placeholder='Departure Date..' class='form-control col-lg-8' required /><br><br><br>
					
					<input type='submit' class='btn btn-outline-info' value='Search' />
					
					<%-- <h5 class='text-danger'><i> ${error} </i></h5> --%>
				</center>
				
			</form>
			
		</div>
		
		<br><br><br><br><br>
		
	</div>
	
	<%@ include file="others/includes/footer.jsp"%>
	
</body>

</html>









