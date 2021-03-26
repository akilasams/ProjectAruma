package com.addSpecifics;

import com.dbConnection.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class storeDao {


    public String insert(storeMem member)
    {
        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";

        String sql = "insert into aruma_db.store_item values( (select design_id from aruma_db.design where design_id=?),?,?,?,?)";


        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, member.getDesign_id());
            ps.setString(2, member.getStock());
            ps.setString(3, member.getUnit_price());
            ps.setString(4, member.getAdditional_details());
            ps.setString(5, member.getPublished_date());


            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            result="data not entered";
        }


        return result;
    }
}
