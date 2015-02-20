package jdbc;

import java.sql.*;
public class JDBCODBCBridgeDriver {
	static Connection con = null;
	static Statement stmt;
	static ResultSet rs ;
	static {
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:batch16DS","HR","HR");
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	public static void main(String[] args) {
		selectQuery(100);
	}
	public static void selectQuery(int empid) {
		try{
			stmt = con.createStatement(); // Step 3
			rs = stmt.executeQuery("select * from employees where employee_id < 110"); // Step 4
			while(rs.next()) {
//				System.out.println(rs.getInt(1) +" " + rs.getInt("EMPLOYEE_ID"));
				System.out.println(rs.getString("EMAIL")+" "+rs.getString("EMPLOYEE_ID") +" "+rs.getString("first_name") + " "+ rs.getString("last_name"));
			
			}

		}catch(SQLException exp){
			exp.printStackTrace();
		}finally{
			closeConnections(rs,stmt,con);
		}
	}
	private static void closeConnections(ResultSet rs , Statement stmt , Connection con){
		try{
			if(rs != null){
				rs.close();
			}
			if(stmt != null){
				stmt.close();
			}
			if(con != null){
				con.close();
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
}
