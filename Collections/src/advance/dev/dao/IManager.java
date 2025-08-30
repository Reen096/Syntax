package advance.dev.dao;

import advance.dev.model.Shape;

public interface IManager {
	public void add(Shape shape);

	public void show();

	public void sort();

	public void findMaxCV();

	public void findMaxDT();
}