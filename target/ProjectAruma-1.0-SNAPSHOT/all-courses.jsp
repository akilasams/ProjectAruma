<%@include file="header-bar.jsp"%>

<head>
    <link rel="stylesheet" href="./assets/css/tables.css">
</head>
<div class="table-wrapper">
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