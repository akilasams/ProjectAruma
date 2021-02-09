package com.read;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class read_data {

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
        read_data obj_Read_Values=new read_data();
        obj_Read_Values.get_values();
    }
    public List get_values(){

        String dbdrivers = "com.mysql.jdbc.Driver";
        loadDriver(dbdrivers);
        Connection connection = getConnection();
        String result = "data entered successfully";

        PreparedStatement ps=null;
        ResultSet rs=null;

        List <design_bean> list = new ArrayList<design_bean>();

        try {
            String querry="select * from aruma_db.design";
            ps=connection.prepareStatement(querry);
            rs=ps.executeQuery();


            while(rs.next()){
                design_bean obj_mem=new design_bean();


                System.out.println(rs.getString("design_id"));
                System.out.println(rs.getString("design_name"));
                System.out.println(rs.getString("design_type"));
                System.out.println(rs.getString("in_store"));
                System.out.println(rs.getString("design_description"));

                obj_mem.setDesign_id(rs.getString("design_id"));
                obj_mem.setDesign_name(rs.getString("design_name"));
                obj_mem.setDesign_type(rs.getString("design_type"));
                obj_mem.setIn_store(rs.getString("in_store"));
                obj_mem.setDesign_description(rs.getString("design_description"));

                list.add(obj_mem);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

}
