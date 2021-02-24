<%@include file="header-bar.jsp"%>

<%--
<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }
%>
--%>

<%if(session.getAttribute("username")!=null){%>
    <%@include file="cart-wishlist.jsp"%>
<%}%>


<head>
    <link rel="stylesheet" href="./assets/css/tables.css">
    <link rel="stylesheet" href="./assets/css/side-nav.css">
    <link rel="stylesheet" href="./assets/css/item-cards.css">
    <script src="assets/js/sidebar.js"></script>
    <script src="assets/js/store-home.js"></script>
    <script src="assets/js/ajax.js"></script>
</head>

<div class="table-wrapper">
    <%@include file="side-nav.jsp"%>

    <div class="card-holder">

        <c:forEach var="item" items="${storeItemList}">
            <div class="card">
                <div class="img-holder">
                    <img src="./assets/img/img5.jpg" alt="" class="card-img">
                </div>
                <div class="details-holder">
                    <h3 style="background: none">${item.designName}</h3>
                    <p class="item-category">${item.designType}</p>
                    <p>${item.designDescription}</p>
                </div>
                <div class="item-price">
                    <h5>${item.unitPrice} LKR</h5>
                    <div class="item-price-icons">
                        <a href="#"><i class="fas fa-star"></i></a>
                        <a href="#"><i class="fas fa-shopping-cart"></i></a>
                    </div>
                </div>
            </div>
            <%@include file="view-item.jsp"%>
        </c:forEach>

    </div>
</div>

<%@include file="footer-bar.jsp"%>