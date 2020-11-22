import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import java.util.ArrayList;
import java.util.List;

public class CartDao{
	
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
	
	public String insert(Cart cart) {
		
		loadDriver(dbdriver);
		Connection con=getConnection();
		
		String result = "data enterd succesfully";
		
		
		
		String sql="insert into arumadb.user_cart values(NULL,(select user_id from arumadb.users where username='nadee925'),(select design_id from arumadb.store_item where design_id=?),?,NULL)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			
			ps.setString(1, cart.getDesign_id());
			ps.setString(2, cart.getQuantity());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
			
			
			
		}
		return result;
	}
	
	
	
	


	
	
	

}
