package exception;

public class Computer {
	private String name;
	private String model;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void executeMe() throws UserDefinedException {
		
	}
	
	public void executeAgain() throws Exception {
		
	}
	
	@Override
	public String toString() {
		return " Model ="+ model +"\n Name =" + name ;
	}
}
