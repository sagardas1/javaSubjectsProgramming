package Cutome;

public class Main {

	public static void main(String[] args) {
		try {
			div(6, 0);
		} catch (AlphaException e) {
			System.out.println(e.getErrormsg());
		}

	}

	public static void div(int a, int b) throws AlphaException {

		if (b == 0) {

			throw new AlphaException("B cant be zero");
		}
	}
}
