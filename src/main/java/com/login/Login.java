package com.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");

        if(uname.equals("user") && pass.equals("password")){
            HttpSession session=request.getSession();
            session.setAttribute("username",uname);
            response.sendRedirect("home-main-logged.jsp");
        }
        else{
            response.sendRedirect("login.jsp");
        }

    }


    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
