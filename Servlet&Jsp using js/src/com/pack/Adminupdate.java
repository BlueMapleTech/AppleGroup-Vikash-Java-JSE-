package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Userservice.Userservice;
import com.modelpack.Usermodel;

/**
 * Servlet implementation class Adminupdate
 */
public class Adminupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminupdate() {
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
		//Connection con;
		
		try
		{
			Usermodel user=new Usermodel();
			Userservice service=new Userservice();
			service.adminupdate(user);
			out.println("update success");
			
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);

							}
				 catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}
				

		
		
	}

}
