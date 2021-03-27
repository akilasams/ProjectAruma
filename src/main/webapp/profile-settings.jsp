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
        <form id="user-update-form" enctype="multipart/form-data">
            <div id="prof-pic">
                <img src="assets/img/users/prof-pic.jpg" alt="">
            </div>
            <label for="profPic" id="prof-pic-upload">Upload a Picture</label><input type="file" name="profPic" id="profPic">
            <h4 id="prof-name">${currentUser.getFirstName()} ${currentUser.getLastName()}</h4>
            <label for="address">Address</label><input type="text" name="address" id="address" value="${currentUser.getAddress()}"><br>
            <label for="email">Email</label><input type="text" name="email" id="email" value="${currentUser.getEmail()}"><br>
            <label for="mobileNo">Mobile Number</label><input type="text" name="mobileNo" id="mobileNo" value="${currentUser.getMobileNo()}"><br>
            <button form="user-update-form" formaction="UpdateUserServlet" formmethod="post">Save</button>
        </form>
    </div>
</div>

<%@include file="footer-bar.jsp"%>
