package com.addRating;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addRatingsDao {
    private Connection con;

    public void loadDriver(String dbdriver)
    {
        try {
            Class.forName(dbdriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public Connection getConnection() {

        Connection con = null;
        try {
            String dburl = "jdbc:mysql://localhost:3306/aruma_db?serverTimezone=UTC";
            String dbuname = "root";
            String dbpassword = "";
            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }



    public String insert(addRatingMem member)
    {
        String dbdrivers = "com.mysql.jdbc.Driver";
        loadDriver(dbdrivers);
        Connection connection = getConnection();
        String result = "data entered successfully";


        String sql = "insert into aruma_db.user_ratingreview (user_id, rating, review, design_id) values(1, ?, ?, 1)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);


            ps.setString(1, member.getRate());
            ps.setString(2, member.getReview());

            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            result="data not entered";
        }

        return result;
    }

}
