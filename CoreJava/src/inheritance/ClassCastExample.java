package inheritance;

public class ClassCastExample {

	public static void main(String[] args) {
		JavaProgrammer prog = new JavaProgrammer("Krish",4567);
		prog.coreJavaSkills();
		
		ITEmployee itEmp = new JavaProgrammer("Krish",4567);
//		prog2.coreJavaSkills();
		
		/*JavaProgrammer prog3 = (JavaProgrammer)itEmp;
		prog3.coreJavaSkills();*/
		
		/*itEmp = new DesktopAdmin("Desk",345);
		JavaProgrammer prog4 = (JavaProgrammer)itEmp;
		prog4.coreJavaSkills();*/
		getInfo(itEmp);
		
		itEmp = new DesktopAdmin("Desk",345);
		getInfo(itEmp);
		
		getInfo("Hello Folks");
	}
	
	public static void getInfo(Object obj) {
		
		if(obj instanceof JavaProgrammer) {
			JavaProgrammer prog3 = (JavaProgrammer)obj;
			prog3.coreJavaSkills();	
		}else if(obj instanceof DesktopAdmin) {
			DesktopAdmin da = (DesktopAdmin)obj;
			da.desktopSkills();
		}else if(obj instanceof String) {
			String str = (String)obj;
			System.out.println(str.toUpperCase());
		}
	}
}