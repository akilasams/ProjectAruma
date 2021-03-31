package com.CartItem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.CartItem.CartDisplay;
import com.CartItem.CartDisplayDao;

public class CartDisplayDao {
	
	private String dburl="jdbc:mysql://localhost:3306/aruma_db?serverTimezone=UTC";
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
	
	
	
public List get_values(String user_id) {
		
		loadDriver(dbdriver);
		Connection con=getConnection();
		
		String result = "data enterd succesfully";
		
		
		PreparedStatement ps=null;
        ResultSet rs=null;
        List <CartDisplay> list = new ArrayList<CartDisplay>();
		
		try {
			
			String sql="SELECT c.design_id,  c.quantity, d.design_name,s.unit_price FROM design d INNER JOIN cart_item c ON c.design_id=d.design_id INNER JOIN store_item s ON s.design_id=d.design_id WHERE c.cart_id=?";
			 
			ps=con.prepareStatement(sql);
			ps.setString(1,user_id);
			
			rs=ps.executeQuery();
			
			while(rs.next()){
                CartDisplay obj_mem=new CartDisplay();
                
                
                System.out.println(rs.getString("design_id"));
                System.out.println(rs.getString("design_name"));
                System.out.println(rs.getString("quantity"));
                System.out.println(rs.getDouble("unit_price"));
             

                obj_mem.setDesign_id(rs.getString("design_id"));
                obj_mem.setDesign_name(rs.getString("design_name"));
                obj_mem.setQuantity(rs.getString("quantity"));
                obj_mem.setUnit_price(rs.getDouble("unit_price"));
               
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
