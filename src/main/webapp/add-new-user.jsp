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
    <title>Add an Admin</title>
    <link rel="stylesheet" href="./assets/css/style.css">
    <link rel="stylesheet" href="./assets/css/forms.css">
</head>
    <body>
    <div id="form-container">
        <h2>Add an Admin</h2>
        <form action="" method="post" enctype="multipart/form-data">
            <input type="text" name="firstName" placeholder="Users First Name"><br>
            <input type="text" name="lastName" placeholder="Users Last Name"><br>
            <input type="text" name="address" placeholder="Users Address"><br>
            <input type="text" name="email" placeholder="Users Email"><br>
            <input type="text" name="mobileNo" placeholder="Users Mobile Number"><br>
            <input type="text" name="username" placeholder="Username"><br>
            <input type="text" name="password" placeholder="Password"><br>
            <button type="submit" name="submit">Add an Admin</button>
        </form>
    </div>
    </body>
</html>
