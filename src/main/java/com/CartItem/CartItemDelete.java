package com.CartItem;

public class CartItemDelete {
	
	private  String cart_id;
    String design_id;
   int user_id;
    
    


public CartItemDelete( String design_id,int user_id) {
super();
this.design_id=design_id;
this.user_id=user_id;

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

public int getUser_id() {
    return user_id;
}

public void setUser_id(int user_id) {
    this.user_id = user_id;
}


}
