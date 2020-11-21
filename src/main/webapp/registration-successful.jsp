<%--
  Created by IntelliJ IDEA.
  User: Akila Samarawickrama
  Date: 10/29/2020
  Time: 8:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="./assets/css/msg_page.css">
    <script src="https://kit.fontawesome.com/007dc48e77.js" crossorigin="anonymous"></script>
    <title>Registration Successful</title>
</head>
<body>
    <div class="msg-holder">
        <div class="msg">
            <h1>Hi, <%=session.getAttribute("name")%>!</h1>
            <h1>Welcome to Aruma! <i class="fas fa-heart"></i></h1>
            <hr>
            <h2>You have been Successfully Registered as a <%=session.getAttribute("type")%></h2>
        </div>
        <div class="home-button">
            <a href="login.jsp">Login</a>
        </div>
    </div>
</body>
</html>
