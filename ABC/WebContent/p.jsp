<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aruma Project</title>
<link rel="stylesheet" type="text/css" href="p.css">
 <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="header">
        <div class="box-1"></div>
        <div class="box-2">
            <img src="Logo.png" alt="logo">
        </div>
        <div class="box-3">
            <a href="login.jsp">Login</a>
            <a href="signup.jsp">Register</a>
        </div>
    </div>

    <nav>
        <div class="wrapper">
            <ul>
                <li><a href="home-main.jsp">Home</a></li>
                <li><a href="store-home.jsp">Store</a></li>
                <li><a href="dschool-home.jsp">Design School</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact Us</a></li>
            </ul>
            <input type="text" placeholder="Find Your Freelancer..." id="search">
        </div>
    </nav>
    <br><br><br>

    <form action="Wishlist" method="post">
	<div class="box">
		<br>
		<h3> Do you want to add this item into wishlist?</h3><br>

		<button  type="submit">Yes</button> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp

		<button type="submit">No</button>

	</div>
	</form>
	<br><br><br><br><br>

	<div class="footer">
        <div class="social-media">
            <a href="#"><i class="fab fa-facebook-f"></i></a>
            <a href="#"><i class="fab fa-twitter"></i></a>
            <a href="#"><i class="fab fa-instagram"></i></a>
        </div>
    </div>



</body>
</html>