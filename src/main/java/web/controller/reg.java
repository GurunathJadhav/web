package web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.entity.Employee;
import web.model.Model;

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
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		String salary = request.getParameter("salary");
		
		Employee employee=new Employee();
		employee.setId(Integer.parseInt(id));
		employee.setSalary(Integer.parseInt(salary));
		employee.setFirst_name(firstName);
		employee.setLast_name(lastName);
		employee.setEmail(email);
		
		Model model=new Model();
		model.connection();
		boolean status = model.addDetails(employee);
		
		if(status) {
			request.setAttribute("status", "Details Added Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			rd.forward(request, response);	
		}else {
			request.setAttribute("status", "Something went wrong");
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			rd.forward(request, response);
		}
//		
		
		
		
	}

}
