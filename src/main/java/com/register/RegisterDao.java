package com.register;

import com.dbConnection.MyConnection;
import com.user.Customer;
import com.user.Designer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
    //Create or Insert User
    public boolean insertCustomer(Customer customer) {
        Connection connection = MyConnection.getConnection();
        String sql = "INSERT INTO USER VALUES (NULL,?,?,?,?,?,?,?,?,?,NULL,NULL,NULL)";
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
        Connection connection = MyConnection.getConnection();
        String sql="INSERT INTO USER VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,NULL)";
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
