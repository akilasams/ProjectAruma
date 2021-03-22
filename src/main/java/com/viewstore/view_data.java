package com.viewstore;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class view_data {
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
            String dburl = "jdbc:mysql://localhost:3306/arumadb?serverTimezone=UTC";
            String dbuname = "root";
            String dbpassword = "";
            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        view_data obj_view_Values=new view_data();
        obj_view_Values.get_values();
    }
    public List get_values(){

        String dbdrivers = "com.mysql.jdbc.Driver";
        loadDriver(dbdrivers);
        Connection connection = getConnection();
        String result = "data entered successfully";

        PreparedStatement ps=null;
        ResultSet rs=null;

        List <view_bean> list = new ArrayList<view_bean>();

        try {
            String querry="select * from arumadb.store_item";
            ps=connection.prepareStatement(querry);
            rs=ps.executeQuery();


            while(rs.next()){
                view_bean obj_mem=new view_bean();



                System.out.println(rs.getString("stock"));
                System.out.println(rs.getString("unit_price"));
                System.out.println(rs.getString("additional_details"));
                System.out.println(rs.getString("published_date"));
                System.out.println(rs.getString("design_id"));


                obj_mem.setStock(rs.getString("stock"));
                obj_mem.setUnit_price(rs.getString("unit_price"));
                obj_mem.setAdditional_details(rs.getString("additional_details"));
                obj_mem.setPublished_date(rs.getString("published_date"));
                obj_mem.setDesign_id(rs.getString("design_id"));
                list.add(obj_mem);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

}
