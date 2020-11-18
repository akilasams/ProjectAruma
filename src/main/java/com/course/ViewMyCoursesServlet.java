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

@WebServlet("/ViewMyCoursesServlet")
public class ViewMyCoursesServlet extends HttpServlet {
    private CourseDao dao=new CourseDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        int userId= (int) session.getAttribute("userId");
        List<Course> courseList=dao.selectMyCourses(userId);
        request.setAttribute("courseList",courseList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("my-courses.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
