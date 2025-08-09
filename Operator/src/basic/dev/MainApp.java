package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Nhập 2 số nguyên a và b
		System.out.print("Nhập số nguyên a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập số nguyên b: ");
		int b = scanner.nextInt();

		// Tính tổng, hiệu, tích, thương và in kết quả với định dạng 2 chữ số thập phân
		double tong = a + b;
		double hieu = a - b;
		double tich = a * b;
		double thuong = (b != 0) ? (double) a / b : Double.NaN; // Kiểm tra b != 0 để tránh chia cho 0

		System.out.println("\n=== KẾT QUẢ PHÉP TÍNH ===");
		System.out.printf("Tổng (a + b): %.2f%n", tong);
		System.out.printf("Hiệu (a - b): %.2f%n", hieu);
		System.out.printf("Tích (a * b): %.2f%n", tich);

		// Khai báo biến c và thực hiện các phép so sánh
		boolean c;

		System.out.println("\n=== KẾT QUẢ SO SÁNH ===");
		c = a > b;
		System.out.printf("a > b: %b%n", c);

		c = a < b;
		System.out.printf("a < b: %b%n", c);

		c = a == b;
		System.out.printf("a == b: %b%n", c);

		c = a >= b;
		System.out.printf("a >= b: %b%n", c);

		c = a <= b;
		System.out.printf("a <= b: %b%n", c);

		scanner.close();

	}

}
