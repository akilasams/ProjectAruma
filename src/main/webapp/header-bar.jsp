<%--
  Created by IntelliJ IDEA.
  User: Akila Samarawickrama
  Date: 10/2/2020
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Aruma</title>
    <link rel="stylesheet" href="./assets/css/style.css">
    <script src="https://kit.fontawesome.com/007dc48e77.js" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<%--    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
</head>
<body>
<%--<div class="header">
    <div class="box-1"></div>
    <div class="box-2">
        <img src="./assets/img/Logo.png" alt="logo">
    </div>
    <div class="box-3">
        <a href="login.jsp">Login</a>
        <a href="signup.jsp">Register</a>
    </div>
</div>--%>
<div class="header">
    <div class="box-1"></div>
    <div class="box-2">
        <img src="./assets/img/Logo.png" alt="logo">
    </div>

    <% if(session.getAttribute("username")!=null){ %>
    <div class="box-3">
        <img src="./assets/img/prof-pic.jpg" id="navbar-prof" alt="">
        <div class="prof-info">
            <h4>Logged in as <%=session.getAttribute("firstName")%></h4>
            <a href="designer-profile.jsp">Go to Profile</a>
            <a href="<%=request.getContextPath()%>/Logout">Sign Out</a>
        </div>
    </div>
    <%}else{%>
    <div class="box-3">
        <div class="prof-info">
            <a href="login.jsp">Login</a>
            <a href="signup.jsp">Register</a>
        </div>
    </div>
    <%}%>

</div>
<nav>
    <div class="wrapper">
        <ul>
            <li><a href="home-main.jsp">Home</a></li>
            <%--<li><a href="store-home.jsp">Store</a></li>--%>
            <li><a href="<%=request.getContextPath()%>/GetAllDesignersServlet">Freelancers</a></li>
            <li><a href="store-home.jsp">Store</a></li>
            <li><a href="<%=request.getContextPath()%>/ViewCourses">Design School</a></li>
            <li><a href="about.jsp">About</a></li>
            <li><a href="contact-us.jsp">Contact Us</a></li>
        </ul>
        <input type="text" placeholder="What Do You Want?" id="search">
    </div>
</nav>


