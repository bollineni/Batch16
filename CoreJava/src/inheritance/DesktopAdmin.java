package inheritance;

public class DesktopAdmin  extends ITEmployee implements Singable {

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
	
	public DesktopAdmin(String name, int id) {
		super(name, id);
	}
	
	public DesktopAdmin(String name, int id, String osExpertise) {
		super(name, id);
		this.osExpertise = osExpertise;
	}

	@Override
	public void totalTime() {
		System.out.println("Total Time is 11 hrs...");
	}

	@Override
	public void evaluation() {
		System.out.println("My evalulation is up to the mark");
	}

	@Override
	public void singingSkills() {
		System.out.println("I am very bad at singing...");
		
	}
	
	public void desktopSkills() {
		System.out.println("This is desktop admin...");
	}
}