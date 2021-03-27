package com.user;

import org.apache.commons.io.IOUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/UpdateUserServlet")
@MultipartConfig(maxFileSize=1024*1024*5) //5MB
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();

        int userId = (int) session.getAttribute("userId");

        String address=request.getParameter("address");
        String email=request.getParameter("email");
        String mobileNo=request.getParameter("mobileNo");

        // obtains the upload file part in this multipart request
        Part profPicFilePart = request.getPart("profPic");

        InputStream profPic = profPicFilePart.getInputStream();
        byte[] profPicAsByteArray = IOUtils.toByteArray(profPic);

        User user = new User(userId,address,email,mobileNo, profPicAsByteArray);
        UserDao dao = new UserDao();

        if(dao.updateUser(user)){
            session.setAttribute("profPic",profPic);
            RequestDispatcher dispatcher = request.getRequestDispatcher("home-main.jsp");
            dispatcher.forward(request,response);
        }else{
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
