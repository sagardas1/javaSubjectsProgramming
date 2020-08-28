package dummypackage;

import java.util.*;

import com.google.gson.Gson;

public class DummyHashMapSorting {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.setKm(12);
		car1.setName("honda");
		Car car2 = new Car();
		car2.setKm(15);
		car2.setName("yamaha");
		Car car3 = new Car();
		car3.setKm(16);
		car3.setName("suzuki");
		Car car4 = new Car();
		car4.setKm(17);
		car4.setName("sumba");
		Car car5 = new Car();
		car5.setKm(18);
		car5.setName("sim");

		HashMap<String, Car> map1 = new HashMap<>();

		map1.put("onr", car1);
		map1.put("two", car2);
		map1.put("three", car3);
		map1.put("four", car4);
		map1.put("five", car5);
		System.out.println(map1.size());

		Set<Map.Entry<String, Car>> set = map1.entrySet();

		for (Map.Entry<String, Car> en : set) {
			System.out.println(new Gson().toJson(en.getValue()));
		}

		ArrayList<Map.Entry<String, Car>> list = new ArrayList<Map.Entry<String, Car>>(map1.entrySet());

		Collections.sort(list, new ComapatorByKm());

		HashMap<String, Car> temp = new LinkedHashMap<String, Car>();
		for (Map.Entry<String, Car> m : list) {

			System.out.println(new Gson().toJson(m.getValue()));
			temp.put(m.getKey(), m.getValue());
		}

	}

}
