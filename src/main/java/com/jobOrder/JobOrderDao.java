package com.jobOrder;

import com.user.User;

import java.sql.*;

public class JobOrderDao {

    String url="jdbc:mysql://localhost:3306/aruma_db?serverTimezone=UTC";
    String username="root";
    String password="ais@123321";
    String dbDriver="com.mysql.jdbc.Driver";

    private void loadDriver(String dbDriver){
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection(){
        Connection connection=null;
        try{
            loadDriver(dbDriver);
            connection = DriverManager.getConnection(url,username,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

    public boolean insertJobOrder(JobOrder jobOrder){
        Connection connection = getConnection();
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
        Connection connection = getConnection();
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
        Connection connection = getConnection();
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
