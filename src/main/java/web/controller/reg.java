package web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class reg
 */
@WebServlet("/reg")
public class reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public reg() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
//		System.out.println(name);
		
		request.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
		rd.forward(request, response);
	}

}
