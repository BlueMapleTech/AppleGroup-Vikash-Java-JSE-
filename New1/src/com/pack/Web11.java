package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Web11
 */
public class Web11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Web11() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	      
		PrintWriter out=response.getWriter();
	        
			String a=request.getParameter("name");
	        String b=request.getParameter("pass");
	        
	       
			ServletConfig con=getServletConfig();
	        String c=con.getInitParameter("name");
	        String d=con.getInitParameter("password");
	        if(a.equals(c)&&b.equals(d))
	        {
	        	out.println("login sucess");
	        	out.println("welcome"+a);
	        }
	        else
	        {
	        	
	            out.println("login failed");
	            }
	    

	}

}
