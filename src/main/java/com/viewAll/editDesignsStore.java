package com.viewAll;

import com.dbConnection.MyConnection;

import java.sql.*;

public class editDesignsStore {




    public viewAlldesignsMem get_values(String design_id){
        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";

        PreparedStatement ps=null;
        ResultSet rs=null;
        viewAlldesignsMem obj_mem=new viewAlldesignsMem();



        try {
            String querry="select * from aruma_db.design INNER JOIN aruma_db.store_item ON design.design_id = store_item.design_id where design.design_id=?";
            ps=connection.prepareStatement(querry);
            ps.setString(1, design_id);
            rs=ps.executeQuery();


            while(rs.next()){





                obj_mem.setDesign_id(rs.getString("design_id"));
                obj_mem.setDesign_name(rs.getString("design_name"));
                obj_mem.setDesigntype_id(rs.getString("designtype_id"));
                obj_mem.setIn_store(rs.getString("in_store"));
                obj_mem.setDesign_description(rs.getString("design_description"));


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
