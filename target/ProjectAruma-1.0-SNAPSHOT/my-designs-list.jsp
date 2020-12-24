<%@include file="header-bar.jsp"%>

<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }
%>

<head>
    <link rel="stylesheet" href="./assets/css/tables.css">
    <link rel="stylesheet" href="./assets/css/side-nav.css">
</head>
<div class="table-wrapper">
    <mini-nav>
        <div id="prof-info">
            <img src="./assets/img/prof-pic.jpg" id="prof-img" alt="">
            <h3><%=session.getAttribute("firstName")%></h3>
            <h4><%=session.getAttribute("lastName")%></h4>
            <h3 id="rating">6.5/10</h3>
        </div>
    </mini-nav>

    <table>
        <caption>My Designs</caption>

        <tr>
            <th>Name</th>
            <th>Description</th>
        </tr>

        <tr>
            <td>Course Name #1</td>
            <td>Course Description #1</td>
        </tr>

        <tr>
            <td>Course Name #2</td>
            <td>Course Description #2</td>
        </tr>
    </table>
</div>

<%@include file="footer-bar.jsp"%>