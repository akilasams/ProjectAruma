package com.payment;

import com.dbConnection.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PaymentDao {

    public boolean insertPayment(int orderId){
        boolean rowsInserted = false;
        Connection connection = MyConnection.getConnection();
        String insertPayment_SQL = "INSERT INTO payment VALUES (DEFAULT,?,?,NOW())";

        try {
            PreparedStatement st = connection.prepareStatement(insertPayment_SQL);
            //st.setInt(1,paymentId);
            st.setInt(1,orderId);
            st.setInt(2,1); // payment_status = 1 => successful
            rowsInserted = st.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowsInserted;
    }
}
