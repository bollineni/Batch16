package inheritance;

public class ProgrammerClient {

	public static void main(String[] args) {
		JavaProgrammer itProg = new JavaProgrammer("Nikhil",345);
		itProg.totalTime();
		
		DesktopAdmin ifProg = new DesktopAdmin("Siva",678);
		ifProg.totalTime();

	}

}
