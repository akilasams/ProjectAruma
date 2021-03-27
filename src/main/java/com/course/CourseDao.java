package com.course;

import com.dbConnection.MyConnection;
import com.helpers.UploadFileHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    //Insert New Course
    public boolean insertCourse(Course course) {
        Connection connection = MyConnection.getConnection();
        String insertCourse_SQL = "INSERT INTO aruma_db.course VALUES (DEFAULT,?,?,?,?,?)";

        try {
            PreparedStatement st = connection.prepareStatement(insertCourse_SQL);
            st.setString(1, course.getCourseName());
            st.setString(2, course.getCourseDescription());
            st.setString(3, course.getCourseFee());
            st.setInt(4, course.getUserId());

            if (st.executeUpdate() > 0 ? true : false) {
                return true;
            }else {
                return false;
            }

        } catch(SQLException throwables){
            throwables.printStackTrace();
            return false;
        }
    }

    //insertCourseContent
    public boolean insertContent(int courseId,List<String> fileList){
        Connection connection = MyConnection.getConnection();
        String insertContent_SQL = "INSERT INTO aruma_db.course_content VALUES(DEFAULT,?,?)";

        try {
            PreparedStatement st = connection.prepareStatement(insertContent_SQL);
            for(String fileName : fileList){
                st.setInt(1,courseId);
                st.setString(2,fileName);
                st.executeQuery();
            }
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    public int getLastCourseId(){
        Connection connection = MyConnection.getConnection();
        String selectLastCourseId_SQL = "SELECT MAX(course_id) AS last_course_id FROM course";

        try {
            PreparedStatement st = connection.prepareStatement(selectLastCourseId_SQL);
            ResultSet rs = st.executeQuery();

            if(rs.next()==false){
                return 0;
            }else {
                do {
                    int lastCourseId = rs.getInt("last_course_id");
                    return lastCourseId;
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
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
                    String courseFee=rs.getString("course_fee");
                    int userId=rs.getInt("user_id");
                    courseList.add(new Course(courseId,courseName,courseDescription,courseFee,userId));
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
        Connection connection = MyConnection.getConnection();
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
        Connection connection = MyConnection.getConnection();
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
        Connection connection = MyConnection.getConnection();
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
                    String courseFee=rs.getString("course_fee");
                    int userId=rs.getInt("user_id");
                    //String courseContentPath;
                    course=new Course(courseId,courseName,courseDescription,courseFee,userId);
                } while (rs.next());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return course;
    }
}
