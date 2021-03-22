package com.editSpecifics;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EditSpecificsServlet")
public class EditSpecificsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String stock = request.getParameter("stock");
        String unit_price = request.getParameter("unit_price");
        String additional_details = request.getParameter("additional_details");
        String published_date = request.getParameter("published_date");
        String design_id = request.getParameter("design_id");

        EditSpecificsMem members = new EditSpecificsMem( stock, unit_price, additional_details, published_date, design_id);
        EditSpecificsDao rDao = new EditSpecificsDao();
        String result = rDao.Update(members);
        response.getWriter().print(result);
        response.sendRedirect(request.getContextPath() + "/specifics-added.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
