package com.read;

import com.dbConnection.MyConnection;

import java.sql.*;

public class editValuesDao {

    public designReadMem get_value_of_design(String design_id){
        Connection connection = MyConnection.getConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        designReadMem obj_mem=new designReadMem();


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
