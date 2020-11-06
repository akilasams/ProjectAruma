<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login form</title>
    <link rel="stylesheet" href="./assets/css/buyer_account.css" >

</head>
<body>

<div class="move">
    <div class="wrapper">
        <div class="title-text">
            <div class="title login">Sign Up | Buyer Account</div>
        </div>

        <div class="form-container">
            <div class="form-inner">
                <form action="CustomerRegisterServlet" class="login" method="post">

                    <div class="field">
                        <input type="text" name="firstName" placeholder="First Name" required>
                    </div>
                    <div class="field">
                        <input type="text" name="lastName" placeholder="Last Name" required>
                    </div>
                    <div class="field">
                        <input type="text" name="email" placeholder="Email" required>
                    </div>
                    <div class="field">
                        <input type="text" name="address" placeholder="Address" required>
                    </div>
                    <div class="field">
                        <input type="text" name="mobileNo" placeholder="Mobile" required>
                    </div>
                    <div class="field">
                        <input type="text" name="username" placeholder="Username" required>
                    </div>
                    <div class="field">
                        <input type="password" name="password" placeholder="Password" required>
                    </div>
                    <div class="field">
                        <input type="password" name="password" placeholder="Retype Password" required>
                    </div>

                    <div class="pass-link">Agree to our <a href="#">Terms & Conditions</a></div>
                    <div class="field">
                        <input type="submit" value="Register">
                    </div>
                    <div class="signup-link">Already a member? <a href="signup.html">Sign In</a></div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>