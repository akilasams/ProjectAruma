package com.WishlistItem;

public class WishlistDisplay {
	
	private  String wishlist_id;
	 String design_id;
	 String design_name;
	 String design_description;
	 String unit_price;
	 int user_id;

public WishlistDisplay( String design_id,String design_name,String design_description,String unit_price,int user_id) {
super();
this.design_id=design_id;
this.design_name=design_id;
this.design_description=design_description;
this.unit_price=unit_price;
this.user_id=user_id;
}

public WishlistDisplay() {
// TODO Auto-generated constructor stub
}

public String getWishlist_id() {
return wishlist_id;
}



public void setCart_id(String wishlist_id) {
this.wishlist_id = wishlist_id;
}



public String getDesign_id() {
return design_id;
}



public void setDesign_id(String design_id) {
this.design_id = design_id;
}

public String getDesign_name() {
return design_name;
}



public void setDesign_name(String design_name) {
this.design_name = design_name;
}


public String getDesign_description() {
return design_description;
}



public void setDesign_description(String design_description) {
this.design_description = design_description;
}

public String getUnit_price() {
return unit_price;
}



public void setUnit_price(String unit_price) {
this.unit_price = unit_price;
}

public int getUser_id() {
    return user_id;
}

public void setUser_id(int user_id) {
    this.user_id = user_id;
}



}
