package com.design;

import com.dbConnection.MyConnection;
import com.user.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DesignDao {

    public List<Design> selectMyDesigns(int UserId){
        List<Design> myDesigns=new ArrayList<>();
        Connection connection = MyConnection.getConnection();
        String sql="SELECT * FROM design WHERE user_id=?";
        try {
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    int designId=rs.getInt("design_id");
                    String designName=rs.getString("design_name");
                    int designTypeId=rs.getInt("designtype_id");
                    int isInStore=rs.getInt("in_store");
                    String designDescription=rs.getString("design_description");
                    int userId=rs.getInt("user_id");
                    myDesigns.add(new Design(designId, designName, designTypeId, isInStore,designDescription, userId));
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return myDesigns;
    }
}
