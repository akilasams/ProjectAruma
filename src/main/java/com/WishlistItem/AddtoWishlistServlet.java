package com.WishlistItem;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class AddtoWishlistServlet
 */
@WebServlet("/AddtoWishlistServlet")
public class AddtoWishlistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddtoWishlistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession Session = request.getSession();
        int user_id = (int) Session.getAttribute("userId");
		

		String design_id=request.getParameter("design_id");
		Wishlist wishlist=new Wishlist(design_id,user_id);
		WishlistDao wDao=new WishlistDao();
		String result=wDao.insert(wishlist);
		
		response.getWriter().print(result);
		
		 response.sendRedirect(request.getContextPath() + "/customer-profile.jsp");
	}

}
