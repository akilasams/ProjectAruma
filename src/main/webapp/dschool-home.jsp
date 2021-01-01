<%@include file="header-bar.jsp"%>

<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }
%>

<head>
    <link rel="stylesheet" href="./assets/css/tables.css">
    <link rel="stylesheet" href="./assets/css/side-nav.css">
    <link rel="stylesheet" href="assets/css/course-cards.css">
    <script src="assets/js/sidebar.js"></script>
    <script src="assets/js/design-school.js"></script>

</head>

<%@include file="view-course.jsp"%>

<div class="table-wrapper">
    <%@include file="side-nav.jsp"%>

    <div class="card-holder">
        <c:forEach var="course" items="${courseList}">
            <div class="card">
                <div class="img-holder">
                    <img src="./assets/img/img5.jpg" alt="" class="card-img">
                </div>
                <div class="details-holder">
                    <h4 style="background: none"><c:out value="${course.courseName}"/></h4>
                    <p><c:out value="${course.courseDescription}"/></p>
                    <p><c:out value="${course.courseFee}"/></p>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<%@include file="footer-bar.jsp"%>