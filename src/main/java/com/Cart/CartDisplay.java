package com.Cart;

public class CartDisplay {
	
	private  String cart_id;
    String design_id;
    String quantity;  
    String unit_price;
    String additional_details;
    String design_name;
    
    


public CartDisplay( String design_id,String quantity, String unit_price,String additiona_details, String design_name ) {
super();
this.design_id=design_id;

this.quantity=quantity;
this.unit_price=unit_price;
this.additional_details=additional_details;
this.design_name= design_name;

}




public CartDisplay() {
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




public String getUnit_price() {
	return unit_price;
}




public void setUnit_price(String unit_price) {
	this.unit_price = unit_price;
}




public String getAdditional_details() {
	return additional_details;
}




public void setAdditional_details(String additional_details) {
	this.additional_details = additional_details;
}

public String getDesign_name() {
	return design_name;
}




public void setDesign_name(String design_name) {
	this.design_name = design_name;
}


}
