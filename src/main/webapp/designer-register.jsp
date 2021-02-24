<%--
  Created by IntelliJ IDEA.
  User: Akila Samarawickrama
  Date: 11/20/2020
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Designer | Sign Up</title>
    <link rel="stylesheet" href="./assets/css/register-forms.css">
    <script src="https://kit.fontawesome.com/007dc48e77.js" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<%--    <script src="assets/js/form-validation.js"></script>--%>
    <script src="assets/js/forms.js"></script>
</head>
<body>
    <div class="form-container">
        <div class="form-header">
            <h2>Register | Designer</h2>
        </div>

        <form action="DesignerRegisterServlet" class="form" method="post" id="form">

            <div class="form-control success">
                <input type="text" name="firstName" id="firstName" placeholder="First Name" required>
                <i class="fas fa-check"></i>
                <i class="fas fa-times"></i>
                <small>Error Message</small>
            </div>

            <div class="form-control error">
                <input type="text" name="lastName" id="lastName" placeholder="Last Name" required>
                <i class="fas fa-check"></i>
                <i class="fas fa-times"></i>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <input type="text" name="email" id="email" placeholder="Email" required>
                <i class="fas fa-check"></i>
                <i class="fas fa-times"></i>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <input type="text" name="address" id="address" placeholder="Address" required>
                <i class="fas fa-check"></i>
                <i class="fas fa-times"></i>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <input type="text" name="city" id="city" placeholder="City" required>
                <i class="fas fa-check"></i>
                <i class="fas fa-times"></i>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <input type="text" name="mobileNo" id="mobileNo" placeholder="Mobile Number" required>
                <i class="fas fa-check"></i>
                <i class="fas fa-times"></i>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <input type="text" name="username" id="username" placeholder="New Username" required>
                <i class="fas fa-check"></i>
                <i class="fas fa-times"></i>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <input type="password" name="password" id="password" placeholder="New Password" required>
                <i class="fas fa-check"></i>
                <i class="fas fa-times"></i>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <input type="password" name="retypePassword" id="retypePassword" placeholder="Retype Password" required>
                <i class="fas fa-check"></i>
                <i class="fas fa-times"></i>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <select name="serviceType" id="serviceType">
                    <option value="" selected="selected"> - Select the Main Service Category - </option>
                    <option value="1">Graphic Designs</option>
                    <option value="2">Fashion</option>
                    <option value="3">Art & Drawings</option>
                    <option value="4">VFX & Film Making</option>
                    <option value="5">Handicraft</option>
                    <option value="6">Greeting Cards</option>
                    <option value="7">Other</option>
                </select>
            </div>

            <div class="form-control">
                <textarea form="form" id="bio" placeholder="What Do you do?"></textarea>
                <span id="display_count">0/50</span>
                <i class="fas fa-check"></i>
                <i class="fas fa-times"></i>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <input type="submit" value="Register">
            </div>

            <label for=""><a href="login.jsp">Already Have an Account?</a></label>
        </form>
    </div>
</body>
</html>
