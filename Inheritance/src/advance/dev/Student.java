package advance.dev;

public class Student extends Person {
	double diemToan;
	double diemLy;
	double diemHoa;
	String maSinhVien;
	String lop;

	public Student(String ten, int tuoi, int soDienThoai, double diemToan, double diemLy, double diemHoa,
			String maSinhVien, String lop) {
		super(ten, tuoi, soDienThoai);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.maSinhVien = maSinhVien;
		this.lop = lop;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

}
