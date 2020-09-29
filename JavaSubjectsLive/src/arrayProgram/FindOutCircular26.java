package arrayProgram;

public class FindOutCircular26 {
	public static void main(String[] args) {
		int a[] = { 1, 0 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
			} else if (i != a.length - 1) {
				if (i + 1 == a[i]) {
					continue;
				} else {
					count += 1;
					System.out.println("not");
					break;
				}
			} else {
				if (i == a[0])
					continue;

			}
		}

		if (count == 0) {
			System.out.println(a.length);
		} else
			System.out.println("-1");
	}
}
