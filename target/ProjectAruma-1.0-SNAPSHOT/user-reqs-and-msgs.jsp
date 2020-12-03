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
    <%@include file="customer-sidebar.jsp"%>

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