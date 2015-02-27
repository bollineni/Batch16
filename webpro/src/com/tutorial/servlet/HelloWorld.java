package com.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(urlPatterns={"/HelloWorld"} , loadOnStartup = 1)
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(HelloWorld.class);
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorld() {
		super();
	}
	@Override
	public void init() throws ServletException {
		System.out.println("HelloWorld.init()");
	}
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloWorld.service()");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		// StudentDAO da0 = new StudentDAO();
		// dao.getEmployeeInfo();
		out.print("Hello "+ firstName + " "+ lastName +" Welcome !!!");
		System.out.println("HelloWorld.service()");
	}*/
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.debug("I m in go get method...");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		logger.debug("I m after out method...");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		logger.info("firstName = "+ firstName );
		
		// StudentDAO da0 = new StudentDAO();
		// dao.getEmployeeInfo();
		out.print("Hello "+ firstName + " "+ lastName +" Welcome !!!");
		System.out.println("HelloWorld.service()");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	@Override
	public void destroy() {
		System.out.println("HelloWorld.destroy()");
	}
}