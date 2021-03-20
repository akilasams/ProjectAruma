package com.userFltering;

import com.user.User;
import com.user.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GoToProfileUserFilterServlet")
public class GoToProfileUserFilterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = (int) request.getSession(false).getAttribute("userId");

        UserDao dao = new UserDao();
        User currentUser = dao.selectUserByUserId(userId);
        request.setAttribute("currentUser",currentUser);

        RequestDispatcher toAdminProfile = request.getRequestDispatcher("admin-profile.jsp");
        RequestDispatcher toDesignerProfile = request.getRequestDispatcher("designer-profile.jsp");
        RequestDispatcher toCustomerProfile = request.getRequestDispatcher("customer-profile.jsp");

        if(currentUser.getUser_role_id() == 1){
            toAdminProfile.forward(request,response);
        }
        if(currentUser.getUser_role_id() == 2){
            toDesignerProfile.forward(request,response);
        }
        if(currentUser.getUser_role_id() == 3){
            toCustomerProfile.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
