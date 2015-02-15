package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
	public static void main(String[] args) {
//		iteration();
//		addToIndex();
		duplicates();
	}
	public static void iteration() {
		List<Integer> ageList = new ArrayList<Integer>();
		ageList.add(3);
		ageList.add(new Integer(12));
		ageList.add(20);
		ageList.add(30);
		ageList.add(89);
		
		
		System.out.println( " Initial size is "+ageList.size());
		Object[] obj = ageList.toArray();
		printObjects(obj);
		
		/*for(Integer intValue : ageList) {
			System.out.println(intValue);
		}*/
		System.out.println("==============");
		Iterator<Integer> iter = ageList.iterator();
		while(iter.hasNext()) {
			Integer value = iter.next();
			if(value == 20) {
				iter.remove();
			}
//			System.out.println(iter.next());
		}
		
		System.out.println( " Later size is "+ageList.size());
	}
	
	public static void printObjects(Object[] obj) {
		// Some Business Functionality
	}
	
	public static void addToIndex(){
		List<Integer> ageList = new LinkedList<Integer>();
		ageList.add(3);
		ageList.add(new Integer(12));
		ageList.add(20);
		ageList.add(30);
		ageList.add(89);
		
		for(Integer intValue : ageList) {
			System.out.println(intValue);
		}
		ageList.add(2,15);
		System.out.println("================");
		for(Integer intValue : ageList) {
			System.out.println(intValue);
		}
	}
	
	public static void duplicates(){
		ArrayList<String> ageList = new ArrayList<String>();
		ageList.add("Hello");
		ageList.add("Hello");
		
		System.out.println(ageList.size());
	}
	
	public static void vectorExample(){
		Vector vec = new Vector();
		vec.add(new Integer(10));
		vec.add(new Integer(20));
	}
}