<%@include file="header-bar.jsp"%>

<c:if test="${userId == null}">
    <c:redirect url="login.jsp"></c:redirect>
</c:if>

<head>
    <link rel="stylesheet" href="./assets/css/tables.css">
    <link rel="stylesheet" href="./assets/css/side-nav.css">
</head>
<div class="table-wrapper">
    <mini-nav>
        <div id="prof-info">
            <img src="assets/img/users/prof-pic.jpg" id="prof-img" alt="">
            <h3>${firstName}</h3>
            <h4>${lastName}</h4>
            <h3 id="rating">6.5/10</h3>
        </div>

        <ul id="mini-nav">
            <li><a href="">Advanced Search</a></li>
            <li><a href="">Categories</a></li>
            <li><a href="">Sort</a></li>
            <li><a href="">Price Range</a></li>
        </ul>

    </mini-nav>

    <table class="my-table">
        <caption>My Courses</caption>

        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
        </tr>

        <c:forEach var="course" items="${courseList}">
        <tr>
            <td><c:out value="${course.courseName}"/></td>
            <td><c:out value="${course.courseDescription}"/></td>
            <td><c:out value="${course.courseFee}"/></td>
        </tr>
        </c:forEach>
    </table>
</div>

<%@include file="footer-bar.jsp"%>