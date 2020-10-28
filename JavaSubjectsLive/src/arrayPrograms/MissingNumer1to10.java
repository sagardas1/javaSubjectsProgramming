package arrayPrograms;

public class MissingNumer1to10 {

	public static void main(String[] args) {
		int sum = 0;
		int sumArray = 0;
		int a[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < 11; i++) {
			
			sum += i;
		}
		for (int i = 0; i < a.length; i++) {
			sumArray += a[i];
		}

		System.out.println(sum - sumArray);
	}

}
