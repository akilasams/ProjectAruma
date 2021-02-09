package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//DAO - Data Access Object
public class LoginDao {
    String url="jdbc:mysql://localhost:3306/aruma_db?serverTimezone=UTC";
    String username="root";
    String password="";
    String sql="select * from aruma_db.user where username=? and password=?";

    public boolean checkCredentials(String uname,String pass) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,uname); //1st ? = uname
            st.setString(2,pass); //2nd ? = pass
            ResultSet rs=st.executeQuery();
            if(rs.next()){ //If theres a record such that uname = DB uname & pass = DB pass (If result set exists)
                return true;
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return false; //By Default
    }
}
