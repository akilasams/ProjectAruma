package com.userFltering;

import com.user.User;
import com.user.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginUserFilterServlet")
public class LoginUserFilterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = (int) request.getSession(false).getAttribute("userId");

        UserDao dao = new UserDao();
        User currentUser = dao.selectUserByUserId(userId);
        request.setAttribute("currentUser",currentUser);

        if(currentUser.getUser_role_id() == 1){
            RequestDispatcher toAdminProfile = request.getRequestDispatcher("admin-profile.jsp");
            toAdminProfile.forward(request,response);
        }else{
            RequestDispatcher toHome = request.getRequestDispatcher("home-main.jsp");
            toHome.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
