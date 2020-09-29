package collection;

import java.util.Arrays;
import java.util.List;

public class TestForFetching {

	public List<Student> fetch() {
		Student std = new Student();
		std.setAddress("xxx");
		std.setName("Sagar");
		std.setRollNo(10);
		return null;
	}

	public static void main(String[] args) {
		

		String textFile = "I am a good boy i am  very  good  at code code";
		String wordList[] = textFile.split(" ");

		List<String> a = Arrays.asList(wordList);
		int size = a.size();
		while (size != 0) {
			String word = a.get(0);
			a.remove(word);
			if (size - a.size() > 1) {
				System.out.println(word);
			}
			size = a.size();

		}

	}
}
