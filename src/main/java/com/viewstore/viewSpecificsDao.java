package com.viewstore;

import com.dbConnection.MyConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class viewSpecificsDao {


//    public static void main(String[] args) {
//        view_data obj_view_Values=new view_data();
//        obj_view_Values.get_values();
//    }

    public List get_values(String design_ids){

        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";

        PreparedStatement ps=null;
        ResultSet rs=null;

        List <viewSpecificsMem> list = new ArrayList<viewSpecificsMem>();

        try {
            String querry="select * from aruma_db.store_item where design_id = ?";
            ps=connection.prepareStatement(querry);
            ps.setString(1, design_ids);
            rs=ps.executeQuery();



            while(rs.next()){
                viewSpecificsMem obj_mem=new viewSpecificsMem();



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
