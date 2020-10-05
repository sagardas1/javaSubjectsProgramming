package dummypackage;

import java.util.*;
import java.util.Map.Entry;

public class ComapatorByKm implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		@SuppressWarnings("unchecked")
		Map.Entry<String, Car> map1 = (Entry<String, Car>) o1;
		Car car = map1.getValue();
		@SuppressWarnings("unchecked")
		Map.Entry<String, Car> map2 = (Entry<String, Car>) o2;
		Car car1 = map2.getValue();
		

		if (car.getKm() > car1.getKm()) {
			return 1;
		} else if (car.getKm() < car1.getKm()) {
			return -1;
		} else
			return 0;

	}

}
