package com.bluemaple.application.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/first")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	      //  PrintWriter out=response.getWriter();
	        
			String a=request.getParameter("name");
	        String b=request.getParameter("pass");
	        if(a.equals("vikash")&&b.equals("pass"))
	        {
	        	RequestDispatcher rs=request.getRequestDispatcher("/first1");
	        	rs.forward(request, response);
	        }
	        else
	        {
	        	//out.println("login failed");
	        	RequestDispatcher rs=request.getRequestDispatcher("/first2");
	        	rs.forward(request, response);	
	        }


	}

}
