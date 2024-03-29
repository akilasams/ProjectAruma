<%@include file="header-bar.jsp"%>

<c:if test="${userId == null}">
    <c:redirect url="login.jsp"></c:redirect>
</c:if>

<head>
    <link rel="stylesheet" href="./assets/css/forms.css">
</head>

<style>
    body{
        display: block;
    }

    button{
        margin-left: 0px;
    }
</style>

<div id="settings">
    <div id="form-container">
        <h2>Profile Settings</h2>
        <form id="user-form">
            <input type="hidden" name="merchant_id" value="1216946">    <!-- Replace your Merchant ID -->
            <input type="hidden" name="return_url" value="http://localhost:8080/ProjectAruma_war/PaymentServlet">
            <input type="hidden" name="cancel_url" value="http://sample.com/cancel">
            <input type="hidden" name="notify_url" value="http://sample.com/notify">

            <br><br>Customer Details<br>
            <br>
            <label for="first_name">First Name</label><input type="text" name="first_name" id="first_name" value="${currentUser.getFirstName()}"><br>
            <label for="last_name">Last Name</label><input type="text" name="last_name" id="last_name" value="${currentUser.getLastName()}"><br>
            <label for="email">Email</label><input type="text" name="email" id="email" value="${currentUser.getEmail()}"><br>
            <label for="phone">Phone Number</label><input type="text" name="phone" id="phone" value="${currentUser.getMobileNo()}"><br>
            <label for="address">Address</label><input type="text" name="address" id="address" value="${currentUser.getAddress()}"><br>
            <label for="city">City</label><input type="text" name="city" id="city" value="${currentUser.getCity()}"><br>
            <label for="country">Country</label><input type="hidden" name="country" id="country" value="Sri Lanka"><br>

            <br><br>Item Details<br>
            <br>
            <label for="order_id">Order ID</label><input type="text" name="order_id" id="order_id" value="${order.getOrderId()}"><br>
            <label for="items">Items</label><input type="hidden" name="items" id="items" value="1"><br>
            <label for="currency">Currency</label><input type="text" name="currency" id="currency" value="LKR"><br>
            <label for="amount">Amount</label><input type="text" name="amount" id="amount" value="${order.getTotal()}"><br>

            <button form="user-form" formaction="https://sandbox.payhere.lk/pay/checkout" formmethod="post">Checkout</button>
        </form>
    </div>
</div>

<%@include file="footer-bar.jsp"%>
