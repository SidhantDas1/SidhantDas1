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
	<%! int sum ; %>
	<h1>
		ORDER SUMMARY
	</h1>
	<h2>${msg}</h2>
	
	<table border="5px solid red" cellpadding=20px cellspacing=0px
		align="center">
		
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>PHONE</th>
			
		</tr>
		
		<tr>
				<td>${orders.getId()}</td>
				<td>${orders.getName()}</td>
				<td>${orders.getPhone()}</td>
		</tr>
		
		</table>
	
	<table border="5px solid red" cellpadding=20px cellspacing=0px
		align="center">
		<tr>
			<th>NAME</th>
			<th>QTY</th>
			<th>COST</th>
		</tr>

		<c:forEach var="item" items="${orders.getItems()}">
			<tr>
				<td>${item.getName()}</td>
				<td>${item.getQty()}</td>
				<td>${item.getCost()}</td>
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="2">COST</td>
			<td>${orders.getCost()}</td>
		</tr>

	</table><br><br>


</body>
</html>