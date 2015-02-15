package collection.sorting;

public class Person implements Comparable{
	private String name;
	private String place;
	private String prof;
	
	public Person(String name , String place , String prof) {
		this.name = name;
		this.prof =  prof;
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	
	@Override
	public String toString() {
		return this.name +" " + this.prof +" "+ this.place;
	}
	@Override
	public int compareTo(Object obj) {
		return this.name.compareTo(((Person)obj).getName());
//		return this.place.compareTo(((Person)obj).getPlace());
	}
}
