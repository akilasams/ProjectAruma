<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

    <%@include file="header-bar.jsp"%>
    
    
    
    
    
    
    <head>
    <link rel="stylesheet" href="y.css">
  </head>
    
    <br><br>
    
    <center><h2><b>Quantity Update</b></h2></center>
    <br><br>
    
     <div class="B">
      <div class="A">
      	<form action="EditCartServlet" method="post">
      	
      	<% 
      	
		     Connection connection = null;
		    PreparedStatement pst = null;
		    ResultSet resultSet = null;
		    
		    String driverName = "com.mysql.jdbc.Driver";
		    String connectionUrl = "jdbc:mysql://localhost:3306/arumadb";
		    String userId = "root";
		    String password = "";
      	
      
      	connection = DriverManager.getConnection(connectionUrl, userId, password);
      	
      	String design_id= request.getParameter("design_id");
      	
      	pst=connection.prepareStatement("SELECT quantity FROM arumadb.user_cart WHERE design_id=?");
      	pst.setString(1, design_id);
      	resultSet=pst.executeQuery();
      	
      	
      		while(resultSet.next()){
      	
      	%>
      	   
      	
      	    <div class="C">
      	    
      	    <br>
            <label for="quantity"><i class="fa fa-user"></i><h3>Quantity</h3></label>
            <input type="text"  name="quantity" value="<%=   resultSet.getString("quantity") %>"  id="quantity">
            
             <label for="design_id"><i class="fa fa-user"></i></label>
            <input type="hidden"  name="design_id" value="<%=design_id%>">
            
            
            <% } %>
            
            <br>
			<input type="submit" value="Submit" class="btn">
      	  </div>
      	</form>
    
      
      
      </div>
      </div>
      <br><br>
    
    <%@include file="footer-bar.jsp"%>