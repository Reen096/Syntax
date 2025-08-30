package advance.dev.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import advance.dev.model.Shape;

public class Manager implements IManager {
	private List<Shape> shapeList = new ArrayList<>();

	@Override
	public void add(Shape shape) {
		// TODO Auto-generated method stub
		shapeList.add(shape);
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
//		Collections.sort(shapeList, new Comparator<Shape>() {
//
//			@Override
//			public int compare(Shape o1, Shape o2) {
//				// TODO Auto-generated method stub
//				return o1.chuVi() > o2.chuVi() ? 1 : -1;
//			}
//		});
		Collections.sort(shapeList, new MyCompare());
	}

	@Override
	public void findMaxCV() {
		// TODO Auto-generated method stub
		System.out.println("*****MAX SHAPE CV********");
//		Shape find = shapeList.get(0);
//		for (Shape shape : shapeList) {
//			if(find.chuVi() < shape.chuVi())
//				find = shape;
//		}
//		System.out.println(find);
		Collections.sort(shapeList, new Comparator<Shape>() {

			@Override
			public int compare(Shape o1, Shape o2) {
				// TODO Auto-generated method stub
				return o1.chuVi() < o2.chuVi() ? 1 : -1;
			}
		});
		Shape max = shapeList.get(0);
		System.out.println(max);
	}

	@Override
	public void findMaxDT() {
		// TODO Auto-generated method stub
//		System.out.println("*****MAX SHAPE DT********");
//		Shape find = shapeList.get(0);
//		for (Shape shape : shapeList) {
//			if(find.dienTich() < shape.dienTich())
//				find = shape;
//		}
//		System.out.println(find);
		Collections.sort(shapeList, new Comparator<Shape>() {

			@Override
			public int compare(Shape o1, Shape o2) {
				// TODO Auto-generated method stub
				return o1.dienTich() < o2.dienTich() ? 1 : -1;
			}
		});
		Shape max = shapeList.get(0);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("*****SHAPE LIST********");
		for (Shape shape : shapeList) {
			System.out.println(shape);
		}
	}

}