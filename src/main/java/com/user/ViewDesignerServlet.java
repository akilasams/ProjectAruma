package com.user;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ViewDesignerServlet")
public class ViewDesignerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        User user=(User) session.getAttribute("user");
        int userId=user.getId();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId= Integer.parseInt(request.getParameter("userId"));
        UserDao dao=new UserDao();
        User user=dao.selectDesigner(userId);
        request.setAttribute("designer",user);
        RequestDispatcher dispatcher=request.getRequestDispatcher("view-designer.jsp");
        dispatcher.forward(request,response);
    }
}
