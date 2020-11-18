package com.course;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/InsertCourse")
public class InsertCourseServlet extends HttpServlet {
    private CourseDao dao=new CourseDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*this.doGet(request,response);*/
        HttpSession session=request.getSession();
        int userId= (Integer) session.getAttribute("userId");
        String courseName=request.getParameter("courseName");
        String courseDescription=request.getParameter("courseDesc");
        int isFree;
        String courseFee;
        if(request.getParameter("isFree")!=null){
            isFree=Integer.parseInt(request.getParameter("isFree"));
            courseFee=null;
        }else{
            isFree=0;
            courseFee=request.getParameter("courseFee");
        }

        Course course=new Course(courseName,courseDescription,isFree,courseFee,userId);
        CourseDao dao=new CourseDao();

        if(dao.insertCourse(course)){
            RequestDispatcher rd=request.getRequestDispatcher("/ViewCourses");
            rd.forward(request,response);
        }else{
            response.getWriter().print("Failed");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*String action=request.getServletPath();

        switch (action){
            //Insert New Course
            case "/newCourse":
                insertCourse(request,response);
                break;
            //Edit Course
            case "/edit":
                break;
            case "/delete":
                break;
            case "/update":
                break;
            default:
                break;
        }*/
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
        RequestDispatcher dispatcher=request.getRequestDispatcher("all-courses.jsp");
        dispatcher.forward(request,response);
    }*/
}
