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
                <caption>Reports</caption>
                <label for="report-sort">Sort By</label>
                <div class="report-sort">
                    <select name="report-sort" id="report-sort">
                        <option value="handicraft">Most Recent</option>
                        <option value="handicraft">Oldest</option>
                    </select>
                </div>
                <tr>
                    <th>Name</th>
                    <th>Report</th>
                </tr>

                <tr>
                    <td>Name#1</td>
                    <td>Report#1</td>
                </tr>

                <tr>
                    <td>Name#2</td>
                    <td>Report#2</td>
                </tr>
            </table>
        </div>
    </div>
</div>

<%@ include file="footer-bar.jsp"%>