<%@ page import="com.addUser.AddUserDao" %>
<%@ page import="java.util.List" %>
<%@ page import="com.addUser.AddUser" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.viewRatingsReviews.viewReviewData" %>
<%@ page import="com.viewRatingsReviews.viewRateReview" %>
<%@ include file="header-bar.jsp"%>

<c:if test="${userId == null}">
    <c:redirect url="login.jsp"></c:redirect>
</c:if>

<head>
    <link rel="stylesheet" href="./assets/css/profile.css">
    <link rel="stylesheet" href="./assets/css/admin-profile.css">
    <link rel="stylesheet" href="./assets/css/tables.css">
</head>

<div id="users-container">
    <%
        String user_id = request.getParameter("user_id");
        AddUserDao obj_view_user = new AddUserDao();
        List<AddUser> list = obj_view_user.get_values();
        List<viewRateReview> list1 = obj_view_user.get_values_reviews(user_id);
        Iterator<AddUser> it_list = list.iterator();
        Iterator<viewRateReview> it_list1 = list1.iterator();

    %>
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
                <%
                    while (it_list1.hasNext()) {
                        AddUser obj_view_designers = new AddUser();
                        viewRateReview obj_view_reviews = new viewRateReview();
                        obj_view_reviews = it_list1.next();
                        obj_view_designers = it_list.next();


                %>
                <tr>
                    <th>All reviews of <%=obj_view_designers.getFirst_name()%></th>

                </tr>

                <tr>

                    <td><%=obj_view_reviews.getReview()%></td>


                </tr>
                <%
                    }
                %>
            </table>
        </div>
    </div>
</div>

<%@ include file="footer-bar.jsp"%>