<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
    String id=request.getParameter("design_id");
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arumadb?serverTimezone=UTC", "root", "");
        Statement st=conn.createStatement();
        int i=st.executeUpdate("DELETE FROM aruma_db.store_item WHERE design_id="+id);
        response.sendRedirect("specifics_added.jsp");

    }
    catch(Exception e)
    {
        System.out.print(e);
        e.printStackTrace();
    }
%>
