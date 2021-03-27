
<%@ page import="java.util.List" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.viewRatingsReviews.viewReviewData" %>
<%@ page import="com.viewRatingsReviews.viewRateReview" %>
<%@include file="header-bar.jsp"%>


<%--<c:if test="${userId == null}">--%>
<%--    <c:redirect url="login.jsp"></c:redirect>--%>
<%--</c:if>--%>


<head>
    <link rel="stylesheet" href="./assets/css/tables.css">
    <link rel="stylesheet" href="./assets/css/side-nav.css">

    <style>
        .dropbtn {
            background-color: #FFA543;
            color: white;
            padding: 16px;
            font-size: 16px;
            border: none;
        }


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
<div class="table-wrapper">
    <mini-nav>
        <div id="prof-info">
            <img src="./assets/img/users/prof-pic.jpg" id="prof-img" alt="">
            <h3><%=session.getAttribute("firstName")%></h3>
            <h4><%=session.getAttribute("lastName")%></h4>
            <h3 id="rating">6.5/10</h3>
        </div>

        <ul id="mini-nav">
            <li><a href="">Advanced Search</a></li>
            <li><a href="">Categories</a></li>
            <li><a href="">Sort</a></li>
            <li><a href="">Price Range</a></li>
        </ul>
    </mini-nav>


    <hr>

    <%
        String design_idd = (String) request.getParameter("design_id");
        viewReviewData obj_designReadDao = new viewReviewData();
        List<viewRateReview> list = obj_designReadDao.get_values(design_idd);
        Iterator<viewRateReview> it_list = list.iterator();
    %>

    <table>
        <caption>All Reviews</caption>
        <tr>
            <th>rating</th>
            <th>Review</th>
        </tr>

        <%
            while (it_list.hasNext()) {
                viewRateReview obj_design_readDao = new viewRateReview();
                obj_design_readDao = it_list.next();
        %>
        <tr>
            <td><i class = "fas fa-star"></i><%=obj_design_readDao.getRating()%></td>
            <td><%=obj_design_readDao.getReview()%></td>
        </tr>
        <%
            }
        %>
    </table>

</div>

<%@include file="footer-bar.jsp"%>