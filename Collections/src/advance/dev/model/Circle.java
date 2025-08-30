package advance.dev.model;

public class Circle extends Shape {
	private double bk;

	public Circle(double bk) {
		super();
		this.bk = bk;
	}

	public double getBk() {
		return bk;
	}

	public void setBk(double bk) {
		this.bk = bk;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * bk;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * bk * bk;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Circle cv:%.2f - dt:%.2f", chuVi(), dienTich());
	}

}