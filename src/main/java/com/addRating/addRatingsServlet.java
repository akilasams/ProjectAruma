package com.addRating;

import com.addDesign.AddDesignDao;
import com.addDesign.AddDesignMem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addRatings")
public class addRatingsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rate = request.getParameter("rate");
        String review = request.getParameter("review");

        addRatingMem member = new addRatingMem(rate,review);
        addRatingsDao rDao = new addRatingsDao();
        String result = rDao.insert(member);
        response.getWriter().print(result);
        response.sendRedirect(request.getContextPath() + "/view-ratings.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
