package com.addUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addUserServlet")
public class AddUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String first_name=request.getParameter("first_name");
        String last_name=request.getParameter("last_name");
        String user_role_id=request.getParameter("user_role_id");
        String email=request.getParameter("email");
        String mobile_no=request.getParameter("mobile_no");
        String address=request.getParameter("address");
        String city=request.getParameter("city");
        String username=request.getParameter("username");
        String password=request.getParameter("password");


        AddUser adduser=new AddUser(first_name,last_name,user_role_id,email,mobile_no,address,city,username,password);
        AddUserDao addUserDao=new AddUserDao();
        String result=addUserDao.insert(adduser);
        response.getWriter().print(result);

        response.sendRedirect(request.getContextPath() + "/user-details.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
