package arrayProgram;

import java.util.ArrayList;

public class UniqueSubString {

	public static void main(String[] args) {
		String a = "abdd";
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < a.length(); i++) {
			if (i != a.length() - 1) {
				list.add(a.charAt(i) + "" + a.charAt(i + 1) + "");

			} else
				list.add(a.charAt(i) + "" + a.charAt(0) + "");
		}

		for (String s : list) {

		}
	}

}
