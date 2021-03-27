package com.addRating;

import com.dbConnection.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addRatingsDao {


    public String insert(addRatingMem member)
    {
        Connection connection = MyConnection.getConnection();

        String result = "data entered successfully";


        String sql = "insert into aruma_db.item_ratingreview (design_id, rating, review ) values( ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);


            ps.setString(1, member.getDesign_id());
            ps.setString(2, member.getRate());
            ps.setString(3, member.getReview());

            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            result="data not entered";
        }

        return result;
    }

}
