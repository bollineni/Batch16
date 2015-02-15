package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class MapTestExample {

	public static void main(String[] args) {
		hashTable();
	}
	public static void hashMapIterator() {
		List<Integer> ageList = new ArrayList<Integer>();
		ageList.add(3);
		ageList.add(new Integer(12));
		ageList.add(20);
		ageList.add(30);
		ageList.add(89);
		
		List<Integer> heightList = new ArrayList<Integer>();
		heightList.add(3);
		heightList.add(new Integer(12));
		heightList.add(20);
		heightList.add(30);
		heightList.add(89);
		
		Map<String , Integer> objMap = new HashMap<String , Integer>();
		objMap.put("key1", new Integer(10));
		objMap.put("key2", new Integer(20));
		objMap.put("key3", new Integer(30));
		objMap.put("key4", new Integer(40));
		
		System.out.println(objMap.get("key4"));
		
//		objMap.put("heigthList", heightList);
//		objMap.put("ageList", ageList);
		
		Iterator iter = objMap.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry mapEntry = (Map.Entry)iter.next();
			System.out.println(mapEntry.getKey() +" : " + mapEntry.getValue());
		}
		
		for(Object entry : objMap.entrySet()) {
			Map.Entry mapEntry = (Map.Entry)entry;
			System.out.println(mapEntry.getKey() +" : " + mapEntry.getValue());
		}
	}
	
	public static void hashCodeExample() {
		Integer one = new Integer(34);
		Integer two = new Integer(34);
		
		System.out.println(one.hashCode() +"  " + two.hashCode());
		
		String strOne = "Hello Guys";
		String strTwo = "Hello Guys";
		
		String strThree = new String("Hello Guys!!!");
		String strThree1 = new String("Hello Guys!!!");
		
		System.out.println(strOne.hashCode() +" " + strTwo.hashCode() + " " + strThree.hashCode());
		System.out.println(strOne.equals(strThree));
	}
	
	public static void hashTable(){
		Map<String , Integer> objMap = new Hashtable<String , Integer>();
		objMap.put("key1", new Integer(10));
		objMap.put("key2", new Integer(20));
		objMap.put("key3", new Integer(30));
		objMap.put("key4", new Integer(40));
//		objMap.put(null, new Integer(40));
		objMap.put(null, null);
		
	}
}