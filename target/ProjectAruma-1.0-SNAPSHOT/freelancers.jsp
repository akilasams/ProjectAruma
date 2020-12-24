<%@include file="header-bar.jsp"%>

<head>
    <link rel="stylesheet" href="./assets/css/tables.css">
    <link rel="stylesheet" href="./assets/css/side-nav.css">
    <link rel="stylesheet" href="./assets/css/cards.css">
    <script src="assets/js/freelancers.js"></script>
</head>

<%@include file="view-designer.jsp"%>

<div class="table-wrapper">
    <%@include file="side-nav.jsp"%>

    <div class="card-holder">
        <c:forEach var="designer" items="${designersList}">
            <div class="card">
                <div class="img-holder">
                    <img src="./assets/img/people/p2.jpg" alt="" class="card-img">
                </div>
                <div class="details-holder">
                    <h4 style="background: none"><b><c:out value="${designer.firstName}"/> <c:out value="${designer.lastName}"/></b></h4>
                    <p>Small Bio</p>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<%@include file="footer-bar.jsp"%>