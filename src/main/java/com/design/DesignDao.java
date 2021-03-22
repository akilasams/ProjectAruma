package com.design;

import com.user.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DesignDao {
    String url="jdbc:mysql://localhost:3306/aruma_db?serverTimezone=UTC";
    String username="root";
    String password="ais@123321";
    String dbDriver="com.mysql.jdbc.Driver";

    private void loadDriver(String dbDriver){
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection(){
        Connection connection=null;
        try{
            loadDriver(dbDriver);
            connection = DriverManager.getConnection(url,username,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

    public List<Design> selectMyDesigns(int UserId){
        List<Design> myDesigns=new ArrayList<>();
        Connection connection=getConnection();
        String sql="SELECT * FROM design WHERE userId=?";
        try {
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    int designId=rs.getInt("design_id");
                    String designName=rs.getString("design_name");
                    int designTypeId=rs.getInt("designtype_id");
                    int isInStore=rs.getInt("in_store");
                    String designDescription=rs.getString("design_description");
                    int userId=rs.getInt("user_id");
                    myDesigns.add(new Design(designId, designName, designTypeId, isInStore,designDescription, userId));
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return myDesigns;
    }
}
