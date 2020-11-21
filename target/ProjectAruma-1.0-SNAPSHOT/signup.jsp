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
    <link rel="stylesheet" href="./assets/css/signup-new.css">
</head>
<body>
    <div class="container">
        <div class="hero-box">
            <label for=""><h2>Select Account Type</h2></label>
            <div class="btn-container">
                <button onclick="document.location='designer-register.jsp'">Designer Account</button>
                <button onclick="document.location='customer-register.jsp'">Customer Account</button>
            </div>
        </div>
    </div>
</body>
</html>
