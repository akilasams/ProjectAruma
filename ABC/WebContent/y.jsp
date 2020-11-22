<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@include file="header-bar.jsp"%>
<head>
    <link rel="stylesheet" href="payment.css">
  
</head>
   
   <% String design_id=(String)request.getParameter("design_id"); %>
    <br><br>
     
      <div class="A">
      	<form action="Addtocart" method="post">
      	
      	   
      	<center><h2>Add to cart details</h2></center><br><br>
      	    <div class="C">
      	    <br><br>
            <label for="quantity"><i class="fa fa-user"></i><h3>&nbsp &nbsp Quantity</h3></label>
            <input type="text1"  name="quantity" required><br><br>
            
            <label for="design_id"><i class="fa fa-user"></i></label>
            <input type="hidden"  name="design_id" value="<%=design_id%>">
			
			<br><br><br>
			<input type="submit" value="Submit" class="btn2">
      	  </div>
      	</form>
    
      
      
      </div>
   
      
      <br><br><br><br><br>

<%@include file="footer-bar.jsp"%>
