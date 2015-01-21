package pojo;

public class Student {
	private String name;
	private int rollNo;
	private int height;
	private Address address;
	
	/*
	 * Constructor Default Constructor
	 */
	public Student(String name , int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	/*
	 * Overloaded the constructor
	 */
	public Student(String nameX , int rollNoX, int heightX) {
		this(nameX,rollNoX);
		this.height = heightX;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setRollNo(int rollNoX) {
		rollNo = rollNoX;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int heightX) {
		if(heightX < 0) {
			height = 1;	
		}else {
			height = heightX;	
		}
	}	
	
	protected void finalize() throws Throwable {
		System.out.println("Student.finalize()");
	}
}