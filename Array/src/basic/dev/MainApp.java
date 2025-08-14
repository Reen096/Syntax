package basic.dev;

import java.util.Random;

public class MainApp {

	public static void main(String[] args) {

		int a[] = new int[10];
		Random rand = new Random();
		int tong = 0;
		int soChan = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100) + 1;
			tong += a[1];
			if (a[i] % 2 == 0) {
				soChan++;

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.format("%d ", a[i]).print("");

		}
		System.out.println();
		System.out.format("Tong:%d", tong).println();

		if (tong % 2 == 0) {
			System.out.println("Tong chan");

		} else {
			System.out.println("Tong le");
		}
		System.out.format("Co %d so chan trong mang", soChan).println();
		System.out.format("Co %d so le trong mang", a.length - soChan).println();

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}
		System.out.println("Mang sau khi sap xep");
		for (int i = 0; i < a.length; i++) {
			System.out.format("%d ", a[i]).print("");
		}

	}

}
