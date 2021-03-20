package com.Cart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDisplayDao {

	
	private String dburl="jdbc:mysql://localhost:3306/arumadbnew?serverTimezone=UTC";
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
        CartDisplayDao obj_Read_Values=new CartDisplayDao();
        obj_Read_Values.get_values();
    }
	
	
	
public List get_values() {
		
		loadDriver(dbdriver);
		Connection con=getConnection();
		
		String result = "data enterd succesfully";
		
		PreparedStatement ps=null;
        ResultSet rs=null;
        List <CartDisplay> list = new ArrayList<CartDisplay>();
		
		try {
			String sql="SELECT c.design_id,  c.quantity, d.design_name FROM cart_item c INNER JOIN design d ON c.design_id=d.design_id WHERE c.cart_id=1111";
			 ps=con.prepareStatement(sql);
			
			
			rs=ps.executeQuery();
			
			while(rs.next()){
                CartDisplay obj_mem=new CartDisplay();


                System.out.println(rs.getString("design_id"));
                
                System.out.println(rs.getString("quantity"));
                System.out.println(rs.getString("design_name"));
               
               

                obj_mem.setDesign_id(rs.getString("design_id"));
               
                obj_mem.setQuantity(rs.getString("quantity"));
                obj_mem.setDesign_name(rs.getString("design_name"));
               
                

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
