package advance.dev.model;

class Rectangle extends Shape {
	private double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double chuVi() {
		return 2 * (width + height);
	}

	@Override
	public double dienTich() {
		return width * height;
	}

	@Override
	public void printInfo() {
		System.out.println("Hình chữ nhật (Rộng: " + String.format("%.2f", width) + ", Cao: "
				+ String.format("%.2f", height) + ")");
		super.printInfo();

	}

}
