package com.user;

import com.course.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao{

    String url="jdbc:mysql://localhost:3306/aruma_db";
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

    /*public List<Course> getCourseList(ResultSet rs){
        List<Course> courseList=new ArrayList<>();
        try {
            if(rs.next()==false){
                return null;
            }else{
                do{
                    int courseId=rs.getInt("course_id");
                    String courseName=rs.getString("course_name");
                    String courseDescription=rs.getString("course_desc");
                    int isFree=rs.getInt("free_or_not");
                    String courseFee=rs.getString("course_fee");
                    int userId=rs.getInt("user_id");
                    courseList.add(new Course(courseId,courseName,courseDescription,isFree,courseFee,userId));
                }while(rs.next());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courseList;
    }
*/
    //Get User's Name
    /*public String getUsersName(String username){
        String firstName="";
        String lastName=""
        Connection connection=getConnection();
        String getName_SQL="SELECT first_name,last_name FROM USER where username=?";

        try {
            PreparedStatement st=connection.prepareStatement(getName_SQL);
            st.setString(1, username);
            ResultSet rs=st.executeQuery();
            if (rs.next()){
                firstName=rs.getString(1);
                lastName=rs.getString(2);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return firstName;
    }*/

    //Select User by Username
    public User selectUser(String username){
        User user=null;
        Connection connection=getConnection();
        String selectByUsername_SQL="SELECT * FROM USER WHERE username=?";
        try {
            PreparedStatement st=connection.prepareStatement(selectByUsername_SQL);
            st.setString(1,username);
            ResultSet rs=st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    int user_id = rs.getInt("user_id");
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    int roleId = rs.getInt("user_role_id");
                    String address = rs.getString("address");
                    String email = rs.getString("email");
                    String mobNo = rs.getString("mobile_no");
                    String password = rs.getString("password");
                    user = new User(user_id, firstName, lastName, roleId, address, email, mobNo, username, password);
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    //Select All Users
    public List<User> selectAllUsers(){
        List<User> users=new ArrayList<>();
        Connection connection=getConnection();
        String selectByUsername_SQL="SELECT * FROM USER";
        try {
            PreparedStatement st=connection.prepareStatement(selectByUsername_SQL);
            ResultSet rs=st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    int user_id = rs.getInt("user_id");
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    int roleId = rs.getInt("user_role_id");
                    String address = rs.getString("address");
                    String email = rs.getString("email");
                    String mobNo = rs.getString("mobile_no");
                    String password = rs.getString("password");
                    users.add(new User(user_id, firstName, lastName, roleId, address, email, mobNo, username, password));
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }

    //Select All Designer
    public List<User> selectAllDesigners(){
        List<User> users=new ArrayList<>();
        Connection connection=getConnection();
        String selectByUsername_SQL="SELECT * FROM USER WHERE user_role_id=2";
        try {
            PreparedStatement st=connection.prepareStatement(selectByUsername_SQL);
            ResultSet rs=st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    int user_id = rs.getInt("user_id");
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    int roleId = rs.getInt("user_role_id");
                    String address = rs.getString("address");
                    String email = rs.getString("email");
                    String mobNo = rs.getString("mobile_no");
                    String password = rs.getString("password");
                    users.add(new User(user_id, firstName, lastName, roleId, address, email, mobNo, username, password));
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }


    //Delete User
    public boolean deleteUser(String username){
        boolean rowDeleted=false;
        Connection connection=getConnection();
        String deleteUser_SQL="DELETE FROM USER WHERE username=?";

        try {
            PreparedStatement st=connection.prepareStatement(deleteUser_SQL);
            st.setString(1,username);
            rowDeleted =st.executeUpdate()>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowDeleted;
    }
}
