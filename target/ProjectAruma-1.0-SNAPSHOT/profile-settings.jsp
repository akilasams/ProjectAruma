<%@include file="header-bar.jsp"%>

<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }
%>

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
        <form action="UpdateUser" method="post" enctype="multipart/form-data">
            <div id="prof-pic">
                <img src="./assets/img/prof-pic.jpg" alt="">
            </div>
            <a href="#">Change Profile Picture</a>
            <h4 id="prof-name"><%=session.getAttribute("firstName")+" "+session.getAttribute("lastName")%></h4>
            <label for="address">Address</label><input type="text" name="address" id="address" value=""><br>
            <label for="email">Email</label><input type="text" name="email" id="email" value=""><br>
            <label for="mobileNo">Mobile Number</label><input type="text" name="mobileNo" id="mobileNo" value=""><br>
            <button type="submit" name="submit">Save</button>
        </form>
    </div>
</div>
<%@include file="footer-bar.jsp"%>
