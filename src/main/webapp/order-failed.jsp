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
    <title>Order Failed</title>
</head>
<body>
    <div class="msg-holder">
        <div class="msg">
            <h1>Order Failed! <br><i class="fas fa-heart-broken"></i></h1>
        </div>
        <div class="home-button">
            <a href="<%=request.getContextPath()%>/ViewAllItemsServlet">Go Back to Store</a>
        </div>
    </div>
</body>
</html>
