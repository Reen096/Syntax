package advance.dev.mainapp;

import java.util.Random;

import advance.dev.dao.IManager;
import advance.dev.dao.Manager;
import advance.dev.model.Circle;
import advance.dev.model.Rect;
import advance.dev.model.Triangle;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.name = "Thi";
		std1.nameSchool = "Mau Giao";

		Student std2 = new Student();
		std2.name = "Thu";
		std2.nameSchool = "Mam Non";

		System.out.println(std1.name + ":" + std1.nameSchool);
		System.out.println(std2.name + ":" + std2.nameSchool);
//		System.out.println(MyMath.tong(5, 8));
//		IManager manager = new Manager();
//		randomShape(manager);
//		manager.show();
//		
//		manager.sort();
//		manager.show();
//		
//		manager.findMaxCV();
//		manager.findMaxDT();
	}

	private static void randomShape(IManager manager) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int number = rand.nextInt(2);
			switch (number) {
			case 0:
				double bk = rand.nextDouble();
				manager.add(new Circle(bk));
				break;
			case 1:
				double a = rand.nextDouble();
				double b = rand.nextDouble();
				manager.add(new Rect(a, b));
				break;
			case 2:
				double c1 = rand.nextDouble();
				double c2 = rand.nextDouble();
				double c3 = rand.nextDouble();
				manager.add(new Triangle(c1, c2, c3));
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + number);
			}
		}
	}

}