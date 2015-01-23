package classexample;

import pojo.Address;

public class ClientProgram {
	String houseAddress =" United States";
	
public static void main(String[] args) {
		Person perOne = new Person("Raj");
		perOne.name = "Raj";
		perOne.ssn = 5678;
		perOne.height = 5;

		
		Address address = new Address();
		address.address2 = "Addr2";
		address.state = "NY";
		address.address1 = "Addr1";
		address.pin = 789;
		address.country = "USA";

		perOne.addr = address;
		
		Person perTwo = new Person("Rahul");
		perTwo.name = "Rahul";
		perTwo.ssn = 5678;
		perTwo.height = 5;
		perTwo.addr = address;
//		perTwo = perOne;
//		Person perThree = new Person();
		
		perTwo.name = "THREE";
		System.out.println("Person One " + perOne.name);
		System.out.println("Person Two " + perTwo.name);
		
		/*ClientProgram cp = new ClientProgram();
		System.out.println(cp.houseAddress);*/
		
		System.out.println("Person One " + perOne.addr.country);
		System.out.println("Person Two " + perTwo.addr.country);
		
		perTwo.addr.country = "India";
		
		System.out.println("At the end Person One " + perOne.addr.country);
		System.out.println("At the end  Person Two " + perTwo.addr.country);
		
	}
}