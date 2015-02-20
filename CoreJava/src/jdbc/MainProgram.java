package jdbc;

import java.util.ArrayList;
import java.util.List;

class Emp{
	String name;
	String place;
}
public class MainProgram {

	public static void main(String[] args) {
		List<Emp> employees = null; 
		employees = getAllEmployees();
		for(Emp emp : employees){
			
		}
	}
	
	public static List<Emp> getAllEmployees() {
		// List <Emp> emps = new ArrayList<Emp>();
		// select query
		// result set
		// Emp emp = null;
		// while(rs.next){
		//  emp = new Emp();
		// rs.setName(rs.getString("name"));
		// emps.add(emp);
		//}
		// return emps;
		return null;
	}
}