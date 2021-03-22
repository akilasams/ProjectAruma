package com.editDesigns;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EditDesignsServlet")
public class EditDesignsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String design_id = request.getParameter("design_id");
        String design_name = request.getParameter("design_name");
        String design_type = request.getParameter("design_type");
        String design_description = request.getParameter("design_description");

        EditDesignsMem member = new EditDesignsMem(design_id,design_name, design_type, design_description);
        EditDesignsDao rDao = new EditDesignsDao();
        String result = rDao.update(member);
        response.getWriter().print(result);
        response.sendRedirect(request.getContextPath() + "/my-designs.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
