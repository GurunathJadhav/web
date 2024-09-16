package web.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import web.entity.Employee;

public class Model {

	static Connection con;
	Statement stm;

	public void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_reg", "root", "guru8296jadhav@");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean addDetails(Employee employee) {
		
		try {
			stm=con.createStatement();
			stm.executeUpdate("INSERT INTO employee (id, first_name, last_name, email, salary) " +
	                  "VALUES ('" + employee.getId() + "', '" + employee.getFirst_name() + "', " +
	                  "'" + employee.getLast_name() + "', '" + employee.getEmail() + "', '" + employee.getSalary() + "')");

			closeCon();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}finally {
			closeCon();
		}
		
		
	}
	
	public static void closeCon() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
