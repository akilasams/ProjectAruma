<link rel="stylesheet" href="./assets/css/view-item.css">
<script src="https://kit.fontawesome.com/007dc48e77.js" crossorigin="anonymous"></script>

<div class="view-container">
    <div class="modal">
        <a href="<%=request.getContextPath()%>/ViewAllItemsServlet" class="close"><i class="fas fa-times"></i></a></a>
        <div class="desc-holder">
            <div class="item-img">
                <div class="hero-img">
                    <img src="assets/img/designs/img1.jpg" alt="">
                </div>
<%--                <div class="more-pics">--%>
<%--                    <div class="mini-img">--%>
<%--                        <img src="assets/img/designs/img6.jpg" alt="">--%>
<%--                    </div>--%>
<%--                    <div class="mini-img">--%>
<%--                        <img src="assets/img/designs/img6.jpg" alt="">--%>
<%--                    </div>--%>
<%--                    <div class="mini-img">--%>
<%--                        <img src="assets/img/designs/img6.jpg" alt="">--%>
<%--                    </div>--%>
<%--                </div>--%>
            </div>

            <div class="item-details">
                <h2>${item.designName}</h2>
                <p>${item.designDescription}</p>
                <h3>In Stock : ${item.stock}</h3>
                <h4>Quantity <span><input type="text"></span></h4>

                <div class="cart-wishlist-icons">
                    <a href="#"><i class="fas fa-shopping-cart"></i></a>
                    <a href="#"><i class="fas fa-star"></i></a>
                </div>
            </div>
        </div>

        <div class="view-bottom">
            <div class="rating-stars">
            <span>Rate this Item : </span><i class="far fa-star"></i><i class="far fa-star"></i><i class="far fa-star"></i><i class="far fa-star"></i><i class="far fa-star"></i>
            </div>
            <button class="buy-now"><a href="shipping-payment.jsp">Buy Now</a></button>
        </div>
    </div>
</div>

