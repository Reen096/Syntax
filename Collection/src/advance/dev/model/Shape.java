package advance.dev.model;

abstract class Shape {
	public abstract double chuVi();

	public abstract double dienTich();

	public void printInfo() {
		System.out.printf("Chu vi: %.2f, Dien tich: %.2f\n", chuVi(), dienTich());
	}
}