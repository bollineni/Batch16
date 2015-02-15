package collection;

import java.util.ArrayList;

import tutorial.io.Person;

public class InstanceofExample {

	public static void main(String[] args) {
		int ages[] = {12,6,34,5,6,76};
		
		int a = 10;
		Integer aa = new Integer(a);
		int b  = aa;
		
		ArrayList ageList = new ArrayList();
		ageList.add(3);
		ageList.add(new Integer(12));
		ageList.add(20);
		ageList.add(30);
		ageList.add(89);
		ageList.add("Hundred");
		for(int i =0 ; i < ageList.size(); i++) {
//			Integer intValue = (Integer)ageList.get(i);
//			System.out.println(intValue);
			Object obj = ageList.get(i);
			if(obj instanceof Integer){
				Integer intValue = (Integer)obj;
				System.out.println(intValue);
			}else if(obj instanceof String) {
				String intValueStr = (String)obj;
				System.out.println(intValueStr.toUpperCase());
			}
		}
	}
	
	
	
	
	
	
	
	
	
	public static void getAllNamesFromDB(ArrayList ageList){
		ageList.add(10);
		ageList.add(20);
		ageList.add(30);
		ageList.add("Fourty");
	}
}