<%--
  Created by IntelliJ IDEA.
  User: Akila Samarawickrama
  Date: 10/27/2020
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:if test="${userId == null}">
    <c:redirect url="login.jsp"></c:redirect>
</c:if>

<html>
<head>
    <title>Add Course</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/forms.css">
    <script src="assets/js/form-validation.js"></script>
</head>
<body>
    <div id="form-container">
        <h2>Add New Course</h2>
        <form id="user-form" action="InsertCourse" method="post">
            <input type="text" name="courseName" placeholder="Enter Course Name"><br>
            <textarea name="courseDesc" id="" cols="30" rows="10" placeholder="Write Something About the Course"></textarea><br>
            <input type="text" id="courseFee" name="courseFee" placeholder="Enter Course Fee"><br>
            <label id="filename" for="filename">Upload Content</label><br>
            <input type="file" name="files" multiple="multiple"><br>
            <button type="submit" name="submit">Add to My Courses</button>
        </form>
    </div>
</body>
</html>
