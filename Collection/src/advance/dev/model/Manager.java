package advance.dev.model;

import java.util.ArrayList;
import java.util.Collections;

class Manager implements IManager {
	ArrayList<Shape> shapes = new ArrayList<>(); // Danh sách hình

	@Override
	public void add(Shape shape) {
		shapes.add(shape);
	}

	@Override
	public void sort() {
		Collections.sort(shapes, (s1, s2) -> Double.compare(s1.dienTich(), s2.dienTich()));
	}

	@Override
	public void findMaxCV() {
		if (shapes.isEmpty()) {
			System.out.println("Danh sách rỗng");
			return;
		}
		Shape maxCVShape = shapes.get(0);
		for (Shape shape : shapes) {
			if (shape.chuVi() > maxCVShape.chuVi()) {
				maxCVShape = shape;
			}
		}
		System.out.println("\nHình có chu vi lớn nhất");
		maxCVShape.printInfo();
	}

	@Override
	public void MaxDT() {

	}

	// In danh sách hình
	public void print() {
		System.out.println("\nDanh sách hình");
		for (int i = 0; i < shapes.size(); i++) {
			System.out.println("Hình " + (i + 1) + ":");
			shapes.get(i).printInfo();
		}
	}
}
