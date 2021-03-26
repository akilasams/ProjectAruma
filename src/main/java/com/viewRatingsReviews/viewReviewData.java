package com.viewRatingsReviews;

import com.dbConnection.MyConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class viewReviewData {

    public List get_values(String design_id){
        Connection connection = MyConnection.getConnection();

        String result = "data entered successfully";

        PreparedStatement ps=null;
        ResultSet rs=null;

        List <viewRateReview> list = new ArrayList<viewRateReview>();

        try {
            String querry="select * from aruma_db.item_ratingreview where design_id=?";

            ps=connection.prepareStatement(querry);
            ps.setString(1,design_id);
            rs=ps.executeQuery();


            while(rs.next()){
                viewRateReview obj_mem=new viewRateReview();
                System.out.println(rs.getString("design_id"));
                System.out.println(rs.getString("rating"));
                System.out.println(rs.getString("review"));

                obj_mem.setRating(rs.getString("design_id"));
                obj_mem.setRating(rs.getString("rating"));
                obj_mem.setReview(rs.getString("review"));
                list.add(obj_mem);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

}
