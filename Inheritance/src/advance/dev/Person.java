package advance.dev;

public class Person {
	String ten;
	int tuoi;
	int soDienThoai;

	public Person(String ten, int tuoi, int soDienThoai) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.soDienThoai = soDienThoai;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

}
