package com.search;

import com.design.Design;
import com.storeItem.StoreItem;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String keyword = request.getParameter("keyword");
        SearchDao dao = new SearchDao();
        List<StoreItem> results = dao.searchKeyword(keyword);
        request.setAttribute("designsList",results);
        RequestDispatcher dispatcher = request.getRequestDispatcher("store-search-results.jsp");
        dispatcher.forward(request,response);
    }
}
