package singleTon;

import java.util.ArrayList;

public class Fiveton {
	public static Fiveton fiveton = null;
	static int count = 0;
	static ArrayList<Fiveton> list = new ArrayList<>();

	private Fiveton() {

	}

	public static Fiveton getInstance() {
		if (fiveton == null) {
			fiveton = new Fiveton();
			list.add(fiveton);
			count += 1;
		} else if (count < 5) {

			fiveton = new Fiveton();
			list.add(fiveton);
			count += 1;
		} else {
			fiveton = list.get(count % 5);
			count += 1;
		}
		return fiveton;
	}
}
