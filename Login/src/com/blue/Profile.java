package com.blue;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Profile
 */
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        RequestDispatcher rd2=request.getRequestDispatcher("move.html");
	        rd2.include(request,response);
	    Cookie c[]=request.getCookies();
	    if(c!=null)
	    {
	    	String name=c[0].getValue();
	    	if(!name.equals("")||name!=null){  
	            out.print("<b>Inside to Profile</b>");  
	            out.print("Welcome"+name);  
	        }  
	        }else{  
	            out.print("login first"); 
	            RequestDispatcher rd3=request.getRequestDispatcher("move.html");
		        rd2.include(request,response);
	          
	    }
	}

}
