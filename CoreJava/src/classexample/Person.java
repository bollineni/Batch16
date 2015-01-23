package classexample;

import pojo.Address;

public class Person {
	String name;
	int ssn;
	int height;
	public static int count;
	
	/*static {
		System.out.println("I am in the static block..."+ count);
	}*/
	
	public Person(String name) {
		this.name = name;
		count++;
//		System.out.println("Person " + name  + " is Created...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	Address addr;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Person " + name + " is been destroyed...");
	}
}