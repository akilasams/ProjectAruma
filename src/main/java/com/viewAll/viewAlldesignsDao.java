package com.viewAll;

import com.dbConnection.MyConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class viewAlldesignsDao {

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

//    public static void main(String[] args) {
//        viewall_data obj_viewall_Values=new viewall_data();
//        obj_viewall_Values.get_values();
//    }

    public List get_values(){
        Connection connection = MyConnection.getConnection();
//        String dbdrivers = "com.mysql.jdbc.Driver";
//        loadDriver(dbdrivers);
//        Connection connection = getConnection();
        String result = "data entered successfully";

        PreparedStatement ps=null;
        ResultSet rs=null;

        List <viewAlldesignsMem> list = new ArrayList<viewAlldesignsMem>();

        try {
            String querry="select * from aruma_db.design INNER JOIN aruma_db.store_item ON design.design_id = store_item.design_id";
            ps=connection.prepareStatement(querry);
            rs=ps.executeQuery();


            while(rs.next()){
                viewAlldesignsMem obj_mem=new viewAlldesignsMem();

                System.out.println(rs.getString("design_id"));
                System.out.println(rs.getString("design_name"));
                System.out.println(rs.getString("designtype_id"));
                System.out.println(rs.getString("in_store"));
                System.out.println(rs.getString("design_description"));

                System.out.println(rs.getString("stock"));
                System.out.println(rs.getString("unit_price"));
                System.out.println(rs.getString("additional_details"));
                System.out.println(rs.getString("published_date"));


                obj_mem.setDesign_id(rs.getString("design_id"));
                obj_mem.setDesign_name(rs.getString("design_name"));
                obj_mem.setDesigntype_id(rs.getString("designtype_id"));
                obj_mem.setIn_store(rs.getString("in_store"));
                obj_mem.setDesign_description(rs.getString("design_description"));



                obj_mem.setStock(rs.getString("stock"));
                obj_mem.setUnit_price(rs.getString("unit_price"));
                obj_mem.setAdditional_details(rs.getString("additional_details"));
                obj_mem.setPublished_date(rs.getString("published_date"));

                list.add(obj_mem);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

}
