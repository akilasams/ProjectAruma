<%@include file="header-bar.jsp"%>

<head>
    <link rel="stylesheet" href="./assets/css/tables.css">
    <link rel="stylesheet" href="./assets/css/side-nav.css">
    <link rel="stylesheet" href="./assets/css/cards.css">
</head>
<div class="table-wrapper">
    <mini-nav>
        <ul id="mini-nav">
            <li><a href="">Advanced Search</a></li>
            <li><a href="">Categories</a></li>
            <li><a href="">Sort</a></li>
            <li><a href="">Price Range</a></li>
            <li><a href="">Categories</a></li>
        </ul>
    </mini-nav>

    <div class="card-holder">
        <c:forEach var="designer" items="${designersList}">
        <div class="card">
            <div class="img-holder">
                <img src="./assets/img/people/p2.jpg" alt="" class="card-img">
            </div>
            <div class="details-holder">
                <h4><b><c:out value="${designer.firstName}"/> <c:out value="${designer.lastName}"/></b></h4>
                <p>Small Bio</p>
            </div>
        </div>
        </c:forEach>
    </div>
</div>

<%@include file="footer-bar.jsp"%>