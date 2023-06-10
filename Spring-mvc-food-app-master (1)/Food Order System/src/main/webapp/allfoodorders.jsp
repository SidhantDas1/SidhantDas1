<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>
		FOOD ORDERS LIST
	</h1>
	<h2>${msg}</h2>
	
	<c:forEach var="order" items="${orders}">
	
	<table border="5px solid ">
		
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>PHONE</th>
		</tr>
		
		<tr>
				<td>${order.getId()}</td>
				<td>${order.getName()}</td>
				<td>${order.getPhone()}</td>
		</tr>
		
		</table>
	
	<table border="5px solid ">
		<tr>
			<th>NAME</th>
			<th>QTY</th>
			<th>COST</th>
		</tr>

		<c:forEach var="item" items="${order.getItems()}">
			<tr>
				<td>${item.getName()}</td>
				<td>${item.getQty()}</td>
				<td>${item.getCost()}</td>
			</tr>
		</c:forEach>
			<tr>
			<td colspan="2">COST</td>
			<td>${order .getCost()}</td>
		</tr>

	</table><br><br>
	
	</c:forEach>

</body>
</html>