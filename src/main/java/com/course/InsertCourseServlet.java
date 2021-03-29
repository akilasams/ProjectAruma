package com.course;

import com.helpers.UploadFileHelper;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/InsertCourse")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
        maxFileSize = 1024 * 1024 * 50, // 50 MB
        maxRequestSize = 1024 * 1024 * 100 // 100 MB
)
public class InsertCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();

        int userId= (Integer) session.getAttribute("userId");
        String courseName=request.getParameter("courseName");
        String courseDescription=request.getParameter("courseDesc");
        String courseFee = request.getParameter("courseFee");

        Course course=new Course(courseName,courseDescription,courseFee,userId);
        CourseDao dao=new CourseDao();

        if (dao.insertCourse(course)) {
//            int lastCourseId = dao.getLastCourseId();
//            final String UPLOAD_DIR = "assets/courseContent";
//            List<String> fileList = UploadFileHelper.uploadFile(UPLOAD_DIR,request);
//
//            if(dao.insertContent(lastCourseId,fileList)) {
//                RequestDispatcher dispatcher = request.getRequestDispatcher("ViewMyCoursesServlet");
//                dispatcher.forward(request,response);
                RequestDispatcher dispatcher = request.getRequestDispatcher("ViewMyCoursesServlet");
                dispatcher.forward(request,response);
            }else {
                response.sendRedirect("course-upload-failed.jsp");
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /*private void insertCourse(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        HttpSession session=request.getSession();
        int userId= (int) session.getAttribute("userId");
        String courseName=request.getParameter("courseName");
        String courseDescription=request.getParameter("courseDesc");
        *//*int isFree=Integer.parseInt(request.getParameter("isFree"));*//*
        String courseFee=request.getParameter("courseFee");

        Course course=new Course(courseName,courseDescription,courseFee,userId);
        CourseDao dao=new CourseDao();

        if(dao.insertCourse(course)){
            response.sendRedirect("all-course.jsp");
        }else{
            response.getWriter().print("Failed");
        }
    }*/

    /*private void listAllCourses(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        List<Course> courseList=dao.selectAllCourses();
        request.setAttribute("courseList",courseList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("store-home.jsp");
        dispatcher.forward(request,response);
    }*/
}
