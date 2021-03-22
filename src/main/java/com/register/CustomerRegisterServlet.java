package com.register;

import com.login.SHA256;
import com.user.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

@WebServlet("/CustomerRegisterServlet")
public class CustomerRegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        int user_role_id=3;
        String email=request.getParameter("email");
        String mobileNo=request.getParameter("mobileNo");
        String address=request.getParameter("address");
        String city=request.getParameter("city");
        String username=request.getParameter("username");

        String password= null;
        try {
            password = SHA256.toHexString(SHA256.getSHA(request.getParameter("password")));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        Customer customer=new Customer(firstName,lastName,user_role_id,email,mobileNo,address,city,username,password);
        RegisterDao dao=new RegisterDao();

        if(dao.insertCustomer(customer)){
            response.sendRedirect("registration-successful.jsp");
        }else{
            response.sendRedirect("registration-failed.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
