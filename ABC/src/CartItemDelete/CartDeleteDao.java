package CartItemDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDeleteDao {
	
	
	private String dburl="jdbc:mysql://localhost:3306/arumadb";
	private String dbuname="root";
	private String dbpassword="";
	private String dbdriver="com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public Connection getConnection() {
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
	public static void main(String[] args) {
        CartDeleteDao obj_Read_Values=new CartDeleteDao();
        obj_Read_Values.get_values();
    }
	
	
	
public List get_values() {
		
		loadDriver(dbdriver);
		Connection con=getConnection();
		
		String result = "data enterd succesfully";
		
		PreparedStatement ps=null;
        ResultSet rs=null;
        List <CartDelete> list = new ArrayList<CartDelete>();
		
		try {
			String sql="SELECT c.design_id, c.quantity, s.unit_price, s.additional_details FROM user_cart c INNER JOIN store_item s ON c.design_id=s.design_id WHERE c.user_id=1112";
			 ps=con.prepareStatement(sql);
			
			
			rs=ps.executeQuery();
			
			while(rs.next()){
                CartDelete obj_mem=new CartDelete();


                System.out.println(rs.getString("design_id"));
                System.out.println(rs.getString("quantity"));
                System.out.println(rs.getString("unit_price"));
                System.out.println(rs.getString("additional_details"));
               

                obj_mem.setDesign_id(rs.getString("design_id"));
                obj_mem.setQuantity(rs.getString("quantity"));
                obj_mem.setUnit_price(rs.getString("unit_price"));
                obj_mem.setAdditional_details(rs.getString("additional_details"));
                

                list.add(obj_mem);
            }
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
			
			
			
		}
		return list;
	}
	

}
