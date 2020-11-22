<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>


<%@include file="header-bar.jsp"%>
<br>
<head>
<link rel="stylesheet" href="details.css">
</head>


  

<%
        try{
        	 
        	    Connection con=null;
        	    PreparedStatement pst=null;
        	    ResultSet resultSet=null;

        	    Class.forName("com.mysql.jdbc.Driver");
        	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arumadb","root","");
        	    
        	    String design_id=(String)request.getParameter("design_id"); 
        	      String sql = "select design_id, unit_price, additional_details from arumadb.store_item where design_id =?";
        	      pst=con.prepareStatement(sql);
        	      pst.setString(1, design_id); 
        	     resultSet= pst.executeQuery();
           
            		
    %>
   					 <div class="imp">
   					 <br><br><br>
   					 <div class="first">
   					 <br>
				    	<center><h2>Design Details</h2></center>
						<br><br>
				    	<div class="A">
				    	<h3>&nbsp Image: </h3><br><br><br><br>
				    	 <h3>Design Number: <%=resultSet.getString("design_id") %></h3>
				        
				         <h3>Price: <%=resultSet.getString("unit_price") %></h3>
				         <h3>Details: <%=resultSet.getString("additional_details") %></h3>
				         
				         </div>
				      
				     </div> 
				     </div>  
         <%
         		
            	
        con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>

