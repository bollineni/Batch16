package com.tutorial.jsp.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tutorial.jsp.dao.EmployeeDetailDAO;
import com.tutorial.jsp.dao.EmployeeDetailDAOImpl;
import com.tutorial.jsp.dataobject.EmployeeDO;

/**
 * Servlet implementation class GetEmployeeDetail
 */
@WebServlet( displayName="GetEmployeeDetail" ,name="GetEmployeeDetail" , urlPatterns={"/GetEmployeeDetail"})
public class GetEmployeeDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmployeeDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(name);
		callMe();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = (String)request.getParameter("empid");
		String type = (String) request.getParameter("type");
		List<EmployeeDO> employeeList = new ArrayList<EmployeeDO>();
		List<EmployeeDO> employeeList2 = new ArrayList<EmployeeDO>();
		HttpSession session = request.getSession();
		
		/*EmployeeDetailDAO dao = new EmployeeDetailDAOImpl();
		if(empid != null && !"".equals(empid)){
			EmployeeDO empObj = dao.getEmpDetail(empid);
			employeeList.add(empObj);
		}else{
			employeeList = dao.getEmployees();
		}*/
		
		EmployeeDO empdo1 = new EmployeeDO();
		empdo1.setEmail("one");
		empdo1.setEmpid(100+"");
		empdo1.setFname("OneFN");
		empdo1.setLname("OneFN");
		employeeList.add(empdo1);

		EmployeeDO empdo2 = new EmployeeDO();
		empdo2.setEmail("TWO");
		empdo2.setEmpid(200+"");
		empdo2.setFname("TwoFN");
		empdo2.setLname("TwoFN");
		employeeList2.add(empdo2);
		
		request.setAttribute("empdetail", employeeList);
		session.setAttribute("empdetail", employeeList2);
		
		RequestDispatcher rd = request.getRequestDispatcher("/empdetail.jsp");
		rd.forward(request,response);
	}
	
	public void callMe(){
		System.out.println("");
	}
}