package com.WishlistItem;

public class Wishlist {

	private  String wishlist_id;
    String design_id;
    int user_id;
    

	public Wishlist( String design_id,int user_id) {
		super();
		this.design_id=design_id;
		this.user_id=user_id;
		
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
	
	public int getUser_id() {
	    return user_id;
	}

	public void setUser_id(int user_id) {
	    this.user_id = user_id;
	}
	
}
