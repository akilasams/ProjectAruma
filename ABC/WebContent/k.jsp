<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<%@page import="java.sql.*" %>


<%
    String id = request.getParameter("design_id");
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arumadb","root","");
    
   
      pst = con.prepareStatement("delete from arumadb.user_cart where design_id = ?");
      pst.setString(1, id);
      pst.executeUpdate();
    


%>

<%@include file="header-bar.jsp"%>
<head>
<link rel="stylesheet" type="text/css" href="k.css">
</head>

    <br><br><br>

<div class="box">
		<br>
		<h3> Do you want to delete this item from here?</h3><br>

		<a href="Cart.jsp"><button type="submit">Yes</button> </a>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
		
		<button type="submit2">No</button>
		

	</div>
	
	<br><br><br><br><br><br>
<%@include file="footer-bar.jsp"%>