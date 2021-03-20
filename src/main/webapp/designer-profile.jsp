<%--<%@ page import="com.course.ViewMyCoursesServlet" %>--%>
<%@ include file="header-bar.jsp"%>

<%--<c:if test="${user.getUsername() != null}">--%>
<%--        response.sendRedirect("login.jsp");--%>
<%--</c:if>--%>

<%--<c:if test="${user.getUser_role_id() == 1}">--%>
<%--    response.sendRedirect("admin-profile.jsp");--%>
<%--</c:if>--%>

<%--<c:if test="${user.getUser_role_id() == 3}">--%>
<%--    response.sendRedirect("customer-profile.jsp");--%>
<%--</c:if>--%>

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