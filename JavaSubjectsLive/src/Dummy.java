import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

public class Dummy {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> finalList = new ArrayList<String>();
		list.add("cat");

		list.add("rat");
		list.add("tac");
		list.add("sum");
		list.add("mus");
		int a = list.size() - 1;
		
		

		@SuppressWarnings("unused")
		int count = 0;
		while (a != 0) {
			String s1 = list.get(0);
			for (int i = 0; i < a; i++) {
				String s2 = list.get(i);
				if (!s1.equals(list.get(i)) && s1.length() == list.get(i).length()) {
					char[] c1 = s1.toCharArray();
					Arrays.sort(c1);
					char[] c2 = list.get(i).toCharArray();
					Arrays.sort(c2);

					String s3 = String.valueOf(c1);
					String s4 = String.valueOf(c2);
					if (s3.equals(s4)) {
						finalList.add(s1);
						finalList.add(s2);
						list.remove(s1);
						list.remove(s2);
						a -= 2;

					} else {
						list.remove(s1);
						a -= 1;
					}

				}
			}

		}

		System.out.println(new Gson().toJson(finalList));
	}
}
