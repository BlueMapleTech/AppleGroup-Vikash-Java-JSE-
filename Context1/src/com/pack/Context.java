package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Context
 */
public class Context extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Context() {
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
	        
	       
	        ServletContext con=getServletContext();
	        /* Enumeration<String> e=con.getInitParameterNames();  
	        
	        String str="";  
	        while(e.hasMoreElements()){  
	            str=e.nextElement();  
	            out.print("<br> "+con.getInitParameter(str));  
	        } */ 
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
