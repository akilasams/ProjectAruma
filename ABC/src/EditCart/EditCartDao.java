package EditCart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditCartDao {


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
	
public String updatecart(EditCart editcart) {
		
		loadDriver(dbdriver);
		Connection con=getConnection();
		
		String result = "data enterd succesfully";
		
		
		
		String sql="update arumadb.user_cart set quantity=? where design_id=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			
			ps.setString(1, editcart.getQuantity());
			ps.setString(2, editcart.getDesign_id());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
			
			
			
		}
		return result;
	}
	
	
	
	
	
}
