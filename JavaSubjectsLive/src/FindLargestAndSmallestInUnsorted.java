
public class FindLargestAndSmallestInUnsorted {
	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 2, 5, 6, 4, 2, 1 };

		int smallest = 0;
		int largest = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			System.out.println(smallest);
			if (a[i] < smallest) {
				smallest = a[i];
			}

			if (largest < a[i]) {

				
				largest = a[i];
			}

		}

		System.out.println("smallest number is - " + smallest);
		System.out.println("largest number is - " + largest);

		String s = "11112gghgsfhshgggbhbbbbbbgggg";
		@SuppressWarnings("unused")
		int count = 0;
		int pair = 0;

		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) == 'g' && s.charAt(i + 1) == 'g') {
				pair += 1;
				count = 0;
			} else {
				count += 1;
			}

		}
		System.out.println(pair);
	}
}
