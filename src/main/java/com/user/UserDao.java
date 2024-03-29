package com.user;

import com.dbConnection.MyConnection;
import org.apache.commons.io.IOUtils;

import javax.servlet.http.Part;
import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao{
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

    public String getUserFirstNameById(int userId){
        Connection connection = MyConnection.getConnection();
        String getUserByUserId_SQL = "SELECT first_name from aruma_db.user WHERE user_id=?";

        try {
            PreparedStatement st=connection.prepareStatement(getUserByUserId_SQL);
            st.setInt(1,userId);

            ResultSet rs = st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    String firstName = rs.getString("first_name");
                    return firstName;
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    //Get File As a ByteArray
//    public byte[] getFileAsByteA(Part file) {
//        try {
//            return IOUtils.toByteArray(file.getInputStream());
//        } catch (IOException ex) {
//            return null;
//        }
//    }

    //Select User by Username
    public User selectUser(String username){
        User user=null;
        Connection connection = MyConnection.getConnection();
        String selectByUsername_SQL="SELECT * FROM aruma_db.user WHERE username=?";
        try {
            PreparedStatement st=connection.prepareStatement(selectByUsername_SQL);
            st.setString(1,username);
            ResultSet rs=st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    int userId = rs.getInt("user_id");
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    int roleId = rs.getInt("user_role_id");
                    String email = rs.getString("email");
                    String mobNo = rs.getString("mobile_no");
                    String address = rs.getString("address");
                    String city = rs.getString("city");
                    String password = rs.getString("password");

                    if(rs.getBlob("prof_pic") == null){
                        user = new User(userId, firstName, lastName, roleId,email, mobNo,address, city, username, password);
                    }else{
                        Blob profPicBlob = rs.getBlob("prof_pic");
                        int blobLength = (int) profPicBlob.length();
                        byte[] profPicBlobByteArray = profPicBlob.getBytes(1,blobLength);
                        user = new User(userId, firstName, lastName, roleId,email, mobNo,address, city, username, password,  profPicBlobByteArray);
                    }
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    //Update User
    public boolean updateUser(User user){
        boolean rowUpdated = false;
        Connection connection = MyConnection.getConnection();
        String updateUser_SQL="UPDATE aruma_db.user SET address=?,email=?,mobile_no=?,prof_pic=? WHERE user_id=?";

        try {
            PreparedStatement st=connection.prepareStatement(updateUser_SQL);
            st.setString(1,user.getAddress());
            st.setString(2,user.getEmail());
            st.setString(3,user.getMobileNo());

            Blob profPicBlob = new SerialBlob(user.getProfPic());
            st.setBlob(4, profPicBlob);

            st.setInt(5,user.getId());
            rowUpdated = st.executeUpdate()>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdated;
    }

    //Select User by UserId
    public User selectUserByUserId(int userId){
        User user=null;
        Connection connection = MyConnection.getConnection();
        String selectByUserId_SQL="SELECT * FROM aruma_db.user WHERE user_id=?";
        try {
            PreparedStatement st=connection.prepareStatement(selectByUserId_SQL);
            st.setInt(1, userId);
            ResultSet rs=st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    int roleId = rs.getInt("user_role_id");
                    String email = rs.getString("email");
                    String mobNo = rs.getString("mobile_no");
                    String address = rs.getString("address");
                    String city = rs.getString("city");
                    String username = rs.getString("username");
                    String password = rs.getString("password");

                    if(rs.getBlob("prof_pic") == null){
                        user = new User(userId, firstName, lastName, roleId,email, mobNo,address, city, username, password);
                    }else{
                        Blob profPicBlob = rs.getBlob("prof_pic");
                        int blobLength = (int) profPicBlob.length();
                        byte[] profPicBlobByteArray = profPicBlob.getBytes(1,blobLength);
                        user = new User(userId, firstName, lastName, roleId,email, mobNo,address, city, username, password,  profPicBlobByteArray);
                    }
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
        Connection connection = MyConnection.getConnection();
        String selectByUsername_SQL="SELECT * FROM aruma_db.user";
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
                    String email = rs.getString("email");
                    String mobNo = rs.getString("mobile_no");
                    String address = rs.getString("address");
                    String city = rs.getString("city");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    users.add(new User(user_id, firstName, lastName, roleId,email, mobNo,address, city, username, password));
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }

    //Select All Designer
    public List<Designer> selectAllDesigners(){
        List<Designer> designers=new ArrayList<>();
        Connection connection = MyConnection.getConnection();
        String selectByUsername_SQL="SELECT * FROM aruma_db.user WHERE user_role_id=2";
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
                    String email = rs.getString("email");
                    String mobNo = rs.getString("mobile_no");
                    String address = rs.getString("address");
                    String city = rs.getString("city");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    int servicetype_id = rs.getInt("category_id");
                    String bio = rs.getString("bio");
                    designers.add(new Designer(user_id, firstName, lastName, roleId,email, mobNo,address, city, username, password,servicetype_id,bio));
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return designers;
    }

    //Select Designer
    public User selectDesigner(int userId){
        Designer designer=null;
        Connection connection = MyConnection.getConnection();
        String selectByUsername_SQL="SELECT * FROM aruma_db.user WHERE user_id=?";
        try {
            PreparedStatement st=connection.prepareStatement(selectByUsername_SQL);
            st.setInt(1, userId);
            ResultSet rs=st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    int user_id = rs.getInt("user_id");
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    int roleId = rs.getInt("user_role_id");
                    String email = rs.getString("email");
                    String mobNo = rs.getString("mobile_no");
                    String address = rs.getString("address");
                    String city = rs.getString("city");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    designer = new Designer(user_id, firstName, lastName, roleId,email, mobNo,address, city, username, password);
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return designer;
    }


    //Delete User
    public boolean deleteUser(String username){
        boolean rowDeleted=false;
        Connection connection = MyConnection.getConnection();
        String deleteUser_SQL="DELETE FROM aruma_db.user WHERE username=?";

        try {
            PreparedStatement st=connection.prepareStatement(deleteUser_SQL);
            st.setString(1,username);
            rowDeleted = st.executeUpdate()>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowDeleted;
    }
}
