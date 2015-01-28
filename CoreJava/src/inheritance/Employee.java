package inheritance;

public abstract class Employee {
	private String name;
	private int id;
	private String department;
	
	public Employee(String name , int id) {
		this.name = name;
		this.id = id;
		System.out.println("Employee.Employee()");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}	
	
	public void wearTie() {
		System.out.println("Wear Tie...");
	}
	
	protected void employeeDetails(){
		System.out.println("Employee Details of "+ getName());
	}
	
	public abstract void totalTime();
}
