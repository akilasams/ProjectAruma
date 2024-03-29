<%@include file="header-bar.jsp"%>
<%@ page import="com.read.designReadMem" %>
<%@ page import="com.read.editValuesDao" %>
<%@ page import="com.read.editValuesDao" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<c:if test="${userId == null}">
    <c:redirect url="login.jsp"></c:redirect>
</c:if>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Product Card/Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="./assets/css/preview_item.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA==" crossorigin="anonymous" />
</head>
<body style="background-color: bisque">
<%
    String design_id = (String) request.getParameter("design_id");

    editValuesDao obj_edit_valuesDao = new editValuesDao();
    designReadMem obj_design_readDao = obj_edit_valuesDao.get_value_of_design(design_id);


%>

<div class = "card-wrapper">
    <div class = "card">
        <!-- card left -->
        <div class = "product-imgs">
            <div class = "img-display">
                <div class = "img-showcase">
                    <img src = "assets/img/designs/img4.png" alt = "img4">
                    <img src = "assets/img/designs/img5.jpg" alt = "img5">
                    <img src = "assets/img/designs/img4.png" alt = "img6">
                    <img src = "assets/img/designs/img5.jpg" alt = "img7">
                </div>
            </div>
            <div class = "img-select">
                <div class = "img-item">
                    <a href = "#" data-id = "1">
                        <img src = "assets/img/designs/img4.png" height="95px"  alt = "img4">
                    </a>
                </div>
                <div class = "img-item">
                    <a href = "#" data-id = "2">
                        <img src = "assets/img/designs/img5.jpg" height="95px" alt = "img5">
                    </a>
                </div>
                <div class = "img-item">
                    <a href = "#" data-id = "3">
                        <img src = "assets/img/designs/img4.png" height="95px" alt = "img6">
                    </a>
                </div>
                <div class = "img-item">
                    <a href = "#" data-id = "4">
                        <img src = "assets/img/designs/img5.jpg" height="95px" alt = "img7">
                    </a>
                </div>
            </div>
        </div>
        <!-- card right -->
        <div class = "product-content">
            <h2 class = "product-title"><%=obj_design_readDao.getDesign_name()%></h2>
            <%--            <a href = "#" class = "product-link">visit nike store</a>--%>
            <div class = "product-rating">
                <i class = "fas fa-star"></i>

                <span> <%

                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/aruma_db?serverTimezone=UTC","root","");
                        PreparedStatement ps=null;
                        ResultSet rs=null;
                        String strQuery = "SELECT AVG(rating) FROM aruma_db.item_ratingreview where design_id=?";
                        ps=con.prepareStatement(strQuery);
                        ps.setString(1, design_id);
                        rs=ps.executeQuery();
                        String Countrun="";
                        while(rs.next()){
                            Countrun = rs.getString(1);
                            out.println(Countrun);
                        }
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                %></span>
            </div>

            <div class = "product-price">
                <p class = "last-price">Old Price: <span>RS.1000</span></p>
                <p class = "new-price">New Price: <span>RS.900 (5%)</span></p>
            </div>

            <div class = "product-detail">
                <h2>About The Item </h2>
                <p><%=obj_design_readDao.getDesign_description()%></p>
                <p>Description #2</p>
                <ul>
                    <li>Name: <span><%=obj_design_readDao.getDesign_name()%></span></li>
                    <li>Available: <span><%=obj_design_readDao.getIn_store()%></span></li>
                    <li>Category: <span>Flier Design</span></li>
<%--                    <li>Published Date: <span>2021/03/20</span></li>--%>
                </ul>
            </div>

            <div class = "purchase-info">
                <input type = "number" min = "0" value = "1">
                <button type = "button" class = "btn">
                    Add to Cart <i class = "fas fa-shopping-cart"></i>
                </button>
                <%--                <button type = "button" class = "btn">Compare</button>--%>
            </div>

            <div class = "social-links">
                <p>Share At: </p>
                <a href = "#">
                    <i class = "fab fa-facebook-f"></i>
                </a>
                <a href = "#">
                    <i class = "fab fa-twitter"></i>
                </a>
                <a href = "#">
                    <i class = "fab fa-instagram"></i>
                </a>
                <a href = "#">
                    <i class = "fab fa-whatsapp"></i>
                </a>
                <a href = "#">
                    <i class = "fab fa-pinterest"></i>
                </a>
            </div>
        </div>
    </div>
</div>


<script src="./assets/js/preview-item.js"></script>
</body>
</html>

<%--<%@include file="footer-bar.jsp"%>--%>
