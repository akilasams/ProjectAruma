<%--
  Created by IntelliJ IDEA.
  User: Akila Samarawickrama
  Date: 11/19/2020
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forgot Password</title>
    <link rel="stylesheet" href="assets/css/login-forms.css">
</head>
<body>
<div class="form-container">
    <div class="form-header">
        <img src="assets/img/logo/Logo.png" alt="">
    </div>
    <form class="form" name="forgot-password" id="forgot-password" action="forgot-password-set.jsp" method ="get">
        <div class="form-control">
            <input type="email" name="forgot-email" placeholder="Enter Your Email" required>
            <%--<i class="fas fa-check"></i>
            <i class="fas fa-times"></i>--%>
            <small>Error Message</small>
        </div>
<%--        <input type="submit" value="go">--%>
        <button form="forgot-password" type="submit">Send Email</button>

    </form>
</div>
</body>
</html>
