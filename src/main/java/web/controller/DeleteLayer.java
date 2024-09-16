package web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.model.Model;

/**
 * Servlet implementation class DeleteLayer
 */
@WebServlet("/delete")
public class DeleteLayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteLayer() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Model model=new Model();
		model.connection();
		boolean status = model.deleteData(Integer.parseInt(id));
		if(status) {
//			request.setAttribute("status", "Details Deleted !!");
			RequestDispatcher rd = request.getRequestDispatcher("details");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
