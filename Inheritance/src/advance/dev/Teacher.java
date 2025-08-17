package advance.dev;

public class Teacher extends Person {
	String maGiaoVien;
	double heSoLuong;

	public Teacher(String ten, int tuoi, int soDienThoai, String maGiaoVien, double heSoLuong) {
		super(ten, tuoi, soDienThoai);
		this.maGiaoVien = maGiaoVien;
		this.heSoLuong = heSoLuong;
	}

	public String getMaGiaoVien() {
		return maGiaoVien;
	}

	public void setMaGiaoVien(String maGiaoVien) {
		this.maGiaoVien = maGiaoVien;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

}
