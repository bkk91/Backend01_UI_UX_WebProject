package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ajaxstudy.contact.domain.Result;
import com.ajaxstudy.contact.util.Converter;

import spms.dao.UserDao;
import spms.vo.User;

public class UserListServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext sc = this.getServletContext();
		UserDao userDao = (UserDao)sc.getAttribute("userDao");
		
		try {					
			List<User> users = userDao.selectList();
			
			resp.setContentType("text/html; charset=UTF-8"); // 먼저 호출
	
			req.setAttribute("user", users);
			
			RequestDispatcher rd = 
					req.getRequestDispatcher("/member/MemberList.jsp");
			rd.include(req, resp);
			
		}catch(Exception e) {
			req.setAttribute("error", e);
			RequestDispatcher rd = req.getRequestDispatcher("/Error.jsp");
			rd.forward(req, resp);
		}
	}
}
