package com.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Input
 */
@WebServlet("/Input")
public class Input extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Input() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
	public void init() throws ServletException {
		System.out.println("Input.init()");
	}
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Input.service()");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<head>");
		out.print("<meta charset=\"ISO-8859-1\">");
		out.print("<title>Insert title here</title>");

		out.print("<title>Input Page</title>");
		
		out.print("</head> <body> <form action=\"HelloWorld\"> <br>First Name : <input type=\"text\" name=\"firstName\"> <br> Last Name : <input type=\"text\" name=\"lastName\"> <br> <input type=\"submit\" value=\"submit\"> <br> </form> </body> </html>");
	}
	
	@Override
	public void destroy() {
		System.out.println("Input.destroy()");
	}
}