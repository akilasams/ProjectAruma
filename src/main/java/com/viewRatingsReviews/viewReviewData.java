package com.viewRatingsReviews;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class viewReviewData {

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

        public static void main(String[] args) {
        viewReviewData obj_view_Values=new viewReviewData();
        obj_view_Values.get_values();
    }
    public List get_values(){

        String dbdrivers = "com.mysql.jdbc.Driver";
        loadDriver(dbdrivers);
        Connection connection = getConnection();
        String result = "data entered successfully";

        PreparedStatement ps=null;
        ResultSet rs=null;

        List <viewRateReview> list = new ArrayList<viewRateReview>();

        try {
            String querry="select * from aruma_db.user_ratingreview";
            ps=connection.prepareStatement(querry);
            rs=ps.executeQuery();


            while(rs.next()){
                viewRateReview obj_mem=new viewRateReview();



                System.out.println(rs.getString("rating"));
                System.out.println(rs.getString("review"));



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
