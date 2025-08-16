package advance.dev;

import java.util.Scanner;

public class MainApp {
	// Phương thức để nhập thông tin cho mảng 10 sinh viên
	public static Student[] input() {
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[10]; // Mảng lưu 10 sinh viên

		// Nhập thông tin cho từng sinh viên
		for (int i = 0; i < 10; i++) {
			System.out.println("\nNhập thông tin sinh viên thứ " + (i + 1) + ":");
			System.out.print("Tên: ");
			String name = scanner.nextLine();
			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Địa chỉ: ");
			String address = scanner.nextLine();
			System.out.print("Số điện thoại: ");
			String phoneNumber = scanner.nextLine();
			System.out.print("Điểm trung bình: ");
			double averageScore = scanner.nextDouble();
			scanner.nextLine();

			// Tạo đối tượng Student và lưu vào mảng
			students[i] = new Student(name, age, address, phoneNumber, averageScore);
		}
		return students;
	}

	// Phương thức để in danh sách sinh viên
	public static void print(Student[] students) {
		System.out.println("\nDANH SÁCH SINH VIÊN");
		for (int i = 0; i < students.length; i++) {
			System.out.println("\nSinh viên thứ " + (i + 1) + ":");
			students[i].printInfo();
		}
	}

//Hàm main để chạy chương trình
	public static void main(String[] args) {
		// Gọi phương thức input để nhập danh sách sinh viên
		Student[] students = input();

		// Gọi phương thức print để in danh sách sinh viên
		print(students);
	}
}
