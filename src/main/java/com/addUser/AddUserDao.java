package com.addUser;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

//import com.sun.jdi.connect.spi.Connection;
import com.dbConnection.MyConnection;
import com.viewRatingsReviews.viewRateReview;


public class AddUserDao {

    public String insert(AddUser user) {
        Connection con= MyConnection.getConnection();
        String result="Data entered successfully";
        String sql="insert into aruma_db.user (first_name,last_name,user_role_id,email,mobile_no,address,city,username,password,category_id,bio,prof_pic) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, user.getFirst_name());
            ps.setString(2, user.getLast_name());
            ps.setString(3, user.getUser_role_id());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getMobile_no());
            ps.setString(6, user.getAddress());
            ps.setString(7, user.getCity());
            ps.setString(8, user.getUsername());
            ps.setString(9, user.getPassword());

            ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result="Data not entered";
        }
        return result;
    }

//    public static void main(String[] args) {
//        AddUserDao obj_Read_Values=new AddUserDao();
//        obj_Read_Values.get_values();
//    }

//	public List get_values() {
//		// TODO Auto-generated method stub
//
//	}


    public List get_values() {
        Connection con=MyConnection.getConnection();

        String result = "data enterd succesfully";

        PreparedStatement ps=null;
        ResultSet rs=null;
        List <AddUser> list = new ArrayList<AddUser>();

        try {

            String sql="SELECT user_id, first_name, last_name, user_role_id, email, mobile_no, address, city, username, password FROM aruma_db.user where user_role_id=2 ";
            ps=con.prepareStatement(sql);


            rs=ps.executeQuery();

            while(rs.next()){
                AddUser obj_mem=new AddUser();


                rs.getString("user_id");
                rs.getString("first_name");
                rs.getString("last_name");
               rs.getString("user_role_id");
                rs.getString("email");
                rs.getString("mobile_no");
                rs.getString("address");
               rs.getString("city");
                rs.getString("username");
                rs.getString("password");


                obj_mem.setUser_id(rs.getString("user_id"));
                obj_mem.setFirst_name(rs.getString("first_name"));
                obj_mem.setLast_name(rs.getString("last_name"));
                obj_mem.setUser_role_id(rs.getString("user_role_id"));
                obj_mem.setEmail(rs.getString("email"));
                obj_mem.setMobile_no(rs.getString("mobile_no"));
                obj_mem.setAddress(rs.getString("address"));
                obj_mem.setCity(rs.getString("city"));
                obj_mem.setUsername(rs.getString("username"));
                obj_mem.setPassword(rs.getString("password"));


                list.add(obj_mem);
            }



        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result="Data not entered";



        }

        return list;
        // TODO Auto-generated method stub

    }

    public List get_values_ratings(){
        Connection con=MyConnection.getConnection();

        String result = "data enterd succesfully";

        PreparedStatement ps=null;
        ResultSet rs=null;
        List<viewRateReview> list = new ArrayList<>();

        try {

            String sql="SELECT * from aruma_db.user_ratingreview inner join aruma_db.user u on u.user_id = user_ratingreview.user_id where user_role_id=2";
            ps=con.prepareStatement(sql);


            rs=ps.executeQuery();

            while(rs.next()){
//                AddUser obj_mem=new AddUser();
                viewRateReview obj_rate = new viewRateReview();

                System.out.println(rs.getString("rating"));

                obj_rate.setRating(rs.getString("rating"));


                list.add(obj_rate);
            }



        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result="Data not entered";



        }

        return list;
        // TODO Auto-generated method stub

    }


    public List get_values_reviews(String user_id){
        Connection con=MyConnection.getConnection();

        String result = "data enterd succesfully";

        PreparedStatement ps=null;
        ResultSet rs=null;
        List<viewRateReview> list = new ArrayList<>();

        try {

            String sql="SELECT user_ratingreview.review from aruma_db.user_ratingreview inner join aruma_db.user u on u.user_id = user_ratingreview.user_id where u.user_id = ?";
            ps=con.prepareStatement(sql);
            ps.setString(1,user_id);

            rs=ps.executeQuery();

            while(rs.next()){
//                AddUser obj_mem=new AddUser();
                viewRateReview obj_rate1 = new viewRateReview();

                System.out.println(rs.getString("review"));

                obj_rate1.setReview(rs.getString("review"));

                list.add(obj_rate1);
            }



        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result="Data not entered";



        }

        return list;
        // TODO Auto-generated method stub

    }




    public String updateuser(AddUser adduser) {
        Connection con=MyConnection.getConnection();

        String result = "data enterd succesfully";



        String sql="update aruma_db.user set first_name=?, last_name=?, user_role_id=?, email=?, mobile_no=?, address=?, city=?, username=?, password=? where user_id=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);


            ps.setString(1, adduser.getFirst_name());
            ps.setString(2, adduser.getLast_name());
            ps.setString(3, adduser.getUser_role_id());
            ps.setString(4, adduser.getEmail());
            ps.setString(5, adduser.getMobile_no());
            ps.setString(6, adduser.getAddress());
            ps.setString(7, adduser.getCity());
            ps.setString(8, adduser.getUsername());
            ps.setString(9, adduser.getPassword());

            ps.setString(10, adduser.getUser_id());

            ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result="Data not entered";



        }
        return result;
    }

    @SuppressWarnings("null")
    public String deleteUser(AddUser adduser) throws SQLException {

        Connection con=MyConnection.getConnection();

        String result = "data enterd succesfully";


        String sql ="delete from aruma_db.user where user_id=?";
        //String sql="delete from user where first_name=?, last_name=?, user_role_id=?, email=?, mobile_no=?, address=?, city=?, username=?, password=?, category_id=?, bio=?, prof_pic=? user_id=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            PreparedStatement st = null;
            String user_id = null;
            st.setString(1, user_id);
            Connection connection = MyConnection.getConnection();
            Statement statement = ((Connection) connection).createStatement();
            //String sql ="delete from aruma_db.user where user_id=?";
            //String Query ="delete from user where user_id=?";
            //Object resultSet = statement.executeUpdate(sql);


//		ps.setString(1, adduser.getFirst_name());
//		ps.setString(2, adduser.getLast_name());
//		ps.setString(3, adduser.getUser_role_id());
//		ps.setString(4, adduser.getEmail());
//		ps.setString(5, adduser.getMobile_no());
//		ps.setString(6, adduser.getAddress());
//		ps.setString(7, adduser.getCity());
//		ps.setString(8, adduser.getUsername());
//		ps.setString(9, adduser.getPassword());
//		ps.setString(10, adduser.getCategory_id());
//		ps.setString(11, adduser.getBio());
//		ps.setString(12, adduser.getProf_pic());
//		ps.setString(13, adduser.getUser_id());

            //PreparedStatement ps = null;
            //ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            result="Data not entered";

        }
        return result;
    }
}
