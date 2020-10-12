<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login form</title>
    <link rel="stylesheet" href="./assets/css/login.css">

</head>
<body>

<div class="move">
    <div class="wrapper">
        <div class="title-text">
            <div class="title login">Login</div>
        </div>

        <div class="form-container">
            <div class="form-inner">
                <form action="Login" method="post">
                    <div class="field">
                        <input type="text" name="uname" placeholder="Email Address" required><br>
                    </div>
                    <div class="field">
                        <input type="password" name="pass" placeholder="Password" required><br>
                    </div>
                    <div class="pass-link"><a href="#">Forgot Password?</a></div>
                    <div class="field">
                        <input type="submit" value="Login">
                    </div>
                    <div class="signup-link">Not a member? <a href="signup.jsp">Sign Up Now</a></div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>