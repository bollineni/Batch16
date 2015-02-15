package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
//		duplicates();
		listToSet();
	}
	public static void duplicates(){
		Set<String> nameList = new HashSet<String>();
		nameList.add("Raj");
		nameList.add("Raj");
		
		System.out.println(nameList.size());
		
		for(String intValue : nameList) {
			System.out.println(intValue);
		}
	}
	
	public static void listToSet(){
		List<String> names = getListOfNames();
		Set<String> nameSet = new TreeSet<String>(names);
		
		for(String intValue : nameSet) {
			System.out.println(intValue);
		}
	}
	public static List getListOfNames(){
		List<String> list = new ArrayList<String>();
		list.add("Banana");
		list.add("Apple");
		list.add("Apple");
		list.add("Carrot");
		return list;
	}
	
}
