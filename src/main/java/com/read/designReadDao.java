package com.read;

import com.dbConnection.MyConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class designReadDao {

    public static void main(String[] args) {
        designReadDao obj_Read_Values=new designReadDao();
        obj_Read_Values.get_values();
    }

    public List get_values(){

        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";

        PreparedStatement ps=null;
        ResultSet rs=null;

        List <designReadMem> list = new ArrayList<designReadMem>();

        try {
            String querry="select * from aruma_db.design";
            ps=connection.prepareStatement(querry);
            rs=ps.executeQuery();


            while(rs.next()){
                designReadMem obj_mem=new designReadMem();


                System.out.println(rs.getString("design_id"));
                System.out.println(rs.getString("design_name"));
                System.out.println(rs.getString("designtype_id"));
                System.out.println(rs.getString("in_store"));
                System.out.println(rs.getString("design_description"));

                obj_mem.setDesign_id(rs.getString("design_id"));
                obj_mem.setDesign_name(rs.getString("design_name"));
                obj_mem.setDesigntype_id(rs.getString("designtype_id"));
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
