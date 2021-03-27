package com.addDesign;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/StoreRegServlet")
public class AddDesignServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession Session = request.getSession();
        int user_id = (int) Session.getAttribute("userId");
        String design_name = request.getParameter("design_name");
        String designtype_id = request.getParameter("designtype_id");
//        String in_store = request.getParameter("in_store");
        String design_description = request.getParameter("design_description");

        AddDesignMem member = new AddDesignMem(design_name, designtype_id,  design_description, user_id);
        AddDesignDao rDao = new AddDesignDao();
        String result = rDao.insert(member);
        response.getWriter().print(result);
        response.sendRedirect(request.getContextPath() + "/my-designs.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
