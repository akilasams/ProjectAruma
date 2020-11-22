<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@include file="header-bar.jsp"%>
<head>
    <link rel="stylesheet" href="paymentdetails.css">
  
</head>
   <br>
   
    <div class="A">
      	<form action="#" method="post">
      	
      	   <br>
      	<center><h2>Payment Details details</h2></center><br><br>
      	    <div class="C">
             <br><br>
            <label for="cname"> &nbsp &nbsp Card name:</label>
            <input class="inputbox" type="text1" id="cname" name="cardname" placeholder="people"><br><br>
            <label for="ccnum"> &nbsp &nbsp Credit card number:</label>
            <input class="inputbox" type="text1" id="ccnum" name="cardnumber" placeholder="1111-2222-3333-4444"><br><br>
            <label for="expmonth"> &nbsp &nbsp Exp Month:</label>
            <input class="inputbox" type="text1" id="expmonth" name="expmonth" placeholder="September"><br><br>

                <label for="expyear"> &nbsp &nbsp Exp Year:</label>
                <input class="inputbox" type="text1" id="expyear" name="expyear" placeholder="2020"><br><br>
            
              
                <label for="cvv"> &nbsp &nbsp CVV:</label>
                <input class="inputbox" type="text1" id="cvv" name="cvv" placeholder="352"><br>
                
               <button  type="submit" class="btn2"><a href="x.jsp"> Checkout & Continue </a></button>
             </div>            
        
			
			<br><br>
			
      	  </div>
      	</form>
      	<br>
      	<h2>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Total Price:</h2>
      
      </div>
      <br><br>
      
<%@include file="footer-bar.jsp"%>
  
      