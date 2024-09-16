package web.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.model.Model;

/**
 * Servlet implementation class details
 */
@WebServlet("/details")
public class details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public details() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Model model=new Model();
		model.connection();
		ResultSet all = model.getAll();
		request.setAttribute("details", all);
		RequestDispatcher rd = request.getRequestDispatcher("viewDetails.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
