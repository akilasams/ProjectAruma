package com.course;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ViewCoursesServlet")
public class ViewAllCoursesServlet extends HttpServlet {
    private CourseDao dao=new CourseDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //listAllCourses(request,response);
        List<Course> courseList=dao.selectAllCourses();
        request.setAttribute("courseList",courseList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("dschool-home.jsp");
        dispatcher.forward(request,response);
        /*response.sendRedirect("store-home.jsp"); //Doesnt Pass Data with sendRidirect()*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    /*private void listAllCourses(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        List<Course> courseList=dao.selectAllCourses();
        request.setAttribute("courseList",courseList);
        response.sendRedirect("store-home.jsp");
    }*/
}
