package advance.dev.model;

import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		Random random = new Random();
		Manager manager = new Manager();

		// Tạo 3 hình tròn
		System.out.println("Tạo 3 hình tròn");
		for (int i = 0; i < 3; i++) {
			double radius = 1 + random.nextDouble() * 9; // Bán kính từ 1-10
			manager.add(new Circle(radius));
			System.out.printf("Hình tròn %d: Bán kính = %.2f\n", i + 1, radius);
		}

		// Tạo 3 hình chữ nhật
		System.out.println("\nTạo 3 hình chữ nhật");
		for (int i = 0; i < 3; i++) {
			double width = 1 + random.nextDouble() * 9; // Rộng từ 1-10
			double height = 1 + random.nextDouble() * 9; // Cao từ 1-10
			manager.add(new Rectangle(width, height));
			System.out.printf("Hình chữ nhật %d: Rộng = %.2f, Cao = %.2f\n", i + 1, width, height);
		}
		// Tạo 4 hình tam giác
		System.out.println("\nTạo 3 hình tam giác");
		for (int i = 0; i < 3; i++) {
			// Tạo cạnh ngẫu nhiên, đảm bảo tam giác hợp lệ
			double a, b, c;
			do {
				a = 1 + random.nextDouble() * 9;
				b = 1 + random.nextDouble() * 9;
				c = 1 + random.nextDouble() * 9;
			} while (a + b <= c || b + c <= a || a + c <= b);
			manager.add(new Triangle(a, b, c));
			System.out.printf("Hình tam giác %d: Cạnh = %.2f, %.2f, %.2f\n", i + 1, a, b, c);
		}

		// In danh sách
		manager.print();

		// Sắp xếp theo diện tích
		System.out.println("\nDanh sách sau khi sắp xếp");
		manager.sort();
		manager.print();

		// Tìm hình có chu vi lớn nhất
		manager.findMaxCV();

		// Tìm hình có diện tích lớn nhất
		manager.MaxDT();
	}
}
