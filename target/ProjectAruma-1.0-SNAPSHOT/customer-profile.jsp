<%@ include file="header-bar.jsp"%>

<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }
%>


<head>
    <link rel="stylesheet" href="./assets/css/profile.css">
</head>

<div class="prof-container">
    <%@include file="customer-sidebar.jsp"%>

    <div id="gallery">
        <div class="place-holder">
            <img src="" alt=""><br>
        </div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
        <div class="place-holder"></div>
    </div>

</div>



<%@ include file="footer-bar.jsp"%>