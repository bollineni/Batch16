<%@page import="com.tutorial.jsp.dataobject.EmployeeDO,java.util.List"
	isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<table>

		<%-- <%
		java.util.List<EmployeeDO> empDOList = (List<EmployeeDO>) request
				.getAttribute("empdetail");
	callMe();
		for (EmployeeDO empdo : empDOList) {
	%>
			<tr style="border: 2px; color: black;">
			<td><%=empdo.getEmpid()%></td>
			<td><%=empdo.getFname()%></td>
			<td><%=empdo.getLname()%></td>
			<td><%=empdo.getEmail()%></td>
			</tr>
	<%		
		}
	%>
	
	<%!
	public void callMe(){
		System.out.println("Hello Guys");
	}
	%> --%>
		<%--JSP Comment --%>
	</table>
	<%-- <% 
	java.util.List<EmployeeDO> empDOList = (List<EmployeeDO>)request.getAttribute("empdetail");
	
	for(EmployeeDO empdo : empDOList){
%>
	<%=empdo.getEmpid()%>
	<%=empdo.getFname()%>
	<%=empdo.getLname()%>
	<%=empdo.getEmail()%>
<%		
	}
%> --%>

	<c:forEach var="emp" items="${empdetail}">
   EMPID <c:out value="${emp.empid}" />
   Fname <c:out value="${emp.fname}" />
   Lname <c:out value="${emp.lname}" />
   Email <c:out value="${emp.email}" />
		<br>
	</c:forEach>

</body>
</html>