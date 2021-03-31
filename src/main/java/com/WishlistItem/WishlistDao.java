package com.WishlistItem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.WishlistItem.Wishlist;


public class WishlistDao {
	
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
	
	
public String insert(Wishlist wishlist) {
		
		loadDriver(dbdriver);
		Connection con=getConnection();
		
		String result = "data enterd succesfully";
		
		
		
		String sql="insert into aruma_db.wishlist_item values((select user_id from user_wishlist where user_id=?),(select design_id from aruma_db.store_item where design_id=?),NULL)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setInt(1, wishlist.getUser_id());
			ps.setString(2, wishlist.getDesign_id());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
			
			
			
		}
		return result;

	}

}
