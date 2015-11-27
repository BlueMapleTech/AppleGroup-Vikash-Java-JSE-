package com.blue;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	      
		PrintWriter out=response.getWriter();
	        
			String a=request.getParameter("name");
	        String b=request.getParameter("pass");
	        
	        ServletConfig con=getServletConfig();
	        if(a.equals("vikash")&&b.equals("password"))
	        {
	        	out.println("login sucess");
	        }
	        else
	        {
	        	
	            out.println("welcome"+a);
	            }
	        
	        
	        
	        
	        
	        
	        
	        
		
	}

}
