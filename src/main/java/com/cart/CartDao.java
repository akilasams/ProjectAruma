package com.cart;

import com.dbConnection.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartDao {

    public int getCartId(int userId){
        int cartId=0;
        Connection connection = MyConnection.getConnection();
        String getCartId_SQL = "SELECT cart_id from user_cart WHERE user_id=?";

        try {
            PreparedStatement st = connection.prepareStatement(getCartId_SQL);
            st.setInt(1,userId);
            ResultSet rs = st.executeQuery();
            if(rs.next()==false){
                return 0;
            }else{
                do{
                    cartId = rs.getInt("cart_id");
                }while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cartId;
    }

}
