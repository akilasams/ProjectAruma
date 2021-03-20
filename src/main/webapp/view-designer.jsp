<link rel="stylesheet" href="./assets/css/view-item.css">
<script src="https://kit.fontawesome.com/007dc48e77.js" crossorigin="anonymous"></script>

<div class="view-container">
    <div class="modal">
        <a href="<%=request.getContextPath()%>/ViewAllDesignersServlet" id="close"><i class="fas fa-times"></i></a>
        <div class="desc-holder">
            <div class="gallery">
                <div class="gallery-prof-pic">
                    <img src="./assets/img/users/p2.jpg" alt="">
                </div>
<%--                <div class="gallery-pics">--%>
<%--                    <div class="mini-img">--%>
<%--                        <img src="assets/img/designs/img6.jpg" alt="">--%>
<%--                    </div>--%>
<%--                    <div class="mini-img">--%>
<%--                        <img src="assets/img/designs/img6.jpg" alt="">--%>
<%--                    </div>--%>
<%--                    <div class="mini-img">--%>
<%--                        <img src="assets/img/designs/img6.jpg" alt="">--%>
<%--                    </div>--%>
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
                <h2>${designer.getFirstName()} ${designer.getLastName()} <span>6/10</span></h2>
<%--                <p>${designer.getBio()}</p>--%>
                <h4>Top Reviews</h4>
                <div class="top-reviews">
                    <div class="review">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis, voluptatem.</p>
                    </div>
                    <div class="review">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis, voluptatem.</p>
                    </div>
                    <div class="review">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis, voluptatem.</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="view-bottom">
            <a class="buy-now" href="<%=request.getContextPath()%>/ViewJobRequestFormServlet?userId=${designer.getId()}">Send Job Request</a>
        </div>
    </div>
</div>

