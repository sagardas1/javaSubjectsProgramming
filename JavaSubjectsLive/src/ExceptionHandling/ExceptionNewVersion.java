package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptionNewVersion {

	public static void main(String[] args) {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	public void m1() {
		try {

		} catch (Exception e) {
		}
	}
}
