//package com.user;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.*;
//
//@WebServlet("/UpdateUserServlet")
//public class UpdateUserServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session=request.getSession();
//
//        User currentUser = (User) session.getAttribute("user");
//        String username=currentUser.getUsername();
//        String address=request.getParameter("address");
//        String email=request.getParameter("email");
//        String mobileNo=request.getParameter("mobileNo");
//
//        Part profPic = request.getPart("profPic");
//        String profPicName = profPic.getSubmittedFileName();
//
//        User user = new User(username,address,email,mobileNo,profPicName);
//        UserDao dao=new UserDao();
//
//        if(dao.updateUser(user)){
//            //Upload Path
//            String profPicPath=request.getContextPath()+"\\main\\webapp\\assets\\img\\users\\"+profPicName;
//            System.out.println(profPicName);
//
//            //Upload
//            FileOutputStream fos = new FileOutputStream(profPicPath);
//            InputStream is = profPic.getInputStream();
//
//            //Read Data
//            byte[] data = new byte[is.available()];
//            is.read(data);
//
//            //Writing Data
//            fos.write(data);
//            fos.close();
//
//            response.sendRedirect("designer-profile.jsp");
//        }else{
//            response.sendRedirect("home-main.jsp");
//        }
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//}
