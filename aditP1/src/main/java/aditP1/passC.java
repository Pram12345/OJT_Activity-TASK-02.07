package aditP1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/pass")
public class passC extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		String name = (String) req.getAttribute("name");
//		String course =(String) req.getAttribute("course");
//		int fee = (int) req.getAttribute("fee");
//		
		
		

		HttpSession sess = req.getSession();
		String name = (String) sess.getAttribute("name");
		String course =(String) sess.getAttribute("course");
		int fee = (int) sess.getAttribute("fee");
		
		
		
		PrintWriter pt = res.getWriter();
		pt.println(name+" : "+course+ " : "+ fee);
				
;	}

}
