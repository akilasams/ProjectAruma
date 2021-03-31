package com.WishlistItem;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CartItem.CartItemDelete;
import com.CartItem.CartItemDeleteDao;

/**
 * Servlet implementation class WishlistItemDeleteServlet
 */
@WebServlet("/WishlistItemDeleteServlet")
public class WishlistItemDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WishlistItemDeleteServlet() {
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
		
		WishlistItemDelete wishlistitemdelete=new WishlistItemDelete(design_id,user_id);
		WishlistItemDeleteDao cDao=new WishlistItemDeleteDao();
		String result=cDao.delete(wishlistitemdelete);
		response.getWriter().print(result);
		
		 response.sendRedirect(request.getContextPath() + "/customer-profile.jsp");
		
	}

}
