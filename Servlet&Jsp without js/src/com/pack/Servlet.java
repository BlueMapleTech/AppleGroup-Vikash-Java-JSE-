package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Userservice.Userservice;
import com.modelpack.Usermodel;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        
	response.setContentType("text/html");
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String name = request.getParameter("username");
	String pass = request.getParameter("password");
	String role = "admin";
	
	
	
	Usermodel um = new Usermodel();
	um.setUsername(name);
	um.setPassword(pass);
	um.setRole_roleid("1");
	//int i[]={1,2};
	//int i;
	//try {
		//Class.forName("com.mysql.jdbc.Driver");

		//java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root","admin");
		//Statement s = (Statement) con.createStatement();
		//ResultSet rs = s.executeQuery("Select Username,Password,role from details");
		
			
				//for(int i=1;i<2;i++)//if(i1==1)
			/*if (user.equals(name) && pass1.equals(pass)&& role1.equals(role)) {
				
				 RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
	             rd.forward(request, response);;
			}
			else 
				//for( i=2;i<=2;i++)
				if(user.equals(name) && pass1.equals(pass)&& role1.equals("user")){
				 RequestDispatcher rd = request.getRequestDispatcher("User.jsp");
	             rd.forward(request, response);;
				
			}*/
			Userservice service = new Userservice();
			ResultSet rs = null;
			try {
				rs = service.checking(um);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				while (rs.next()) {

					String user = rs.getString("Username");
					String pass1 = rs.getString("Password"); 
					String role1 = rs.getString("role_roleid");
					
					if(user.equals(um.getUsername()) && pass1.equals(um.getPassword()) && role1.equals("1")){
						 RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
				         rd.forward(request, response);
				}
					else if(user.equals(um.getUsername()) && pass1.equals(um.getPassword()) && role1.equals("2")){

						RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
				         rd.forward(request, response);
}


}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}

