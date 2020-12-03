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
                <caption>Reviews</caption>
                <label for="review-sort">Sort By</label>
                <div class="sort-reviews">
                    <select name="review-sort" id="review-sort">
                        <option value="fashion">Highest Rated</option>
                        <option value="drawings">Lowest Rated</option>
                        <option value="handicraft">Most Recent</option>
                    </select>
                </div>
                <tr>
                    <th>Name</th>
                    <th>Rating</th>
                    <th>Review</th>
                </tr>

                <tr>
                    <td>Name#1</td>
                    <td>Rating#1</td>
                    <td>Review#1</td>
                </tr>

                <tr>
                    <td>Name#2</td>
                    <td>Rating#2</td>
                    <td>Review#2</td>
                </tr>
            </table>
        </div>
    </div>
</div>

<%@ include file="footer-bar.jsp"%>