package com.CartItem;

public class Cart {
	
	private  String cart_id;
    String design_id;
    String quantity;  
    private int user_id;


public Cart( String design_id,String quantity,int user_id) {
super();

this.design_id=design_id;

this.quantity=quantity;
this.user_id=user_id;


}



public Cart(int userId, String design_id2, String quantity2) {
	// TODO Auto-generated constructor stub
}



public String getCart_id() {
return cart_id;
}



public void setCart_id(String cart_id) {
this.cart_id = cart_id;
}



public String getDesign_id() {
return design_id;
}



public void setDesign_id(String design_id) {
this.design_id = design_id;
}



public String getQuantity() {
return quantity;
}



public void setQuantity(String quantity) {
this.quantity = quantity;
}

public int getUser_id() {
    return user_id;
}

public void setUser_id(int user_id) {
    this.user_id = user_id;
}

}
