package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Nhập và lưu thông tin 2 sinh viên
		System.out.println("Nhập thông tin sinh viên 1:");
		System.out.print("Tên: ");
		String tenSinhVien1 = scanner.nextLine();
		System.out.print("Mã sinh viên: ");
		String maSinhVien1 = scanner.nextLine();
		System.out.print("Chứng minh nhân dân: ");
		String chungMinhNhanDan1 = scanner.nextLine();
		System.out.print("Tên lớp: ");
		String tenLop1 = scanner.nextLine();
		System.out.print("Tên trường: ");
		String tenTruong1 = scanner.nextLine();
		System.out.print("Điểm trung bình: ");
		double diemTrungBinh1 = scanner.nextDouble();

		System.out.println("\nNhập thông tin sinh viên 2:");
		System.out.print("Tên: ");
		String tenSinhVien2 = scanner.nextLine();
		System.out.print("Mã sinh viên: ");
		String maSinhVien2 = scanner.nextLine();
		System.out.print("Chứng minh nhân dân: ");
		String chungMinhNhanDan2 = scanner.nextLine();
		System.out.print("Tên lớp: ");
		String tenLop2 = scanner.nextLine();
		System.out.print("Tên trường: ");
		String tenTruong2 = scanner.nextLine();
		System.out.print("Điểm trung bình: ");
		double diemTrungBinh2 = scanner.nextDouble();

		// Nhập và lưu thông tin 2 công nhân
		System.out.println("\nNhập thông tin công nhân 1:");
		System.out.print("Tên: ");
		String tenCongNhan1 = scanner.nextLine();
		System.out.print("Địa chỉ: ");
		String diaChi1 = scanner.nextLine();
		System.out.print("Số điện thoại: ");
		String soDienThoai1 = scanner.nextLine();
		System.out.print("Hệ số lương: ");
		double heSoLuong1 = scanner.nextDouble();

		System.out.println("\nNhập thông tin công nhân 2:");
		System.out.print("Tên: ");
		String tenCongNhan2 = scanner.nextLine();
		System.out.print("Địa chỉ: ");
		String diaChi2 = scanner.nextLine();
		System.out.print("Số điện thoại: ");
		String soDienThoai2 = scanner.nextLine();
		System.out.print("Hệ số lương: ");
		double heSoLuong2 = scanner.nextDouble();

		// Nhập và lưu thông tin 2 chiếc xe
		System.out.println("\nNhập thông tin chiếc xe 1:");
		System.out.print("Tên xe: ");
		String tenXe1 = scanner.nextLine();
		System.out.print("Hãng: ");
		String hangXe1 = scanner.nextLine();
		System.out.print("Giá (VNĐ): ");
		double giaXe1 = scanner.nextDouble();
		scanner.nextLine(); // Xóa bộ đệm
		System.out.print("Màu sơn: ");
		String mauSon1 = scanner.nextLine();

		System.out.println("\nNhập thông tin chiếc xe 2:");
		System.out.print("Tên xe: ");
		String tenXe2 = scanner.nextLine();
		System.out.print("Hãng: ");
		String hangXe2 = scanner.nextLine();
		System.out.print("Giá (VNĐ): ");
		double giaXe2 = scanner.nextDouble();
		scanner.nextLine(); // Xóa bộ đệm
		System.out.print("Màu sơn: ");
		String mauSon2 = scanner.nextLine();

		// In thông tin 2 sinh viên
		System.out.println("\n=== THÔNG TIN SINH VIÊN ===");
		System.out.println("Sinh viên 1:");
		System.out.printf("Tên: %s%n", tenSinhVien1);
		System.out.printf("Mã sinh viên: %s%n", maSinhVien1);
		System.out.printf("Chứng minh nhân dân: %s%n", chungMinhNhanDan1);
		System.out.printf("Tên lớp: %s%n", tenLop1);
		System.out.printf("Tên trường: %s%n", tenTruong1);
		System.out.printf("Điểm trung bình: %.2f%n", diemTrungBinh1);

		System.out.println("\nSinh viên 2:");
		System.out.printf("Tên: %s%n", tenSinhVien2);
		System.out.printf("Mã sinh viên: %s%n", maSinhVien2);
		System.out.printf("Chứng minh nhân dân: %s%n", chungMinhNhanDan2);
		System.out.printf("Tên lớp: %s%n", tenLop2);
		System.out.printf("Tên trường: %s%n", tenTruong2);
		System.out.printf("Điểm trung bình: %.2f%n", diemTrungBinh2);

		// In thông tin 2 công nhân
		System.out.println("\n=== THÔNG TIN CÔNG NHÂN ===");
		System.out.println("Công nhân 1:");
		System.out.printf("Tên: %s%n", tenCongNhan1);
		System.out.printf("Địa chỉ: %s%n", diaChi1);
		System.out.printf("Số điện thoại: %s%n", soDienThoai1);
		System.out.printf("Hệ số lương: %.2f%n", heSoLuong1);

		System.out.println("\nCông nhân 2:");
		System.out.printf("Tên: %s%n", tenCongNhan2);
		System.out.printf("Địa chỉ: %s%n", diaChi2);
		System.out.printf("Số điện thoại: %s%n", soDienThoai2);
		System.out.printf("Hệ số lương: %.2f%n", heSoLuong2);

		// In thông tin 2 chiếc xe
		System.out.println("\n=== THÔNG TIN CHIẾC XE ===");
		System.out.println("Chiếc xe 1:");
		System.out.printf("Tên xe: %s%n", tenXe1);
		System.out.printf("Hãng: %s%n", hangXe1);
		System.out.printf("Giá: %.0f VNĐ%n", giaXe1);
		System.out.printf("Màu sơn: %s%n", mauSon1);

		System.out.println("\nChiếc xe 2:");
		System.out.printf("Tên xe: %s%n", tenXe2);
		System.out.printf("Hãng: %s%n", hangXe2);
		System.out.printf("Giá: %.0f VNĐ%n", giaXe2);
		System.out.printf("Màu sơn: %s%n", mauSon2);

		scanner.close();

	}

}