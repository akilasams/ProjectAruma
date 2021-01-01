<%--<%@ page import="com.course.ViewMyCoursesServlet" %>--%>
<%@ include file="header-bar.jsp"%>

<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }
%>

<head>
    <link rel="stylesheet" href="./assets/css/profile.css">
    <link rel="stylesheet" href="./assets/css/admin-profile.css">
</head>

<div id="msgs-reqs-container">
    <div id="side-bar">
        <div id="prof">
            <div id="profile">
                <div id="prof-pic">
                    <img src="./assets/img/prof-pic.jpg" alt="">
                </div>
                <div id="name">
                    <h3>First Name</h3>
                    <h4>Last Name</h4>
                </div>
            </div>
        </div>
        <div id="links">
            <ul id="side-bar-links">
                <li><a href="user-reqs-and-msgs.jsp">Requests & Messages</a></li>
                <li><a href="cart.jsp">My Cart</a></li>
                <li><a href="my-courses.jsp">My Courses</a></li>
                <li><a href="profile-settings.jsp">Settings</a></li>
            </ul>
        </div>
    </div>
    <div id="admin-gallery" class="prof-tab">
        <div id="messages-box">
            <caption>Messages</caption>

            <div class="msg">
                <h5>Name</h5>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Commodi, nisi?</p>
            </div>

            <div class="msg">
                <h5>Name</h5>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Commodi, nisi?</p>
            </div>

            <div class="msg">
                <h5>Name</h5>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Commodi, nisi?</p>
            </div>

        </div>

        <div id="requests-box">
            <caption>Requests</caption>

            <div class="req">
                <div class="req-prof">
                    <img src="./assets/img/people/p2.jpg" alt="">
                </div>
                <div class="req-details">
                    <h5>Name</h5>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Doloremque, tenetur!</p>
                </div>
                <div class="more">
                    <i class="fas fa-chevron-right"></i>
                </div>
            </div>

            <div class="req">
                <div class="req-prof">
                    <img src="./assets/img/people/p2.jpg" alt="">
                </div>
                <div class="req-details">
                    <h5>Name</h5>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Doloremque, tenetur!</p>
                </div>
                <div class="more">
                    <i class="fas fa-chevron-right"></i>
                </div>
            </div>

            <div class="req">
                <div class="req-prof">
                    <img src="./assets/img/people/p2.jpg" alt="">
                </div>
                <div class="req-details">
                    <h5>Name</h5>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Doloremque, tenetur!</p>
                </div>
                <div class="more">
                    <i class="fas fa-chevron-right"></i>
                </div>
            </div>

        </div>
    </div>
</div>

<%@ include file="footer-bar.jsp"%>