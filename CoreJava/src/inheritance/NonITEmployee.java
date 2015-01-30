package inheritance;

public class NonITEmployee extends Employee implements Singable {
	
	private boolean comeEarly;
	
	public boolean isComeEarly() {
		return comeEarly;
	}

	/*public void setComeEarly(boolean comeEarly) {
		this.comeEarly = comeEarly;
	}*/

	public NonITEmployee(String name , int id) {
		super(name, id);
	}
	
	public void efficientNonItEmp() {
		System.out.println("Non IT Employees Is pretty efficent " + getName());
	}
	
	@Override
	public void wearTie(){
		System.out.println("Wear White Color Tie...");
	}
	
	@Override
	public void totalTime() {
		System.out.println("Mininum 9 Hours");
	}

	@Override
	public void singingSkills() {
		System.out.println("Non IT Emp : I sing during my leasure time....");
		
	}
}