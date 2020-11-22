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
                <li><a href="reqs-and-msgs.jsp">Request & Messages</a></li>
                <li><a href="">Reviews</a></li>
                <li><a href="">Reports</a></li>
                <li><a href="profile-settings.jsp">Settings</a></li>
            </ul>
        </div>
    </div>
    <div id="admin-gallery" class="prof-tab">
        <div id="display-list-table">
            <table>
                <caption>Reports</caption>
                <tr>
                    <th>Name</th>
                    <th>Complaint</th>
                </tr>

                <tr>
                    <td>#1Name</td>
                    <td>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquam corporis impedit laboriosam quas similique? In nihil perferendis rerum similique voluptate.</td>
                </tr>

                <tr>
                    <td>#2Name</td>
                    <td>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus corporis cumque deleniti doloremque fugiat fugit nemo pariatur rerum sit velit?</td>
                </tr>

                <tr>
                    <td>#3Name</td>
                    <td>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus corporis cumque deleniti doloremque fugiat fugit nemo pariatur rerum sit velit?</td>
                </tr>
            </table>
            <a href="top-designers.jsp">View All</a>
        </div>
        <div id="display-list">
            <h4>Top Reviews</h4>
            <div class="place-holder">
                <h3>Name</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis, laborum.</p>
            </div>
            <div class="place-holder">
                <h3>Name</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis, laborum.</p>
            </div>
            <div class="place-holder">
                <h3>Name</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis, laborum.</p>
            </div>
            <div class="place-holder">
                <h3>Name</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis, laborum.</p>
            </div>
            <div class="place-holder">
                <h3>Name</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis, laborum.</p>
            </div>
            <div class="place-holder">
                <h3>Name</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis, laborum.</p>
            </div>
        </div>
        <a href="report.jsp">View All</a>
    </div>
</div>

<%@ include file="footer-bar.jsp"%>