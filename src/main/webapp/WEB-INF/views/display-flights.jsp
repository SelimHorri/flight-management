<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>

<html>
	<head>
	<meta charset="UTF-8">
	<title>Display Flights</title>
	<%@ include file="others/includes/stylish.jsp"%>
</head>

<body>
	
	<%@ include file="others/includes/navbar.jsp"%>
	
	<div class='container container-fluid'>
		
		<br><br><br><br>
		
		<h2>List of Flights from Database</h2> <br>
		
		<br><br>
		
		<table class='table table-hover text-center'>
			
			<thead>
				<tr class=''>
					
					<th scope='col'>Airelines</th>
					<th scope='col'>Departure City</th>
					<th scope='col'>Arrival City</th>
					<th scope='col'>Departure Time</th>
				    <th scope="col"></th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${flights}" var="f" >
					
					<tr class=''>
						<td> ${f.operationAirlines} </td>
						<td> ${f.departureCity} </td>
						<td> ${f.arrivalCity} </td>
						<td> ${f.estimatedDepartureTime} </td>
						<td> <a href='showCompleteReservation?flightId=${f.id}' class='btn btn-outline-info'>Select</a> </td>
					</tr>
					
				</c:forEach>
			</tbody>
			
		</table>
		
		<br><br><br><br>
		
	</div>
	
	<%@ include file="others/includes/footer.jsp"%>
	
</body>
</html>







