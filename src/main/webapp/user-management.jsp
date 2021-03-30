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
    <style>
        .dropbtn {
            background-color: #FFA543;
            color: white;
            padding: 16px;
            font-size: 16px;
            border: none;
        }

        /*.dropdown {*/
        /*    position: relative;*/
        /*    display: inline-block;*/
        /*}*/

        .dropdown-content {
            display: none;
            position: absolute;
            background-color: #f1f1f1;
            min-width: 160px;
            box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
            z-index: 1;
        }

        .dropdown-content a {
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
        }

        .dropdown-content a:hover {background-color: #ddd;}

        .dropdown:hover .dropdown-content {display: block;}

        .dropdown:hover .dropbtn {background-color:#FFA543;}

        .arrow {
            border: solid black;
            border-width: 0 3px 3px 0;
            display: inline-block;
            padding: 3px;
        }

        .down {
            transform: rotate(45deg);
            -webkit-transform: rotate(45deg);
        }

    </style>
</head>

<div id="users-container">
    <%
        AddUserDao obj_view_user = new AddUserDao();
        List<AddUser> list = obj_view_user.get_values();
        List<viewRateReview> list1 = obj_view_user.get_values_ratings();
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
                <tr>
                    <th>Name</th>
                    <th>Rating</th>
                    <th>Action</th>

                </tr>
                <%
                    while (it_list.hasNext()) {
                        AddUser obj_view_designers = new AddUser();
                        viewRateReview obj_view_ratings = new viewRateReview();
                        obj_view_designers = it_list.next();
                        obj_view_ratings = it_list1.next();

                %>



                <tr>
                    <td><%=obj_view_designers.getFirst_name()%></td>
                    <td><%=obj_view_ratings.getRating()%></td>

                    <td>
                        <div class="dropdown">
                        <button class="dropbtn"><p><i class="arrow down"></i></p></button>
                        <div class="dropdown-content">
                            <a href="delete_user.jsp?user_id=<%=obj_view_designers.getUser_id()%>">Delete</a>
                            <a href="view-designer-reviews.jsp?user_id=<%=obj_view_designers.getUser_id()%>">view Reviews</a>

                        </div>
                        </div>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
    </div>
</div>

<%@ include file="footer-bar.jsp"%>