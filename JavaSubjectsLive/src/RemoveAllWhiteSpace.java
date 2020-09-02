
public class RemoveAllWhiteSpace {
	public static void main(String[] args) {
		String a = "i am a boy";

		a = a.replace(" ", "");
		System.out.println(a);

	
		String newString = "";

		for (char k : a.toCharArray()) {
			if (k != ' ') {
				newString += k + "";
			}
		}

		System.out.println(newString);
	}
}
