package advance.dev.model;

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	public double chuVi() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double dienTich() {
		return Math.PI * radius * radius;
	}

	@Override
	public void printInfo() {
		System.out.println("Hình tròn (Bán kính: " + String.format("%.2f", radius) + ")");
		super.printInfo();
	}
}