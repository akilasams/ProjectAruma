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
    <title>Login</title>
    <link rel="stylesheet" href="assets/css/login-forms.css">
</head>
<body>
    <div class="form-container">
        <div class="form-header">
            <img src="./assets/img/Logo.png" alt="">
        </div>
        <form class="form" id="login-form">
            <div class="form-control">
                <input type="text" name="username" placeholder="Username" required>
                <%--<i class="fas fa-check"></i>
                <i class="fas fa-times"></i>--%>
                <small>Error Message</small>
            </div>
            <div class="form-control">
                <input type="password" name="password" placeholder="Password" required>
                <%--<i class="fas fa-check"></i>
                <i class="fas fa-times"></i>--%>
                <small>Error Message</small>
            </div>

            <button form="login-form" formaction="LoginServlet" formmethod="post">Login</button>
            <label for=""><a href="forgot-password.jsp">Forgot Password?</a> | <a href="signup.jsp">Sign Up</a></label>
        </form>
    </div>
</body>
</html>
