package advance.dev;

import java.util.Scanner;

// Lớp Student để lưu thông tin sinh viên
class Student {
	// Thuộc tính (fields)
	String name; // Tên sinh viên
	int age; // Tuổi
	String address; // Địa chỉ
	String phoneNumber; // Số điện thoại
	double averageScore; // Điểm trung bình

	// Constructor (hàm khởi tạo) để gán giá trị cho các thuộc tính
	public Student(String name, int age, String address, String phoneNumber, double averageScore) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.averageScore = averageScore;
	}

	// Phương thức để in thông tin của một sinh viên
	public void printInfo() {
		System.out.println("Tên: " + name);
		System.out.println("Tuổi: " + age);
		System.out.println("Địa chỉ: " + address);
		System.out.println("Số điện thoại: " + phoneNumber);
		System.out.printf("Điểm trung bình: %.2f%n", averageScore);
	}
}
