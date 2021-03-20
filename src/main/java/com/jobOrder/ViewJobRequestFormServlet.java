package com.jobOrder;

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
import java.io.PrintWriter;

@WebServlet("/ViewJobRequestFormServlet")
public class ViewJobRequestFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //HttpSession session = request.getSession(false);
        int currentUser = (int) request.getSession(false).getAttribute("userId");
        int toUserId= Integer.parseInt(request.getParameter("userId"));

        UserDao dao = new UserDao();
        String toUserFirstName = dao.getUserFirstNameById(toUserId);
        request.setAttribute("toUserFirstName",toUserFirstName);

        RequestDispatcher dispatcher = request.getRequestDispatcher("send-job-request.jsp");
        dispatcher.forward(request,response);

//        String orderDesc = request.getParameter("orderDesc");
//        String orderDuration = request.getParameter("orderDuration");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        JobOrder jobOrder = new JobOrder(fromUserId,toUserId,orderDesc,orderDuration,quantity);
//        JobOrderDao dao = new JobOrderDao();
//
//        if(dao.insertJobOrder(jobOrder)){
//            PrintWriter out = new PrintWriter(System.out);
//            out.write("Request Sent");
//        }else{
//            PrintWriter out = new PrintWriter(System.out);
//            out.write("Failed to Send Request");
        }
}
