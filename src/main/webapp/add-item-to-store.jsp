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
    <title>Add Design</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/forms.css">
</head>
<body>
    <div id="form-container">
        <h2>Add Item to Store</h2>
        <form action="" method="post" enctype="multipart/form-data">
            <input type="text" name="designName" placeholder="Selling Name"><br>
            <input type="text" name="designName" placeholder="Quantity"><br>
            <input type="text" name="designName" placeholder="Price"><br>
            <textarea name="desc" id="" cols="30" rows="10" placeholder="Special Notes"></textarea><br>
            <label id="filename" for="filename">Upload More Images</label><br>
            <input type="file" name="filename"><br>
        </form>
        <button type="submit" name="submit">Add to Store</button>
    </div>
</body>
</html>
