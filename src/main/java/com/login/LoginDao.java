package com.login;

import com.dbConnection.MyConnection;

import java.sql.*;

//DAO - Data Access Object
public class LoginDao {
    public boolean checkCredentials(String uname,String pass) {
        Connection connection = MyConnection.getConnection();
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
