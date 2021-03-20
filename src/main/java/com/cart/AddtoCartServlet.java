package com.cart;

import com.storeItem.StoreItem;
import com.storeItem.StoreItemDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddtoCartServlet")
public class AddtoCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int itemId=Integer.valueOf(request.getParameter("item.designId"));
        StoreItemDao dao=new StoreItemDao();
        StoreItem storeItem=dao.selectStoreItembyId(itemId);
    }
}
