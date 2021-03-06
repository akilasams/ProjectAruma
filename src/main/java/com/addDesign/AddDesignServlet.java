package com.addDesign;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/StoreRegServlet")
public class AddDesignServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String design_name = request.getParameter("design_name");
        String design_type = request.getParameter("design_type");
        String in_store = request.getParameter("in_store");
        String design_description = request.getParameter("design_description");

        AddDesignMem member = new AddDesignMem(design_name, design_type, in_store,  design_description);
        AddDesignDao rDao = new AddDesignDao();
        String result = rDao.insert(member);
        response.getWriter().print(result);
        response.sendRedirect(request.getContextPath() + "/my-designs.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
