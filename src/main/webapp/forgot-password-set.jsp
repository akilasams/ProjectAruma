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
    <title>Forgot Password Set</title>
    <link rel="stylesheet" href="assets/css/login-forms.css">
    <script language="JavaScript" type="text/JavaScript" ></script>
</head>
<body>
<div class="form-container">
    <div class="form-header">
        <img src="assets/img/logo/Logo.png" alt="">

    </div>
    <form class="form" id="login-form" name="forgotForm" action="ForgotPasswordServlet" method="post" onSubmit="return validateForm(event);">

        <div class="form-control">

    <input type="text" name="email" id="email" value="<%=request.getParameter("forgot-email")%>"/>
        </div>

        <div class="form-control">

            <input type="password" class="password" name="NewPassword" placeholder="New Password" required>

        </div>
        <div class="form-control">
            <input type="password" class="confirmPassword" name="ReTypePassword" placeholder="Re Enter New Password" required>
            <%--<i class="fas fa-check"></i>
            <i class="fas fa-times"></i>--%>
<%--            <small>Error Message</small>--%>
        </div>

<%--        <input type="submit" >--%>
        <button form="login-form" type="submit">Reset Password</button>

    </form>

    <script>


        function validateForm(event)
        {
            event.preventDefault(); // this will prevent the submit event.
            if(document.forgotForm.NewPassword.value=="")
            {
                alert("password Cannot left Blank");
                document.forgotForm.NewPassword.focus();
                return false;
            }
            else if(document.forgotForm.ReTypePassword.value=="")
            {
                alert("Password cannot left blank");
                document.forgotForm.ReTypePassword.focus();
                return false;
            }
            else if (document.forgotForm.ReTypePassword.value!=document.forgotForm.NewPassword.value){
                alert("Password didnt match try again");
                return false;
            }
            else {
                document.forgotForm.submit();// fire submit event
            }
        }

    </script>
</div>
</body>
</html>
