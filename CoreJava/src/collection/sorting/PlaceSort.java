package collection.sorting;

import java.util.Comparator;

public class PlaceSort implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		String placeOne = ((Person)arg0).getPlace();
		String placeTwo = ((Person)arg1).getPlace();
		
		return placeOne.compareTo(placeTwo);
	}

}
