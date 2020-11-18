package com.login;

import com.user.User;
import com.user.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname=request.getParameter("username");
        String pass=request.getParameter("password");

        LoginDao dao=new LoginDao();
        UserDao userDao=new UserDao();

        /*if(uname.equals("user") && pass.equals("password")){
            HttpSession session=request.getSession();
            session.setAttribute("username",uname);
            response.sendRedirect("home-main-logged.jsp");
        }*/

        if(dao.checkCredentials(uname,pass)){
            /*String firstName=userDao.getUsersName(uname);*/
            User user=userDao.selectUser(uname);
            HttpSession session=request.getSession();
            /*session.setAttribute("user",user); // CHECK LATER*/
            session.setAttribute("userId",user.getId());
            session.setAttribute("firstName",user.getFirstName());
            session.setAttribute("lastName",user.getLastName());
            session.setAttribute("username",uname);
            response.sendRedirect("home-main.jsp");
        }
        else{
            response.sendRedirect("login.jsp");
        }

    }


    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
