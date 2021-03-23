package com.jobOrder;

import com.dbConnection.MyConnection;
import com.user.User;

import java.sql.*;

public class JobOrderDao {
    public boolean insertJobOrder(JobOrder jobOrder){
        Connection connection = MyConnection.getConnection();
        String insertJobOrder_SQL = "INSERT INTO job_order VALUES(DEFAULT,?,?,0,0,NOW(),?,?,?)";

        try {
            PreparedStatement st=connection.prepareStatement(insertJobOrder_SQL);
            st.setInt(1,jobOrder.getFromId());
            st.setInt(2,jobOrder.getToId());
            st.setString(3,jobOrder.getOrderDesc());
            st.setString(4,jobOrder.getDuration());
            st.setInt(5,jobOrder.getQuantity());
            st.executeUpdate();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

    public boolean setOrderAsAccepted(int jobOrderId){
        Connection connection = MyConnection.getConnection();
        String setOrderAsAccepted_SQL = "UPDATE job_order SET accepted=1 WHERE job_order_id=?";

        try {
            PreparedStatement st=connection.prepareStatement(setOrderAsAccepted_SQL);
            st.setInt(1,jobOrderId);
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

    public boolean setOrderAsConfirmed(int jobOrderId){ //by Customer
        Connection connection = MyConnection.getConnection();
        String setOrderAsConfirmed_SQL = "UPDATE job_order SET confirmed=1 WHERE job_order_id=?";

        try {
            PreparedStatement st=connection.prepareStatement(setOrderAsConfirmed_SQL);
            st.setInt(1,jobOrderId);
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

}
