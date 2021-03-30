package com.forgotPassword;

import com.dbConnection.MyConnection;
import com.editDesigns.EditDesignsMem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class forgotPasswordDao {
    public String update(forgotPasswordMem member, String email)
    {
        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";
        
        String sql = "update aruma_db.user set password=? where user_id = (select user_id from aruma_db.user where email = ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, member.getNewPass());
            ps.setString(2, email);



            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            result="data not entered";
        }

        return result;
    }
}
