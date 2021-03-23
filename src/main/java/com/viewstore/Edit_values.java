package com.viewstore;

import com.dbConnection.MyConnection;

import java.sql.*;

public class Edit_values {

//    public static void main(String[] args) {
//        view_data obj_view_Values=new view_data();
//        obj_view_Values.get_values();
//    }

    public view_bean get_values_of_store_items(String design_id){

        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";

        PreparedStatement ps=null;
        ResultSet rs=null;
        view_bean obj_mem=new view_bean();


        try {
            String querry="select * from arumadb.store_item where design_id=?";
            ps=connection.prepareStatement(querry);
            ps.setString(1, design_id);
            rs=ps.executeQuery();


            while(rs.next()){

                obj_mem.setDesign_id(rs.getString("design_id"));
                obj_mem.setStock(rs.getString("stock"));
                obj_mem.setUnit_price(rs.getString("unit_price"));
                obj_mem.setAdditional_details(rs.getString("additional_details"));
                obj_mem.setPublished_date(rs.getString("published_date"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return obj_mem;
    }
}
