package inheritance;

public class InfrastrcutureProgrammer  extends ITEmployee {

	private String osExpertise;
	
	public String getOsExpertise() {
		return osExpertise;
	}

	public void setOsExpertise(String osExpertise) {
		this.osExpertise = osExpertise;
	}
	
	public void programmingSkills() {
		System.out.println("Infra Employees with good Shell Scripting " + getName());
	}
	
	public InfrastrcutureProgrammer(String name, int id) {
		super(name, id);
	}
	
	public InfrastrcutureProgrammer(String name, int id, String osExpertise) {
		super(name, id);
		this.osExpertise = osExpertise;
	}
}