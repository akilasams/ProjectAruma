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
    <link rel="stylesheet" href="./assets/css/tables.css">
</head>

<div id="users-container">
    <%@include file="admin-sidebar.jsp"%>

    <div id="user-gallery" class="prof-tab">
        <div id="all-users">
            <table>
                <caption>All Users</caption>
                <label for="user-sort">Sort By</label>
                <div class="sort-users">
                    <select name="user-sort" id="user-sort">
                        <option value="fashion">Designers</option>
                        <option value="drawings">Customers</option>
                        <option value="handicraft">Top Performing</option>
                        <option value="graphicDesign">Most Recent</option>
                    </select>
                </div>
                <tr>
                    <th>Name</th>
                    <th>Rating</th>
                    <th>Performance</th>
                </tr>

                <tr>
                    <td>Name#1</td>
                    <td>Rating#1</td>
                    <td>Performance#1</td>
                </tr>

                <tr>
                    <td>Name#2</td>
                    <td>Rating#2</td>
                    <td>Performance#2</td>
                </tr>
            </table>
        </div>
    </div>
</div>

<%@ include file="footer-bar.jsp"%>