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

@WebServlet("/GoToProfileSettingsUserServlet")
public class GoToProfileSettingsUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = (int) request.getSession(false).getAttribute("userId");

        UserDao dao = new UserDao();
        User currentUser = dao.selectUserByUserId(userId);
        request.setAttribute("currentUser",currentUser);

        RequestDispatcher toProfileSettings = request.getRequestDispatcher("profile-settings.jsp");
        toProfileSettings.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
