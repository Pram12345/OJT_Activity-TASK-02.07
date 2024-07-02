package aditP1;



import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/login")
public class loginC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String Name = req.getParameter("sname");
		String Course = req.getParameter("course");
		int fee = Integer.parseInt(req.getParameter("fee"));
		
		
//		req.setAttribute("name", Name);
//		req.setAttribute("course", Course);
//		req.setAttribute("fee", fee);
//		
//		
//		RequestDispatcher rd= req.getRequestDispatcher("pass");
//		rd.forward(req, res);
//		
		
		
		
		
		
		

		HttpSession sess = req.getSession();
		sess.setAttribute("name", Name);
		sess.setAttribute("course", Course);
		sess.setAttribute("fee", fee);
		
		
		res.sendRedirect("pass");
		
		
		
		
	}

}
