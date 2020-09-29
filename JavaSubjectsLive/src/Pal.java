
public class Pal {
	public static void main(String[] args) {

		int arr[] = { 22, 33, 44, 555 };
		int a;
		int count = 0;
		System.out.println(System.currentTimeMillis());
		for (int j = 0; j < arr.length; j++) {
			a = arr[j];
			for (int i = 0; i <= 44; i++) {
				if (i + reverse(i) == a) {
					System.out.println(i);
					System.out.println(reverse(i));

					count += 1;
					break;
				}
				
			}
		}
		System.out.println(count);
		System.out.println(System.currentTimeMillis());
	}

	public static int reverse(int a) {
		int temp = a;

		int sum = 0;
		while (temp != 0) {
			int c = temp % 10;
			sum = (sum * 10) + c;
			temp = temp / 10;
		}
		return sum;
	}
}
