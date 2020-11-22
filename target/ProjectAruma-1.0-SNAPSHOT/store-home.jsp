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
</head>



<div class="table-wrapper">
    <%@include file="side-nav.jsp"%>

    <div class="card-holder">
        <div class="card">
            <div class="img-holder">
                <img src="./assets/img/img5.jpg" alt="" class="card-img">
            </div>
            <div class="details-holder">
                <h3 style="background: none">Name</h3>
                <p class="item-category">Category</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequatur, quod.</p>
            </div>
            <div class="item-price">
                <h5>200.00</h5>
            </div>
        </div>

        <div class="card">
            <div class="img-holder">
                <img src="./assets/img/img5.jpg" alt="" class="card-img">
            </div>
            <div class="details-holder">
                <h3>Name</h3>
                <p class="item-category">Category</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequatur, quod.</p>
            </div>
            <div class="item-price">
                <h5>300.00</h5>
            </div>
        </div>
    </div>


</div>

<%@include file="footer-bar.jsp"%>