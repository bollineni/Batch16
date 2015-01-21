package constructor;

import pojo.Address;
import pojo.Student;

public class ContructorClient {

	public static void main(String[] args) {
		Calculate calcx = new Calculate();
		Address addr = new Address();
		addr.address1 = "AddressOne";

		Student raj = new Student("Raj", 23);
		raj.setHeight(6);
		raj.setAddress(addr);
		System.out.println(raj.getName() + " " + raj.getRollNo() + " "
				+ raj.getHeight());

		// raj.setName("Raj");
		// raj.setRollNo(23);
		// raj.setHeight(-10);
		// System.out.println(raj.getName() + " " + raj.getRollNo() + " " +
		// raj.getHeight());
		//
		Student shruthi = new Student("Shruthi", 20, 5);
		shruthi.setAddress(addr);

		System.out.println(shruthi.getName() + " " + shruthi.getRollNo() + " "
				+ shruthi.getHeight());

		System.out.println(shruthi.getAddress());

		ContructorClient client = new ContructorClient();
		int sumValue = client.getSumOfAgeAndHeight(shruthi.getRollNo(),
				shruthi.getHeight());
		
		System.out.println(sumValue);
		
		Calculate calc = new Calculate();
		int addValue = calc.add(shruthi.getRollNo(),
				shruthi.getHeight());
		System.out.println(addValue);
		
		addValue = calc.add(shruthi.getRollNo(),
				shruthi.getHeight(), 9);
		
		
	}

	public int getSumOfAgeAndHeight(int rollNo, int height) {
		return rollNo + height;
	}
}