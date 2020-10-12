package arrayProgram;

public class InsertElementInSortedArray17 {
	public static void main(String[] args) {
		int a[] = { 12, 16, 20, 40, 50, 70 };
		int b = 58;
		int finalArray[] = new int[a.length + 1];
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (b < a[i]) {
				finalArray[c] = b;
				c += 1;
				finalArray[c] = a[i];
				c += 1;
			} else {
				finalArray[c] = a[i];
				c += 1;
				
				
			}
		}

		
		for (int i : finalArray) {
			System.out.print(i + "  ");
		}
	}
}
