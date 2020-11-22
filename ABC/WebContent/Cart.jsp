<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="CartItemDelete.CartDelete" %>
<%@ page import="CartItemDelete.CartDeleteDao" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
    
    <%@include file="header-bar.jsp"%>
    <br>
    
    <head>
    
    	<link rel="stylesheet" href="z.css">
    
    </head>
    
    
    <%
    CartDeleteDao obj_read_data = new CartDeleteDao();
    List<CartDelete> list = obj_read_data.get_values();
    Iterator<CartDelete> it_list = list.iterator();
%>
   <center>
    <h2>My Cart</h2>
   
    
    <table border="1">
    <tr>
        <td>
            <u>Design Number</u>
        </td>
        <td>
            <u>Quantity</u>
        </td>
        <td>
            <u>Price</u>
        </td>
        <td>
            <u>Description</u>
        </td>
        <td>
            <u>Buy Now</u>
        </td>
        <td>
            <u>Delete</u>
        </td>
        
         <td>
            <u>Update</u>
        </td>
    </tr>

    <%
                while (it_list.hasNext()) {
                    CartDelete obj_design_bean = new CartDelete();
                    obj_design_bean = it_list.next();

%>


<tr>



         <td><%=obj_design_bean.getDesign_id()%></td>
        <td><%=obj_design_bean.getQuantity()%></td>
        <td><%=obj_design_bean.getUnit_price()%></td>
        <td><%=obj_design_bean.getAdditional_details()%></td>

 <td> <label>
          <input type="checkbox" checked="checked" name="sameadr"> 
        </label></a><br> 
        
        <td><a href="k.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">Delete</a> </td>
       

        <td><a href="UpdateCart_details.jsp?design_id=<%=obj_design_bean.getDesign_id()%>">Edit</a></td>

</tr>
    <%
    }
    %>
</table>
 </center> <br>
 
 <button type="submit" class="btn1"><a href="placeorder.jsp">Place Order </a></button><br><br>
    <br><br><br>
    
    
 <div class="total">
 		<h3> Total Price=</h3>
 </div>

<br><br><br><br><br><br><br><br>
    
    
    <%@include file="footer-bar.jsp"%>