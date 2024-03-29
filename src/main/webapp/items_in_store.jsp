
<%@ page import="com.viewAll.viewAlldesignsDao" %>
<%@ page import="com.viewAll.viewAlldesignsMem" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page import="com.viewAll.viewAlldesignsDao" %>
<%@ page import="com.viewAll.viewAlldesignsMem" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.viewAll.viewAlldesignsMem" %>

<%@include file="header-bar.jsp"%>

<%--<%if(session.getAttribute("username")!=null){%>--%>
<%--<%@include file="cart-wishlist.jsp"%>--%>
<%--<%}%>--%>
<c:if test="${userId != null}">
    <jsp:include page="cart-wishlist.jsp"/>
</c:if>

<head>

    <link rel="stylesheet" href="./assets/css/tables.css">
    <link rel="stylesheet" href="./assets/css/side-nav.css">
    <link rel="stylesheet" href="./assets/css/item-cards.css">
    <script src="assets/js/sidebar.js"></script>
</head>
<hr>
<%
    viewAlldesignsDao obj_viewAlldesignsDao = new viewAlldesignsDao();
    List<viewAlldesignsMem> list = obj_viewAlldesignsDao.get_values();
    Iterator<viewAlldesignsMem> it_list = list.iterator();
%>


<div class="table-wrapper">
    <%@include file="side-nav.jsp"%>

    <div class="card-holder">
        <%
            while (it_list.hasNext()) {
                viewAlldesignsMem obj_viewAlldesignsMem = new viewAlldesignsMem();
                obj_viewAlldesignsMem = it_list.next();

        %>
        <div class="card">
            <div class="img-holder">
                <img src="./assets/img/designs/img7.jpg" alt="" class="card-img">
            </div>
            <div class="details-holder">


                <h3 style="background: none"><%=obj_viewAlldesignsMem.getDesign_name()%></h3>
                <p class="item-category"><%=obj_viewAlldesignsMem.getDesigntype_id()%></p>
                <p><%=obj_viewAlldesignsMem.getDesign_description()%></p>
            </div>
            <div class="item-price">
                <a style="position: absolute; right: 90px; font-size: 20px" href="more_details.jsp?design_id=<%=obj_viewAlldesignsMem.getDesign_id()%>">View More</a>
                <h5>Rs. <%=obj_viewAlldesignsMem.getUnit_price()%></h5>

            </div>

        </div>
        <%
            }
        %>
    </div>


</div>

<%@include file="footer-bar.jsp"%>