package com.course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
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

    //Insert New Course
    public boolean insertCourse(Course course){
        Connection connection=getConnection();
        String insertCourse_SQL="INSERT INTO aruma_db.course VALUES (NULL,?,?,?,?,?)";

        try {
            PreparedStatement st=connection.prepareStatement(insertCourse_SQL);
            st.setString(1,course.getCourseName());
            st.setString(2,course.getCourseDescription());
            st.setInt(3,course.getIsFree());
            st.setString(4,course.getCourseFee());
            st.setInt(5,course.getUserId());
            st.executeUpdate();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }

    }

    //Get Course Array List
    public List<Course> getCourseList(ResultSet rs){
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

    //Select My Courses
    public List<Course> selectMyCourses(int user_id){
        List<Course> myCourses=new ArrayList<>();
        Connection connection=getConnection();
        String selectMyCourses_SQL="SELECT * FROM aruma_db.course WHERE user_id=?";

        try {
            PreparedStatement st=connection.prepareStatement(selectMyCourses_SQL);
            st.setInt(1,user_id);
            ResultSet rs=st.executeQuery();

            myCourses=getCourseList(rs);

            /*if(rs.next()==false){
                return null;
            }else{
                do{
                    int courseId=rs.getInt("course_id");
                    String courseName=rs.getString("course_name");
                    String courseDescription=rs.getString("course_desc");
                    int isFree=rs.getInt("free_or_not");
                    String courseFee=rs.getString("course_fee");
                    int userId=rs.getInt("user_id");
                    myCourses.add(new Course(courseId,courseName,courseDescription,isFree,courseFee,userId));
                }while(rs.next());
            }*/
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return myCourses;
    }

    //Select All Courses
    public List<Course> selectAllCourses(){
        List<Course> courses=new ArrayList<>();
        Connection connection=getConnection();
        String selectAllCourses_SQL="SELECT * FROM aruma_db.course";

        try {
            PreparedStatement st=connection.prepareStatement(selectAllCourses_SQL);
            ResultSet rs=st.executeQuery();

            courses=getCourseList(rs);

            /*if(rs.next()==false){
                return null;
            }else{
                do{
                    int courseId=rs.getInt("course_id");
                    String courseName=rs.getString("course_name");
                    String courseDescription=rs.getString("course_desc");
                    int isFree=rs.getInt("free_or_not");
                    String courseFee=rs.getString("course_fee");
                    int userId=rs.getInt("user_id");
                    courses.add(new Course(courseId,courseName,courseDescription,isFree,courseFee,userId));
                }while(rs.next());
            }*/
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return courses;
    }

    //Select Course by Id
    public Course selectCourse(int courseId){
        Course course=null;
        Connection connection=getConnection();
        String selectBycourseId_SQL="SELECT * FROM aruma_db.course WHERE course_id=?";
        try {
            PreparedStatement st=connection.prepareStatement(selectBycourseId_SQL);
            st.setInt(1,courseId);
            ResultSet rs=st.executeQuery();

            if(rs.next()==false){
                return null;
            }else {
                do {
                    String courseName=rs.getString("course_name");
                    String courseDescription=rs.getString("course_description");
                    int isFree= rs.getInt("free_or_not");
                    String courseFee=rs.getString("course_fee");
                    int userId=rs.getInt("user_id");
                    //String courseContentPath;
                    course=new Course(courseId,courseName,courseDescription,isFree,courseFee,userId);
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return course;
    }
}
