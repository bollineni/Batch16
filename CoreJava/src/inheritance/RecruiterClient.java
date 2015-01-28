package inheritance;

public class RecruiterClient {

	public static void main(String[] args) {
		/*ITEmployee itEmp = new ITEmployee("Raj", 100);
		itEmp.programmingSkills();
		itEmp.wearTie();
		itEmp.totalTime();
		
		NonITEmployee nonItEmp = new NonITEmployee("Roja", 104);
		nonItEmp.efficientNonItEmp();
		nonItEmp.wearTie();
		nonItEmp.employeeDetails();
		nonItEmp.totalTime();*/
		
		InfrastrcutureProgrammer ip = new InfrastrcutureProgrammer("TestOne",67);
		System.out.println(ip.getOsExpertise());
		
		InfrastrcutureProgrammer windowsIp = new InfrastrcutureProgrammer("TestOne",67, "Windows");
		System.out.println(windowsIp.getOsExpertise());
	}
}