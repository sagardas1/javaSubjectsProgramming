package arrayPrograms;

public class ArrayContains {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 2 };

		
		int count = 0;
		int input = 12;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == input) {
				count += 1;
				break;
			}
		}
		if (count == 1) {
			System.out.println("PRESENT");
		} else {
			System.out.println("NOT PRESENT");

		}
	}

}
