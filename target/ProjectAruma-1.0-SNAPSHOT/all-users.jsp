<%@include file="header-bar.jsp"%>

<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }
%>


<head>
    <link rel="stylesheet" href="./assets/css/tables.css">
    <link rel="stylesheet" href="./assets/css/side-nav.css">
    <script src="assets/js/sidebar.js"></script>
</head>
<div class="table-wrapper">
    <mini-nav>
        <ul id="mini-nav">
            <li><a href="#">Advanced Search</a></li>
<%--            <li><a href="#" class="cat-btn">Categories<span><i class="fas fa-chevron-down arrow"></i></span></a>--%>
            <li><a href="#" class="cat-btn">Categories</a>
                <ul class="cat-show">
                    <li><a href="#">Graphic Design</a></li>
                    <li><a href="#">VFX</a></li>
                    <li><a href="#">Drawing</a></li>
                    <li><a href="#">Art & Craft</a></li>
                    <li><a href="#">Other</a></li>
                </ul>
            </li>
            <li><a href="#">Sort</a></li>
        </ul>
        <div class="slider-container">
            <label for="myRange">Price Range</label>
            <input type="range" min="1" max="100" value="50" class="slider" id="myRange">
        </div>
    </mini-nav>

    <table>
        <caption>All Courses</caption>

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