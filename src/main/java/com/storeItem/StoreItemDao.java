package com.storeItem;

import com.design.Design;
import com.user.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StoreItemDao {
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

    public List<StoreItem> selectAllItems(){
        List<StoreItem> allItems=new ArrayList<>();
        Connection connection=getConnection();
        String selectAllItems_SQL="call GetAllStoreItems";
        try {
            CallableStatement st= connection.prepareCall(selectAllItems_SQL);
            ResultSet rs=st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    int designId=rs.getInt("design_id");
                    String designName=rs.getString("design_name");
                    String designDescription=rs.getString("design_description");
                    int userId=rs.getInt("user_id");
                    String firstName=rs.getString("first_name");
                    String lastName=rs.getString("last_name");
                    int stock=rs.getInt("stock");
                    String designType=rs.getString("type_name");
                    double unitPrice=rs.getDouble("unit_price");
                    String additionalDetails=rs.getString("additional_details");
                    String publishedDate=rs.getString("published_date");
                    allItems.add(new StoreItem(designId, designName,designDescription,userId,firstName,lastName,stock,designType, unitPrice, additionalDetails,publishedDate));
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return allItems;
    }

    public StoreItem selectStoreItembyId(int itemId){
        StoreItem storeItem=null;
        Connection connection=getConnection();
        String selectByDesignId_SQL="call GetItemById(?)";
        try {
            CallableStatement st=connection.prepareCall(selectByDesignId_SQL);
            st.setInt(1, itemId);
            ResultSet rs=st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    int designId=rs.getInt("design_id");
                    String designName=rs.getString("design_name");
                    String designDescription=rs.getString("design_description");
                    int userId=rs.getInt("user_id");
                    String firstName=rs.getString("first_name");
                    String lastName=rs.getString("last_name");
                    int stock=rs.getInt("stock");
                    String designType=rs.getString("type_name");
                    double unitPrice=rs.getDouble("unit_price");
                    String additionalDetails=rs.getString("additional_details");
                    String publishedDate=rs.getString("published_date");
                    storeItem = new StoreItem(designId, designName,designDescription,userId,firstName,lastName,stock,designType, unitPrice, additionalDetails,publishedDate);
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return storeItem;
    }

}
