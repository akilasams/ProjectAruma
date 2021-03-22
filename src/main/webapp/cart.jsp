<%--<link rel="stylesheet" href="./assets/css/cart-wishlist.css">--%>

<%--<div class="cart-container">--%>
<%--    <div class="cart">--%>
<%--        <h4 style="color: black">Your Cart</h4>--%>
<%--        <a href="#" class="close-cart"><i class="fas fa-times"></i></a>--%>
<%--        <div class="cart-item-holder">--%>
<%--            <div class="cart-item">--%>
<%--                <div class="item-img">--%>
<%--                    <img src="assets/img/designs/img2.jpg" alt="">--%>
<%--                </div>--%>
<%--                <div class="buy-info">--%>
<%--                    <p>Name</p>--%>
<%--                    <p>Quantity <span><input type="text"></span></p>--%>
<%--                    <input type="checkbox">--%>
<%--                </div>--%>
<%--                <div class="cart-icons">--%>
<%--                    <a href="#"><i class="fas fa-shopping-cart"></i></a>--%>
<%--                    <a href="#"><i class="fas fa-trash-alt"></i></a>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--            <div class="cart-item">--%>
<%--                <div class="item-img">--%>
<%--                    <img src="assets/img/designs/img2.jpg" alt="">--%>
<%--                </div>--%>
<%--                <div class="buy-info">--%>
<%--                    <p>Name</p>--%>
<%--                    <p>Quantity <span><input type="text"></span></p>--%>
<%--                    <input type="checkbox">--%>
<%--                </div>--%>
<%--                <div class="cart-icons">--%>
<%--                    <a href="#"><i class="fas fa-shopping-cart"></i></a>--%>
<%--                    <a href="#"><i class="fas fa-trash-alt"></i></a>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--        </div>--%>
<%--        <div class="cart-bottom">--%>
<%--            <h4>Total : XXXXXX</h4>--%>
<%--            <button class="place-order"><a href="shipping-payment.jsp">Place Order</a></button>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<%@include file="header-bar.jsp"%>

<c:if test="${userId == null}">
    <c:redirect url="login.jsp"></c:redirect>
</c:if>

<link rel="stylesheet" href="./assets/css/cart-wishlist.css">

<%--<div class="cart-container">--%>
    <div class="cart">
        <h4 style="color: black">Your Cart</h4>
        <a href="#" class="close-cart"><i class="fas fa-times"></i></a>
        <div class="cart-item-holder">
            <div class="cart-item">
                <div class="item-img">
                    <img src="assets/img/designs/img2.jpg" alt="">
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
                    <img src="assets/img/designs/img2.jpg" alt="">
                </div>
                <div class="buy-info">
                    <p>Name</p>
                    <p>Quantity <span><input type="text"></span></p>
                    <p>Buy Now <span><input type="checkbox"></span></p>
                </div>
                <div class="cart-icons">
                    <a href="#"><i class="fas fa-shopping-cart"></i></a>
                    <a href="#"><i class="fas fa-trash-alt"></i></a>
                </div>
            </div>

        </div>
        <div class="cart-bottom">
            <h4>Total : XXXXXX</h4>
            <button class="place-order"><a href="shipping-payment.jsp">Place Order</a></button>
        </div>
    </div>
<%--</div>--%>

<%@include file="footer-bar.jsp"%>