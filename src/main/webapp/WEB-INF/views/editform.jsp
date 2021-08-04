<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
  <%@ include file="./first.jsp" %>  
<!DOCTYPE html>
<html>
<head>



<meta charset="ISO-8859-1">
<title>book form</title>
</head>
<body>
  <h3 class="text-center blue mt-3"  style="color: gray;"> WWelcom Our Update Form</h3>
  <div class="container md-6">
  
  <div class="md-2 offset md-6">
  <form action=" ${pageContext.request.contextPath}/formhandler" method="post" style="background-color:white-space: ;">
  
  	 <input class="form-control"  name="id" type="number" value="${book.id }">
  	
  	<label>Enter your New Full Name</label>
  	<input class="form-control"  name="username" type="text" value="${book.username }">
  	  	 
  	<label>Enter yourEmail Address</label>
  	<input class="form-control"  name="email" type="text" value="${book.email }">
  	

  	
     
  	<label>Select your Gender</label>
  	<select name="gender"  class="custom-select custom-select-sm">
  		
  		<option>${book.gender}</option>
  	<option value=male>Male</option>
  	 	<option value="female">Female</option>
  	</select>
  		 	
  		 	<!-- <label>Select Date</label>
  	  <input class="form-control"  name="date" type="date" >
  	     -->
  	<label>Enter New  your Address</label>
  <input   class="form-control" name="address" value="${book.address }">
  	
  	<label>Enter  New your Number</label>
  
	
  	<input class="form-control" name="number" type="number" value="${book.number }" >
  		
  	
  
  
  		<label>Choose your New Book Category</label>
  		<select class="form-control"  name="categories"  class="custom-select custom-select-sm">
  	      <option>${book.categories}</option>
  			<option>Action and Adventure.</option>
  			<option>Classics.</option>
           <option> Comic Book or Graphic Nove</option>
  			<option>Detective and Mystery.</option>
  			<option>Historical Fiction.</option>
  			<option>Classics</option>
  			<option>Horror.</option>
  			<option>Literary Fiction.</option>
  			

  	
  </select> 
  
  	<label>Enter your Book Name</label>
  	<input class="form-control"  name="bname" type="text" value="${book.bname }">
  		
  		
  		
  	<label>Select New  Quantity</label>
  <select class="form-control"  name="bookquantity" >
   <option>${book.bookquantity }</option>
   <option>1</option>
     <option>2</option>
       <option>3</option>
         <option>4</option>

 
  </select>
  		
  		<label>Write  New Books Description</label>
  	<input class="form-control"  name="description" type="text" value="${book.description }" >
    		
    		
 <label>Enter  New Book Price</label>
  	<input class="form-control"  name="price" type="number" value="${book.price }" >
  	<div class="text-center mt-3">
  	<a href=" ${pageContext.request.contextPath}/home1" class="btn btn-primary" >Back</a>
  	<button  type="submit"    class="btn btn-dark">Update </button>
  	</div>
  	
      		
  </form>
  </div>
  </div>


</body>
</html>