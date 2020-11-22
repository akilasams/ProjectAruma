
public class Cart {
	
	private  String cart_id;
	         String design_id;
	         String quantity;  
	         
	         
	
	
	public Cart( String design_id,String quantity) {
		super();
		this.design_id=design_id;
		
		this.quantity=quantity;
		
		
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
	
	
	

}
