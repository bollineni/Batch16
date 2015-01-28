package inheritance;

public class ITEmployee extends Employee {
	
	private String programmingSkills;
	
	public String getProgrammingSkills() {
		return programmingSkills;
	}

	public void setProgrammingSkills(String programmingSkills) {
		this.programmingSkills = programmingSkills;
	}

	public ITEmployee(String name, int id) {
		super(name, id);
		System.out.println("ITEmployee.ITEmployee()");
	}

	public void programmingSkills() {
		System.out.println("IT Employees will have good programming skills " + getName());
	}

	@Override
	public void totalTime() {
		System.out.println("Mininum 10 Hours");
	}
}