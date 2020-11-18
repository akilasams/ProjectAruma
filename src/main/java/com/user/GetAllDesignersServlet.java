package com.user;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/GetAllDesignersServlet")
public class GetAllDesignersServlet extends HttpServlet {
    private UserDao dao=new UserDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> designersList=dao.selectAllDesigners();
        request.setAttribute("designersList",designersList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("freelancers.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
