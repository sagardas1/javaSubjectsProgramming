import java.util.HashSet;

import com.google.gson.Gson;

public class MainMethod {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		HashSet<Codinates> set = new HashSet<Codinates>();
		HashSet<Codinates> a = getNeighbours(2, 1);

		System.out.println(new Gson().toJson(a));
	}

	public static HashSet<Codinates> getNeighbours(int x, int y) {
		Codinates codinates = null;
		@SuppressWarnings("unused")
		int[][] ret = new int[8][2];
		HashSet<Codinates> set = new HashSet<Codinates>();
		@SuppressWarnings("unused")
		int count = 0;
		for (int i = -1; i <= 1; i++)
			for (int j = -1; j <= 1; j++) {
				if (i == 0 && j == 0)
					continue;
				codinates = new Codinates();
				codinates.setX(x + i);
				codinates.setY(y + j);
				set.add(codinates);

			}
		return set;
	}
}

class Codinates {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}