<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enter Payment Details</title>
    <link rel="stylesheet" href="assets/css/login-forms.css">
</head>
<body>
    <div class="form-container">
        <div class="form-header">
            <h2>Shipping & Payment Details</h2>
        </div>

        <form class="form" id="login-form">
            <div class="form-control">
                <input type="text" name="ship-address" placeholder="Enter Shipping Address">
                <%--<i class="fas fa-check"></i>
                <i class="fas fa-times"></i>--%>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <input type="text" name="username" placeholder="Name On Card">
                <%--<i class="fas fa-check"></i>
                <i class="fas fa-times"></i>--%>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <input type="text" name="password" placeholder="CVV">
                <%--<i class="fas fa-check"></i>
                <i class="fas fa-times"></i>--%>
                <small>Error Message</small>
            </div>

            <div class="form-control">
                <input type="text" name="password" placeholder="Expiry Date">
                <%--<i class="fas fa-check"></i>
                <i class="fas fa-times"></i>--%>
                <small>Error Message</small>
            </div>

            <button form="login-form" formaction="" formmethod="post" id="pay"><a href="payment-successful.jsp">Pay</a></button>
        </form>
    </div>
</body>
</html>
