package arrayProgram;

public class SecondLargestElement {
	public static void main(String[] args) {

		int a[] = { 1 };

		int smallest = -1;
		int secondSmallest = -1;

		for (int i = 0; i < a.length; i++) {
			if (smallest == -1) {

				smallest = a[i];
			} else if (smallest >= a[i]) {
				smallest = a[i];

			} else {

				if (secondSmallest == -1) {
					secondSmallest = a[i];
				} else if (secondSmallest >= a[i]) {
					secondSmallest = a[i];
				}

			}

		}

		System.out.println(secondSmallest);

	}
}
