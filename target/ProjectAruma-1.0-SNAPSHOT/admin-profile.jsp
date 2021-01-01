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
    <%@include file="admin-sidebar.jsp"%>

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
            <a href="reports.jsp">View All</a>
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
        <a href="reviews.jsp">View All</a>
    </div>
</div>

<%@ include file="footer-bar.jsp"%>