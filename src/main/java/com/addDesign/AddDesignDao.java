package com.addDesign;

import com.dbConnection.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddDesignDao {


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




    public String insert(AddDesignMem member)
    {
        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";


        String sql = "insert into aruma_db.design (design_name,designtype_id, design_description, user_id) values(?,?,?,(select user_id from aruma_db.users where users.user_id=1))";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);


            ps.setString(1, member.getDesign_name());
            ps.setString(2, member.getDesigntype_id());
            ps.setString(3, member.getDesign_description());

            ;
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            result="data not entered";
        }

        return result;
    }

}

