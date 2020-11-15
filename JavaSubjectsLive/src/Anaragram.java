
public class Anaragram {
	public static void main(String[] args) {
		String s1 = "sagar";
		String s2 = "agars";
		int size = s1.length();

		if (s1.length() == s2.length()) {

			while (size != 0) {
				char a = s1.charAt(0);
				

				s1 = s1.replace(a + "", "");

				s2 = s2.replace(a + "", "");
				size = size - (size - s1.length());

			}
			if (s1.length() + s2.length() == 0) {
				System.out.println(true);

			}
			

		} else {
			System.out.println(false);
		}

	}

}
