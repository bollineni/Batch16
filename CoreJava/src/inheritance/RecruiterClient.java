package inheritance;

public class RecruiterClient {

	public static void main(String[] args) {
		/*
		 * Below is commented bcoz ITEmployee is an abstract class now
		 */
		/*ITEmployee itEmp = new ITEmployee("Raj", 100);
		itEmp.programmingSkills();
		itEmp.wearTie();
		itEmp.totalTime();*/
		
		NonITEmployee nonItEmp = new NonITEmployee("Roja", 104);
		nonItEmp.efficientNonItEmp();
		nonItEmp.wearTie();
		nonItEmp.employeeDetails();
		nonItEmp.totalTime();
		
		DesktopAdmin ip = new DesktopAdmin("TestOne",67);
		System.out.println(ip.getOsExpertise());
		
		DesktopAdmin windowsIp = new DesktopAdmin("TestOne",67, "Windows");
		System.out.println(windowsIp.getOsExpertise());
	}
}