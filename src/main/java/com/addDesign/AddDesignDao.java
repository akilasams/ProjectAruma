package com.addDesign;

import com.dbConnection.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddDesignDao {
    public String insert(AddDesignMem member)
    {
        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";


        String sql = "insert into aruma_db.design (design_name,designtype_id, design_description, user_id) values(?,?,?,(select user_id from arumadb.users where users.user_id=1))";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);


            ps.setString(1, member.getDesign_name());
            ps.setString(2, member.getDesigntype_id());
            ps.setString(3, member.getDesign_description());

            ;
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            result="data not entered";
        }

        return result;
    }

}

