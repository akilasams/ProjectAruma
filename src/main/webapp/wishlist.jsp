<%@include file="header-bar.jsp"%>

<link rel="stylesheet" href="./assets/css/cart-wishlist.css">
<%@include file="cart-wishlist.jsp"%>

<div class="cart-wrapper">
<%--<div class="cart-container">--%>
    <div class="cart">
        <h4>Your Wishlist</h4>
        <i class="fas fa-times"></i>
        <div class="cart-item-holder">
            <div class="cart-item">
                <div class="item-img">
                    <img src="./assets/img/img2.jpg" alt="">
                </div>
                <div class="buy-info">
                    <p>Name</p>
                    <p class="cart-desc">Lorem ipsum dolor sit amet, consectetur!</p>
                </div>
                <div class="cart-icons">
                    <a href=""><i class="fas fa-shopping-cart"></i></a>
                    <a href="#"><i class="fas fa-trash-alt"></i></a>
                </div>
            </div>
        </div>
        <div class="cart-bottom">

        </div>
    </div>
<%--</div>--%>
</div>

<%@include file="footer-bar.jsp"%>
