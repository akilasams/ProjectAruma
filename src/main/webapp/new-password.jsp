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
    <title>Enter New Password</title>
    <link rel="stylesheet" href="assets/css/login-forms.css">
</head>
<body>
    <div class="form-container">
        <div class="form-header">
            <img src="assets/img/logo/Logo.png" alt="">
        </div>
        <form class="form" id="new-password">
            <div class="form-control">
                <input type="password" name="newPassword" placeholder="Enter New Password" required>
                <%--<i class="fas fa-check"></i>
                <i class="fas fa-times"></i>--%>
                <small>Error Message</small>
            </div>
            <div class="form-control">
                <input type="password" name="retypeNewPassword" placeholder="Retype New Password" required>
                <%--<i class="fas fa-check"></i>
                <i class="fas fa-times"></i>--%>
                <small>Error Message</small>
            </div>
            <button form="new-password" formaction="" formmethod="post">Set New Password</button>
        </form>
    </div>
</body>
</html>
