package com.storeItem;

import com.design.Design;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/ViewItemServlet")
public class ViewItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int design_id= Integer.parseInt(request.getParameter("design_id"));
        StoreItemDao dao=new StoreItemDao();
        Design design=dao.selectStoreItembyId(design_id);
        request.setAttribute("designAttributes",design);
        RequestDispatcher dispatcher=request.getRequestDispatcher("view-item.jsp");
        dispatcher.forward(request,response);
    }
}
