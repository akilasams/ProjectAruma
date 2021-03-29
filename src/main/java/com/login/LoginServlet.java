package com.login;

import com.user.User;
import com.user.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname=request.getParameter("username");
        String pass=request.getParameter("password");

        LoginDao dao=new LoginDao();
        User user=null;
        UserDao userDao=new UserDao();

        /*if(uname.equals("user") && pass.equals("password")){
            HttpSession session=request.getSession();
            session.setAttribute("username",uname);
            response.sendRedirect("home-main-logged.jsp");
        }*/
        HttpSession session = request.getSession();

        if(dao.checkCredentials(uname,pass)){
            /*String firstName=userDao.getUsersName(uname);*/
            user = userDao.selectUser(uname);
            session.setAttribute("userId",user.getId());
            session.setAttribute("firstName",user.getFirstName());
            session.setAttribute("lastName",user.getLastName());
            session.setAttribute("currentUser",user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("LoginUserFilterServlet");
            dispatcher.forward(request,response);

        } else{
            response.sendRedirect("login-failed.jsp");
        }
//        session.setAttribute("user",user);
//        session.setAttribute("email",user.getEmail());
//        session.setAttribute("mobile",user.getMobileNo());
//        session.setAttribute("address",user.getAddress());
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
