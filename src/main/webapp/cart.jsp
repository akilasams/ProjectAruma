<%@include file="header-bar.jsp"%>

<link rel="stylesheet" href="./assets/css/cart-wishlist.css">
<%@include file="cart-wishlist.jsp"%>

<div class="cart-wrapper">
<%--<div class="cart-container">--%>
    <div class="cart">
        <h4>Your Cart</h4>
        <i class="fas fa-times"></i>
        <div class="cart-item-holder">
            <div class="cart-item">
                <div class="item-img">
                    <img src="./assets/img/img2.jpg" alt="">
                </div>
                <div class="buy-info">
                    <p>Name</p>
                    <p>Quantity <span><input type="text"></span></p>
                    <input type="checkbox">
                </div>
                <div class="cart-icons">
                    <a href="#"><i class="fas fa-shopping-cart"></i></a>
                    <a href="#"><i class="fas fa-trash-alt"></i></a>
                </div>
            </div>

            <div class="cart-item">
                <div class="item-img">
                    <img src="./assets/img/img2.jpg" alt="">
                </div>
                <div class="buy-info">
                    <p>Name</p>
                    <p>Quantity <span><input type="text"></span></p>
                    <input type="checkbox">
                </div>
                <div class="cart-icons">
                    <a href="#"><i class="fas fa-shopping-cart"></i></a>
                    <a href="#"><i class="fas fa-trash-alt"></i></a>
                </div>
            </div>

        </div>
        <div class="cart-bottom">
            <h4>Total : XXXXXX</h4>
            <button class="place-order">Place Order</button>
        </div>
    </div>
<%--</div>--%>
</div>

<%@include file="footer-bar.jsp"%>
