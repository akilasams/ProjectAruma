<%--
  Created by IntelliJ IDEA.
  User: Akila Samarawickrama
  Date: 11/20/2020
  Time: 12:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Aruma | A Platform for Designers</title>
    <link rel="stylesheet" href="./assets/css/index.css">
</head>
<body>
    <div class="container">
        <div class="hero-box">
            <label for=""><h2>Welcome to Aruma</h2></label>
            <div class="btn-container">
                <button onclick="document.location='login.jsp'">Login</button>
                <button onclick="document.location='signup.jsp'">Sign Up</button>
                <a href="home-main.jsp">Visit as a Guest</a>
            </div>
        </div>
        <div class="text-overlay">
            <h1>Aruma.</h1>
            <h2>Learn.</h2>
            <h2>Design.</h2>
            <h2>Sell.</h2>
        </div>
    </div>
</body>
</html>
