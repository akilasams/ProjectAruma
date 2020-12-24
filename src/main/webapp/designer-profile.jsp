<%--<%@ page import="com.course.ViewMyCoursesServlet" %>--%>
<%@ include file="header-bar.jsp"%>

<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }

    if((int)session.getAttribute("user_role_Id")==1){
        response.sendRedirect("admin-profile.jsp");
    }else if((int)session.getAttribute("user_role_Id")==3) {
        response.sendRedirect("customer-profile.jsp");
    }
%>

<head>
    <link rel="stylesheet" href="./assets/css/profile.css">
</head>

<div class="prof-container">
    <%@include file="designer-sidebar.jsp"%>

    <div id="gallery">
        <div class="place-holder"></div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
    </div>
</div>

<%@ include file="footer-bar.jsp"%>