
public class FirstNonRepeted {
	public static void main(String[] args) {

		String s = "saggagggsdfdagkgfgq";

		@SuppressWarnings("unused")
		char[] arr = s.toCharArray();

		@SuppressWarnings("unused")
		int count = 0;
		int size = s.length();
		while (size != 0) {
			char a = s.charAt(0);
			s = s.replace(a + "", "");

			if (size - s.length() == 1) {
				System.out.println(a);
				break;
			} else {
				size = s.length();

			}

		}
	}

}
