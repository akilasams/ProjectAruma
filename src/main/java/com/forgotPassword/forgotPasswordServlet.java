package com.forgotPassword;


import com.login.SHA256;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

@WebServlet("/ForgotPasswordServlet")
public class forgotPasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
//        String newpass = request.getParameter("NewPassword");
//        String retypePass = request.getParameter("ReTypePassword");

        String newpass= null;
        String retypePass = null;
        try {
            newpass = SHA256.toHexString(SHA256.getSHA(request.getParameter("NewPassword")));
            retypePass = SHA256.toHexString(SHA256.getSHA(request.getParameter("ReTypePassword")));

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


        forgotPasswordMem member = new forgotPasswordMem(email,newpass,retypePass);
        forgotPasswordDao rDao = new forgotPasswordDao();
        String result = rDao.update(member,email);
        response.getWriter().print(result);
        response.sendRedirect(request.getContextPath() + "/login.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
