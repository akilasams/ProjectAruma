package com.read;

import com.dbConnection.MyConnection;

import java.sql.*;

public class edit_values {


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
//            String dburl = "jdbc:mysql://localhost:3306/arumadb?serverTimezone=UTC";
//            String dbuname = "root";
//            String dbpassword = "";
//            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return con;
//    }


//    public static void main(String[] args) {
//        read_data obj_Read_Values=new read_data();
//        obj_Read_Values.get_values();
//    }
    public design_bean get_value_of_design(String design_id){
        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";

        PreparedStatement ps=null;
        ResultSet rs=null;
        design_bean obj_mem=new design_bean();


        try {
            String querry="select * from aruma_db.design where design_id=?";
            ps=connection.prepareStatement(querry);
            ps.setString(1, design_id);
            rs=ps.executeQuery();


            while(rs.next()){




                obj_mem.setDesign_id(rs.getString("design_id"));
                obj_mem.setDesign_name(rs.getString("design_name"));
                obj_mem.setDesigntype_id(rs.getString("designtype_id"));
                obj_mem.setIn_store(rs.getString("in_store"));
                obj_mem.setDesign_description(rs.getString("design_description"));


            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return obj_mem;
    }
}
