<%@include file="header-bar.jsp"%>

<c:if test="${username == null}">
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
        <h2>Send Job Request to ${toUserFirstName}</h2>
        <form id="user-update-form" enctype="multipart/form-data">
            <label for="address">Address</label><input type="text" name="address" id="address" ><br>
            <label for="email">Email</label><input type="text" name="email" id="email"><br>
            <label for="mobileNo">Mobile Number</label><input type="text" name="mobileNo" id="mobileNo"><br>
            <button form="user-update-form" formaction="UpdateUserServlet" formmethod="post">Send</button>
        </form>
    </div>
</div>
<%@include file="footer-bar.jsp"%>
