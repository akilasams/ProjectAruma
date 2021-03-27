package com.viewstore;

import com.dbConnection.MyConnection;

import java.sql.*;

public class editSpecifics {



    public viewSpecificsMem get_values_of_store_items(String design_id){

        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";

        PreparedStatement ps=null;
        ResultSet rs=null;
        viewSpecificsMem obj_mem=new viewSpecificsMem();


        try {
            String querry="select * from aruma_db.store_item where design_id=?";
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
