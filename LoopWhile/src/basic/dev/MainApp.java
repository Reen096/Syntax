package basic.dev;

public class MainApp {

	public static void main(String[] args) {
		int i = 100;
		System.out.println("Các số từ 100 đến 999 có tổng các chữ số chia hết cho 3:");

		while (i <= 999) {
			int so = i;
			int tongChuSo = 0;

			while (so > 0) {
				int chuSo = so % 10;
				tongChuSo += chuSo;
				so /= 10;
			}

			if (tongChuSo % 3 == 0) {
				System.out.print(i + " ");
			}

			i++;
		}

	}

}
