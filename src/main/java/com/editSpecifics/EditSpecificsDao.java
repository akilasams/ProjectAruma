package com.editSpecifics;

import com.dbConnection.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditSpecificsDao {


//    private Connection con;
//
//    public void loadDriver(String dbdriver)
//    {
//        try {
//            Class.forName(dbdriver);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
//    public Connection getConnection() {
//
//        Connection con = null;
//        try {
//            String dburl = "jdbc:mysql://localhost:3306/aruma_db?serverTimezone=UTC";
//            String dbuname = "root";
//            String dbpassword = "";
//            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return con;
//    }


    public String Update(EditSpecificsMem member)
    {
        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";

        String sql = "update aruma_db.store_item set stock=?, unit_price=?, additional_details=?, published_date=? where design_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);


            ps.setString(1, member.getStock());
            ps.setString(2, member.getUnit_price());
            ps.setString(3, member.getAdditional_details());
            ps.setString(4, member.getPublished_date());
            ps.setString(5, member.getDesign_id());


            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            result="data not entered";
        }

        return result;
    }
}
