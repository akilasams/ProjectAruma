package com.storeOrder;

import com.cart.CartDao;
import com.jobOrder.JobOrderDao;
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
import java.util.ArrayList;
import java.util.List;

@WebServlet("/BuyNowServlet")
public class BuyNowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession(false);
//        int userId = (Integer) session.getAttribute("userId");
//        CartDao cartDao = new CartDao();
//        int cartId = cartDao.getCartId(userId);
//        int itemId = Integer.parseInt(request.getParameter("designId"));
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//        double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
//
//        StoreOrderItem storeOrderItem = new StoreOrderItem(itemId,quantity,unitPrice);
//        List<StoreOrderItem> itemList = new ArrayList<>();
//        itemList.add(storeOrderItem);
//
//        StoreOrder storeOrder = new StoreOrder(cartId,itemList);
//        StoreOrderDao dao = new StoreOrderDao();
//        if(dao.insertOrder(storeOrder)){
//            int lastOrderId = StoreOrderDao.getLastOrderId();
//            StoreOrder thisOrder = dao.getOrderDetails(lastOrderId);
//            request.setAttribute("order",thisOrder);
//            //request.setAttribute("currentUser",currentUser);
//            RequestDispatcher dispatcher = request.getRequestDispatcher("payment.jsp");
//            dispatcher.forward(request,response);
//        }else{
//            RequestDispatcher dispatcher = request.getRequestDispatcher("order-failed.jsp");
//            dispatcher.forward(request,response);
//        }
        int itemId = Integer.parseInt(request.getParameter("designId"));
        double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int userId = (int) request.getSession(false).getAttribute("userId");

        InstantPurchase instantPurchase = new InstantPurchase(userId, itemId, unitPrice, quantity);
        StoreOrderDao dao = new StoreOrderDao();
        if (dao.buyNow(instantPurchase)) {
            int orderId = StoreOrderDao.getLastOrderId();
            StoreOrder newOrder = dao.getOrderDetails(orderId);
            request.setAttribute("order", newOrder);
            RequestDispatcher dispatcher = request.getRequestDispatcher("payment.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("order-failed.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
