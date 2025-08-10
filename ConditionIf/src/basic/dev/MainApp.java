package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập một số nguyên: ");

		int so = scanner.nextInt();

		if (so > 0) {
			System.out.println("Số " + so + " là số nguyên dương.");
		} else if (so < 0) {
			System.out.println("Số " + so + " là số nguyên âm.");
		} else {
			System.out.println("Số bạn nhập là 0, không phải số dương cũng không phải số âm.");
		}

		scanner.close();

	}

}