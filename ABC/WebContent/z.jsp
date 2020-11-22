<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>


<%
    
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/arumadb";
    String userId = "root";
    String password = "";

    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>

<%@include file="header-bar.jsp"%>
<head>
    <link rel="stylesheet" href="z.css">
  
</head>
    <br>
	
<h2 align="center"><strong>Store</strong></h2><br>
<h2 align="center"><strong>Join with Us</strong></h2>
<center>
  <table align="center" cellpadding="5" cellspacing="5" border="1">
    <tr>

    </tr>
    <tr bgcolor="#ff8c00">
    	<h3>
    	<td></h3><b>Design Code Number</b></td>
        <td><b>Discription</b></td>
        <td><b>Unit Price</b></td>
        
        <td><b>Add to cart</b></td>
        <td><b>Wishlist</b></td>
         <td><b>Buy Now</b></td>

		</h3>
    </tr>
    <%
        try{
            connection = DriverManager.getConnection(connectionUrl, userId, password);
            statement=connection.createStatement();
            String sql ="SELECT design_id,additional_details,unit_price FROM arumadb.store_item";

            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
            	String design_id= resultSet.getString("design_id");
               
    %>
    <tr bgcolor="#ffd700">

	 	<td> <%=resultSet.getString("design_id") %> </td> 
        <td><%=resultSet.getString("additional_details") %></td> 
        <td><%=resultSet.getInt("unit_price") %></td>
        
        <td><a href="y.jsp?design_id=<%=resultSet.getString("design_id") %>">Add to cart</a> </td>
        <td><a href="18.jsp?design_id=<%=resultSet.getString("design_id") %>">Wishlist </a> </td>
         <td><a href="payment.jsp?design_id=<%=design_id%>">Buy Now</a> </td>
         
         

    </tr>


    <%
            }
        connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
  </table>
</center>
<br>
<button type="submit" class="btn1"> <a href="Cart.jsp"> My Cart </a></button>  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp

<button type="submit" class="btn2"><a href="18.jsp"> My Wishlist </a></button>
<br><br>



<br>
	
<%@include file="footer-bar.jsp"%>