package advance.dev.model;

class Triangle extends Shape {
	private double a, b, c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double chuVi() {
		return a + b + c;
	}

	@Override
	public double dienTich() {
		double s = chuVi() / 2; // Nửa chu vi
		// Kiểm tra tam giác hợp lệ
		if (a + b <= c || b + c <= a || a + c <= b) {
			return 0;
		}
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public void printInfo() {
		System.out.println("Hình tam giác (Cạnh: " + String.format("%.2f, %.2f, %.2f", a, b, c) + ")");
		if (dienTich() == 0) {
			System.out.println("Tam giác không hợp lệ!");
		} else {
			super.printInfo();
		}
	}
}
