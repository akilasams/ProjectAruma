<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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

<!DOCTYPE html>
<%@include file="header-bar.jsp"%>
<head>
    <link rel="stylesheet" href="z.css">
  
</head>
    <br>
	<center><h2><b>My Cart</b></h2></center><br><br>
<center>
	<table  cellpadding="5" cellspacing="5" border="1">
    <tr>

    </tr>
    <tr bgcolor="#ff8c00">
    	
    	<td><b>Design Code Number</b></td>
        <td><b>Quantity</b></td>
        <td><b>Price</b></td>
        <td><b>Desctription</b></td>
        
        <td><b>Buy Now</b></td>
        <td><b>Delete</b></td>
        
        
        
    </tr>
    <%
        try{
            connection = DriverManager.getConnection(connectionUrl, userId, password);
            statement=connection.createStatement();
            String sql="SELECT c.design_id, c.quantity, s.unit_price, s.additional_details FROM user_cart c INNER JOIN store_item s ON c.design_id=s.design_id WHERE c.user_id=1112";
            
            resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                String design_id = resultSet.getString("c.design_id");
         
    %>
   
    <tr bgcolor="#ffd700">

	 	
         <td><%=resultSet.getString("design_id") %></td>
        <td><%=resultSet.getString("quantity") %></td>
        <td><%=resultSet.getString("unit_price") %></td>
        <td><%=resultSet.getString("additional_details") %></td>
        
        <td> <label>
          <input type="checkbox" checked="checked" name="sameadr"> 
        </label></a><br> 
        
        <td><a href="k.jsp?design_id=<%=design_id%>">Delete</a> </td>
       
        
        
	
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
 	<button type="submit" class="btn1"><a href="placeorder.jsp">Place Order </a></button><br><br>
 	
 	<br><br>
 
 <div class="total">
 		<h3> Total Price=</h3>
 </div>

<br><br><br><br><br><br>
	
<%@include file="footer-bar.jsp"%>