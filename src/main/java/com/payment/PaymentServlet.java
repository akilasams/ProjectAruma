package com.payment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int orderId = Integer.parseInt(request.getParameter("order_id"));
        //int paymentId = Integer.parseInt(request.getParameter("payment_id"));

        PaymentDao dao = new PaymentDao();

        if(dao.insertPayment(orderId)){
            response.sendRedirect("payment-successful.jsp");
        }else{
            response.sendRedirect("payment-failed.jsp");
        }
    }
}
