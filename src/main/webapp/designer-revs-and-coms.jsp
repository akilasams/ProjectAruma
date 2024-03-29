<%--<%@ page import="com.course.ViewMyCoursesServlet" %>--%>
<%@ include file="header-bar.jsp"%>

<c:if test="${userId == null}">
    <c:redirect url="login.jsp"></c:redirect>
</c:if>

<head>
    <link rel="stylesheet" href="./assets/css/profile.css">
    <link rel="stylesheet" href="./assets/css/admin-profile.css">
</head>

<div id="msgs-reqs-container">
    <%@include file="designer-sidebar.jsp"%>

    <div id="admin-gallery" class="prof-tab">
        <div id="messages-box">
            <caption>Reviews</caption>

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
            <caption>Comments</caption>

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