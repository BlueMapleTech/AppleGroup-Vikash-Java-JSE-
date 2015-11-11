package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Userservice.Userservice;
import com.modelpack.Usermodel;

/**
 * Servlet implementation class Adduser
 */
public class Adduser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adduser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
			Usermodel user=new Usermodel();
			
			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			user.setEmailaddress(request.getParameter("emailaddress"));
			user.setContact(request.getParameter("contact"));
			user.setFirstname(request.getParameter("firstname"));
			user.setLastname(request.getParameter("lastname"));
			user.setAddress(request.getParameter("address"));
			user.setCreatedby(request.getParameter("createdby"));
			user.setUpdatedby(request.getParameter("updatedby"));
			Date d=new Date();
			user.setCreateddate(d.toString());
			user.setUpdateddate(d.toString());
			String role=request.getParameter("role");
           // user.setRole_roleid(request.getParameter("role"));
             int r=0;
            
            	 if(role.equals("admin"))
            	 {
            		 r=1;
            	 }else if(role.equals("user"))
            	 {
            		 r=2;
            	 }
            	try{
            		Userservice service=new Userservice();
		  service.add(user);
			
			out.println("insert success");
			
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);

							}
				 catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}
				


		}
		
	}


