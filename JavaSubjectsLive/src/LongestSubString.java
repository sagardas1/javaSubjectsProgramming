
public class LongestSubString {
	public static void main(String[] args) {
		
		String a = "sagardas";

		String temp = "";
		String longest = "";
		int j = 0;
		for (int i = 0; i < a.length(); i++) {
			j = i;
			temp = "";
			if (!temp.contains(a.charAt(i) + "")) {

				while (!temp.contains(a.charAt(j) + "") && j < a.length() - 1) {

					temp += a.charAt(j) + "";

					j += 1;

				}

				if (temp.length() >= longest.length())
					longest = temp;

			} else {
				j = 0;
				temp = "";

			}
		}
		System.out.println(longest);
	}
}
