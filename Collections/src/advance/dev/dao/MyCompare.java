package advance.dev.dao;

import java.util.Comparator;

import advance.dev.model.Shape;

public class MyCompare implements Comparator<Shape> {

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return o1.chuVi() > o2.chuVi() ? 1 : -1;
	}

}