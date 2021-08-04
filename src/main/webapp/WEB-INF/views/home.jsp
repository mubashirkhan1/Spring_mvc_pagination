<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ include file="./first.jsp"%>
<%@taglib prefix="v" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This book Info page</title>
</head>
<body>

<div class="container mt-3">
	<div class="row">
	
		<div class="col-md-6-12">

	<h3 style="color: gray;" class="text-center">This is book
		Information table</h3>



	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">User id</th>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Address</th>
				<th scope="col">Gender</th>
				<th scope="col">Phone Number</th>
				<th scope="col">Book Categories</th>
				<th scope="col">Book Name</th>
				<th scope="col">Book Description</th>
				<th scope="col">Book Quantity</th>
				<th scope="col">Book Price</th>
					<th scope="col">Action</th>

			</tr>
		</thead>
		<v:forEach items="${bookobj}" var="p">
			<tbody>


				<tr>
			
					<td>${p.id}</td>
					<td>>${p.username}</td>
					<td>${p.email}</td>
					<td>${p.address}</td>
					<td>${p.gender}</td>
					<td>${p.number}</td>
					<td>${p.categories}</td>
					<td>${p.bname}</td>
					<td>${p.description}</td>
					<td>${p.bookquantity}</td>
					<td class="font-weight-bold"> &#8377; ${p.price}</td>
					<td> <a href="deletehandler/${p.id}"><i class="fas fa-trash-alt"></i>
					</a>
						<td> <a href="updatehanler/${p.id}"><i class="fas fa-user-edit"></i>
					</a>
					
					</td>

				</tr>
	      </v:forEach>
			</tbody>
	
	</table>
	<div class="text-center">
	<a href="bookform"  class="btn btn-outline-primary"> Add Book</a>
	<tr>
		<td>
	   <a href="getpreviousbook"  class="btn btn-outline-primary"> Previous  </a>	
	   <a href="getnextbook"   class="btn btn-outline-dark"> Nextpage</a>
   
    </td>
	</tr>
	
	
	</div>
	</div>
	</div>
	</div>

</body>
</html>