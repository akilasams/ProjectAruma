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

<div class="prof-container">
    <div id="side-bar">
        <div id="prof">
            <div id="profile">
                <div id="prof-pic">
                    <img src="./assets/img/prof-pic.jpg" alt="">
                </div>
                <div id="name">
                    <h3><%=session.getAttribute("firstName")%></h3>
                    <h4><%=session.getAttribute("lastName")%></h4>
                    <h5>Admin</h5>
                </div>
            </div>
        </div>
        <div id="links">
            <ul id="side-bar-links">
                <li><a href="">All Users</a></li>
                <li><a href="">Request & Messages</a></li>
                <li><a href="">Reviews & Reports</a></li>
                <li><a href="profile-settings.jsp">Settings</a></li>
            </ul>
        </div>
    </div>
    <div id="admin-gallery">
        <div id="display-list-table">
            <table>
                <caption>All Designer</caption>
                <tr>
                    <th>Name</th>
                    <th>Performance</th>
                </tr>

                <tr>
                    <td>#1Name</td>
                    <td>#1Rating & Work</td>
                </tr>

                <tr>
                    <td>#2Name</td>
                    <td>#2Rating & Work</td>
                </tr>
            </table>
        </div>
        <div class="display-list">
            <div class="place-holder"></div>
            <div class="place-holder"></div>
            <div class="place-holder"></div>
            <div class="place-holder"></div>
            <div class="place-holder"></div>
            <div class="place-holder"></div>
        </div>
    </div>
</div>

<%@ include file="footer-bar.jsp"%>