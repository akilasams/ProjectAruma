package com.register;

import com.user.Customer;
import com.user.Designer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
    String url="jdbc:mysql://localhost:3306/aruma_db?serverTimezone=UTC";
    String username="root";
    String password="ais@123321";
    String dbDriver="com.mysql.jdbc.Driver";

    /*String INSERT_USER="INSERT INTO USER (first_name,last_name,password,username,address,email,mobile_no) VALUES (?,?,?,?,?,?,?)";
    String SELECT_ALL_USERS="SELECT * FROM users";
    String SELECT_USER_BY_ID="SELECT id,first_name,last_name,password,username,address,email,mobile_no FROM user WHERE id=?";
    String DELETE_USER="DELETE FROM users WHERE id=?";*/

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

    //Create or Insert User
    public boolean insertCustomer(Customer customer) {
        Connection connection = getConnection();
        String sql = "INSERT INTO USER VALUES (NULL,?,?,?,?,?,?,?,?,?,NULL,NULL)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, customer.getFirstName());
            st.setString(2, customer.getLastName());
            st.setInt(3, customer.getUser_role_id());
            st.setString(4, customer.getEmail());
            st.setString(5, customer.getMobileNo());
            st.setString(6, customer.getAddress());
            st.setString(7, customer.getCity());
            st.setString(8, customer.getUsername());
            st.setString(9, customer.getPassword());
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertDesigner(Designer designer) {
        Connection connection=getConnection();
        String sql="INSERT INTO USER VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, designer.getFirstName());
            st.setString(2, designer.getLastName());
            st.setInt(3, designer.getUser_role_id());
            st.setString(4, designer.getEmail());
            st.setString(5, designer.getMobileNo());
            st.setString(6, designer.getAddress());
            st.setString(7, designer.getCity());
            st.setString(8, designer.getUsername());
            st.setString(9, designer.getPassword());
            st.setInt(10, designer.getServiceType());
            st.setString(11, designer.getBio());
            st.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
