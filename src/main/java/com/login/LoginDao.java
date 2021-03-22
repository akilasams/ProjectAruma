package com.login;

import java.sql.*;

//DAO - Data Access Object
public class LoginDao {
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

    public boolean checkCredentials(String uname,String pass) {
        Connection connection = getConnection();
        String sql = "SELECT password FROM user WHERE username=?";
        try {
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1,uname); //1st ? = uname
            ResultSet rs=st.executeQuery();
            if(rs.next()){ //If theres a record such that uname = DB uname & pass = DB pass (If result set exists)
                String dbPass = rs.getString("password");
                if(dbPass.equals(SHA256.toHexString(SHA256.getSHA(pass)))){
                    return true;
                }else{
                    return false;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return false; //By Default
    }
}
