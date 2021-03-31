package com.CartItem;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class AddtocartServlet
 */
@WebServlet("/AddtocartServlet")
public class AddtocartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddtocartServlet() {
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
		String quantity=request.getParameter("quantity");
	
		Cart cart=new Cart(design_id,quantity,user_id);
		CartDao cDao=new CartDao();
		String result=cDao.insert(cart);
		
		response.getWriter().print(result);
		
		 response.sendRedirect(request.getContextPath() + "/customer-profile.jsp");
		
	}

}
