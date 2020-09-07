package arrayPrograms;

import java.util.*;

import com.google.gson.Gson;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 2 };

		Set se = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			se.add(a[i]);
		}

		System.out.println(new Gson().toJson(se));
	}
}
