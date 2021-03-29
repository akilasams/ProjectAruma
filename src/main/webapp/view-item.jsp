

<%@include file="header-bar.jsp"%>
<%@ page import="com.viewAll.viewAlldesignsDao" %>
<%@ page import="com.viewAll.editDesignsStore" %>
<%@ page import="com.viewAll.viewAlldesignsMem" %>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<c:if test="${userId == null}">
    <c:redirect url="login.jsp"></c:redirect>
</c:if>

<head>
    <style>
        .button {
            width: 200px;
            background-color: #FF7A00;
            border: none;
            color: white;
            padding: 8px 22px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        }
    </style>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Product Card/Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="./assets/css/preview_item.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA==" crossorigin="anonymous" />
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body style="background-color: bisque">
<%
    String design_idd = (String) request.getParameter("design_id");

    editDesignsStore obj_edit_valuesDao = new editDesignsStore();
    viewAlldesignsMem obj_design_readDao = obj_edit_valuesDao.get_values(design_idd);
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

                <span>
                    <%

                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver").newInstance();
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/aruma_db?serverTimezone=UTC","root","");
                        PreparedStatement ps=null;
                        ResultSet rs=null;
                        String strQuery = "SELECT AVG(rating) FROM aruma_db.item_ratingreview where design_id=?";
                        ps=con.prepareStatement(strQuery);
                        ps.setString(1, design_idd);
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
                %>
                <a href="view-ratings.jsp?design_id=<%=obj_design_readDao.getDesign_id()%>">View All reviews</a>
                </span>
            </div>

            <div class = "product-price">
                <p class = "new-price">New Price: <span><%=obj_design_readDao.getUnit_price()%></span></p>
            </div>

            <div class = "product-detail">

                <h2>About The Item </h2>
                <p><%=obj_design_readDao.getDesign_description()%></p>
                <p><%=obj_design_readDao.getAdditional_details()%></p>
                <ul>
                    <li>Name: <span><%=obj_design_readDao.getDesign_name()%></span></li>
                    <li>Available: <span><%=obj_design_readDao.getStock()%></span></li>
<%--                    <li>Category: <span>Flier Design</span></li>--%>
                    <li>Category: <span>Flier Design</span></li>

                </ul>
            </div>

            <div class = "purchase-info">
                <input type = "number" min = "0" value = "1">
                <button type = "button" class = "btn">
                    Add to Cart <i class = "fas fa-shopping-cart"></i>
                </button>

                <form id="buy-now">
                    <input type="hidden" name="designId" value="<%=obj_design_readDao.getDesign_id()%>">
                    <input type="hidden" name="unitPrice" value="<%=obj_design_readDao.getUnit_price()%>">
                    <input type = "number" min = "0" value = "1" name="quantity">
                </form>
                <button type = "submit" class = "btn" form="buy-now" formmethod="POST" formaction="BuyNowServlet">Buy Now</button>
            </div>
            <a href="rate-item.jsp?design_id=<%=obj_design_readDao.getDesign_id()%>" class="button">Rate This Item</a>
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



