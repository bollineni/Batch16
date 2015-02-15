package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Apple","Goa","Selling Apple"));
		list.add(new Person("Carrot","Mumbai","Software"));
		list.add(new Person("Banana","Rajesthan","Travelling"));
		
		Collections.sort(list, new PlaceSort());

		for(Person per : list) {
			System.out.println(per);
		}
	}

	public static void sortingList() {
		List<String> list = new ArrayList<String>();

		list.add("Apple");
		list.add("Carrot");
		list.add("Banana");

		Collections.sort(list);

		for (String fruits : list) {
			System.out.println(fruits);
		}
	}
}
