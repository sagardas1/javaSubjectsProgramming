
public class StringLiterals {
	public static void main(String[] args) {
		String a = "sagar das";
		int size = a.length();
		int b = 0;

		while (size != 0) {
			char c = a.charAt(0);
			a = a.replace(a.charAt(0) + "", "");

			if (size - a.length() == 1) {
				System.out.println(c);
				break;
			}
			size = a.length();

		}
	}
}
