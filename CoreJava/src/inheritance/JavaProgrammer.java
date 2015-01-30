package inheritance;

public class JavaProgrammer extends ITEmployee implements Singable , Swimmable {

	public JavaProgrammer(String name, int id) {
		super(name, id);
	}

	@Override
	public void evaluation() {
		System.out.println("My evalulation is way beyond...");
	}

	@Override
	public void singingSkills() {
		System.out.println("I can sing anything...");
	}

	@Override
	public void swim() {
		System.out.println("I can swim atleast 100 feet");
	}
	
	public void coreJavaSkills(){
		System.out.println("At least 7 out of 10...");
	}
}