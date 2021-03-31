package com.CartItem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.CartItem.CartItemDelete;
import com.CartItem.CartItemDeleteDao;


public class CartItemDeleteDao {


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
	
	
public String delete(CartItemDelete cartitemdelete) {
		
		loadDriver(dbdriver);
		Connection con=getConnection();
		
		String result = "data enterd succesfully";
		
		
		
		String sql="delete from aruma_db.cart_item where design_id =? and (select cart_id from user_cart where user_id=?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			
			ps.setString(1, cartitemdelete.getDesign_id());
			ps.setInt(2, cartitemdelete.getUser_id());
			
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not deleted";
			
			
			
		}
		return result;
	}
	
}
