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
 * Servlet implementation class Login1
 */
public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login1() {
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
		RequestDispatcher rd=request.getRequestDispatcher("move.html");
		rd.include(request,response);
        String n=request.getParameter("name");  
        String p=request.getParameter("pass");  
          
       out.println("haiiiiii");
        if((n.equals("vikash"))&&(p.equals("12345")))
        {  
            out.print("login sucess<br/>");  
            out.print("Welcome"+n);  
              
            Cookie c=new Cookie("name",n);  
            response.addCookie(c);  
        }else{  
            out.print("login failed");  
            RequestDispatcher rd1=request.getRequestDispatcher("login.html");
            rd1.include(request,response);
        }  
       
	}

}
