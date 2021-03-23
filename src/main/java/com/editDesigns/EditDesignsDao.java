package com.editDesigns;



import com.dbConnection.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditDesignsDao {

    public String update(EditDesignsMem member)
    {
        Connection connection = MyConnection.getConnection();
        String result = "data entered successfully";

        String sql = "update aruma_db.design set design_name=?, designtype_id=?, design_description=? where design_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);


            ps.setString(1, member.getDesign_name());
            ps.setString(2, member.getDesign_type());
            ps.setString(3, member.getDesign_description());
            ps.setString(4, member.getDesign_id());

            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            result="data not entered";
        }

        return result;
    }
}
