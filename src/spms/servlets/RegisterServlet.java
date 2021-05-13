package spms.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spms.dao.UserDao;
import spms.vo.User;

@SuppressWarnings("serial")
@WebServlet("/auth/register")
public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher
						("/auth/Register.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("접속");
		
		try {
		      ServletContext sc = this.getServletContext();
		      UserDao userDao = (UserDao) sc.getAttribute("userDao");
		      
		      userDao.insert(new User()
		    		  .setId(req.getParameter("id"))
		    		  .setPassword(req.getParameter("password"))
		    		  .setEmail(req.getParameter("email")));
		      
		     System.out.println("성공");
		      // resp.sendRedirect("./Login.jsp");

		}catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("error", e);
			// RequestDispatcher rd = req.getRequestDispatcher("./RegisterFail.jsp");

		     System.out.println("실패");
			//rd.forward(req, resp);
		}
	}
}
















