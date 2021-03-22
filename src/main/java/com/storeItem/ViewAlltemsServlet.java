package com.storeItem;

import com.user.User;

import javax.mail.Store;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ViewAllItemsServlet")
public class ViewAlltemsServlet extends HttpServlet {
    private StoreItemDao dao=new StoreItemDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<StoreItem> storeItemList=dao.selectAllItems();
        request.setAttribute("storeItemList",storeItemList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("store-home.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
