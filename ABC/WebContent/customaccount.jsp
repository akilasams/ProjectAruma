<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@include file="header-bar.jsp"%>
<head>

<link rel="stylesheet" type="text/css" href="coustomaccount.css">

</head>


	<div class="box">
	  <div class="picture">
		<img src="img1.jpg" width="900px" height="150px">
	  </div>
		<div class="customer">
			<h2>Customer Account <hr></h2>
		</div>
		
		<br>
		<div class="box1">

			<center><img src="people.jpg" width="280" height="180px"></center><br>
			<h3><b>&nbsp Name: </b></h3>
			<br>
			<div class="color">
				<br>
			  <div class="link">
			
				<a href="request.jsp"><b>Requests</a><br><br>

				<a href="message.jspl">Messages</a><br><br>

				<form><a href="Cart.jsp">My Cart</a><br><br></form> 

				<a href="18.jsp">Wishlist</a><br><br>
				<a href="course.jsp">My Courses</a><br><br>
				
				<a href="Cart_purches_history.jsp">Payment History</a><br><br>

				<a href="logout.jsp">Logout</a><br>

			  </b></div>

			</div>

		</div>

	</div>

	<%@include file="footer-bar.jsp"%>