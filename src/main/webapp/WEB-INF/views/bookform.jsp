<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ include file="./first.jsp" %>  
<!DOCTYPE html>
<html>
<head>



<meta charset="ISO-8859-1">
<title>book form</title>
</head>
<body>
  <h3 class="text-center blue mt-3"  style="color: gray;"> Welcome to my Book Form</h3>
  <div class="container md-6">
  
  <div class="md-2 offset md-6">
  <form action="formhandler" method="post" style="background-color:white-space: ;">
  
  	 
  	<label>Enter your Full Name</label>
  	<input class="form-control"  name="username" type="text" placeholder="Enter Your  Full Name..">
  	  	 
  	<label>Enter yourEmail Address</label>
  	<input class="form-control"  name="email"" type="text" placeholder="Enter Email Address">
  	

  	
     
  	<label>Select your Gender</label>
  	<select name="gender"  class="custom-select custom-select-sm">
  		<option>Select your gender</option>
  	<option value=male>Male</option>
  	 	<option value="female">Female</option>
  	</select>
  		 	
  		 	<!-- <label>Select Date</label>
  	  <input class="form-control"  name="date" type="date" >
  	     -->
  	<label>Enter your Address</label>
  	<textarea  rows="4"  class="form-control" name="address" placeholder="Enter your Address"></textarea>
  	
  	<label>Enter your Number</label>
  
	
  	<input class="form-control" name="number" type="number" >
  		
  	
  
  
  		<label>Choose your Book Category</label>
  		<select class="form-control"  name="categories"  class="custom-select custom-select-sm">
  		<option>Open this select menu</option>
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
  	<input class="form-control"  name="bname" type="text" placeholder="Enter Book name..">
  		
  		
  		
  	<label>Select Quantity</label>
  <select class="form-control"  name="bookquantity">
 <option valu=1>1</option>
 <option valu=2>2</option>
 
 <option valu=3>3</option>
 <option valu=4>4</option>
 <option valu=5>5</option>
 
  </select>
  		
  		<label>Write Books Description</label>
  	<input class="form-control"  name="description" type="text"placeholder="Enter Book Description..">
    		
    		
 <label>Enter Book Price</label>
  	<input class="form-control"  name="price" type="number" placeholder="Enter Price" >
  	<div class="text-center mt-3">
  	<button  type="submit"    class="btn btn-dark">Add Book</button>
  	</div>
  	
      		
  </form>
  </div>
  </div>


</body>
</html>