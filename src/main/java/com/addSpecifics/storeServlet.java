package com.addSpecifics;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/storeServlet")
public class storeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String design_id = request.getParameter("design_id");
        String stock = request.getParameter("stock");
        String unit_price = request.getParameter("unit_price");
        String additional_details = request.getParameter("additional_details");
        String published_date = request.getParameter("published_date");

        storeMem member = new storeMem( design_id, stock, unit_price, additional_details, published_date);
        storeDao rDao = new storeDao();
        String result = rDao.insert(member);
        response.getWriter().print(result);
        response.sendRedirect(request.getContextPath() + "/specifics-added.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
