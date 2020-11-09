<%@include file="header-bar.jsp"%>

<head>
    <link rel="stylesheet" href="./assets/css/profile.css">
    <link rel="stylesheet" href="./assets/css/forms.css">
</head>

<style>
    body{
        display: block;
    }
</style>

<div id="form-container">
    <h2>Profile Settings</h2>
    <form action="" method="post" enctype="multipart/form-data">
        <div id="prof-pic"></div>
        <input type="text" name="firstName" value=""><br>
        <input type="text" name="lastName" value=""><br>
        <input type="text" name="address" value=""><br>
        <input type="text" name="email" value=""><br>
        <input type="text" name="mobileNo" value=""><br>
        <input type="text" name="username" value=""><br>
        <input type="text" name="password" value=""><br>
        <button type="submit" name="submit">Save</button>
    </form>
</div>
<%@include file="footer-bar.jsp"%>
