<link rel="stylesheet" href="./assets/css/cart-wishlist.css">

<%@ page import="com.Cart.CartDisplay" %>
<%@ page import="com.Cart.CartDisplayDao" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>

    
    <%
    CartDisplayDao obj_read_data = new CartDisplayDao();
    List<CartDisplay> list = obj_read_data.get_values();
    Iterator<CartDisplay> it_list = list.iterator();
%>
   
  
  
  
  <div class="cart-container">
    <div class="cart">
        <h4 style="color: black">Your Cart</h4>
        <a href="#" class="close-cart"><i class="fas fa-times"></i></a>
        
        <div class="cart-item-holder">
        
         <%
                while (it_list.hasNext()) {
                    CartDisplay obj_design_bean = new CartDisplay();
                    obj_design_bean = it_list.next();

		 %>
        
            <div class="cart-item">
                <div class="item-img">
                    <img src="./assets/img/img2.jpg" alt="">
                </div>
                <div class="buy-info">
                    <p>Name <%=obj_design_bean.getDesign_name()%></p>
                    <p>Quantity  <span><input type="text" value="<%=obj_design_bean.getQuantity()%>"></span></p>
                    <input type="checkbox">
                </div>
                <div class="cart-icons">
                    <a href="#"><i class="fas fa-shopping-cart"></i></a>
                    <a href="#"><i class="fas fa-trash-alt"></i></a>
                </div>
            </div>
            
             <%
    }
    %>

            
            

        </div>
        <div class="cart-bottom">
            <h4>Total : XXXXXX</h4>
            <button class="place-order"><a href="shipping-payment.jsp">Place Order</a></button>
        </div>
    </div>
</div>

