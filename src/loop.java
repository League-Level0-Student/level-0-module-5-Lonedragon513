import javax.swing.JOptionPane;

public class loop {
	public static void main(String[] args) {
		Bb();

	}

	public static void numberc() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}

	public static void numberb() {
		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}
	}

	public static void numberA() {

		for (int i = 0; i < 3; i++) {
			for (int p = 0; p < 3; p++) {
				System.out.println(i + " " + p);

			}
		}
	}

	public static void numberd() {
		for (int i = 2; i < 101; i = i + 2) {
			System.out.println(i);
		}
	}

	public static void numbere() {
		for (int i = 1; i < 100; i = i + 2) {
			System.out.println(i);
		}
	}

	public static void numberf() {
		for (int i = 1; i < 100; i = i + 2) {
			System.out.println(i + "  is odd");
			System.out.println(i + 1 + " is even");
		}
	}

	public static void numberg() {
		for (int i = 1; i < 777; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void numberh() {
		String a = JOptionPane.showInputDialog("how old");
		int b = Integer.parseInt(a);
		int c = 2018;
		for (int i = 0; i < b; i++) {
			System.out.println("in " + (c - i) + " you are " + (b - i));
		}
	}

	public static void numbernotworking() {
		int a = 1;
		int b = 2;
		int c = 3;
		for (int m = 0; m < 1; m++) {
			for (int i = 0; i < 3; i++) {

				System.out.println(a + " " + b + " " + c);
				a = a + 3;
				b = b + 3;
				c = c + 3;
			}
		}
	}

	public static void hii() {
		for (int m = 0; m < 3; m++) {
			for (int x = 1; x < 4; x++) {
				System.out.print(x + 3 * m);
				System.out.print("   ");
			}
			System.out.print("\n");
		}

	}

	public static void IcanFly() {
		for (int m = 0; m < 10; m++) {
			for (int x = 1; x < 11; x++) {
				System.out.print(x + 10 * m);
				System.out.print("   ");
			}
			System.out.print("\n");
		}

	}

	public static void Iis() {
		for (int m = 0; m < 6; m++) {
			for (int x = 0; x < m; x++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

	public static void Bb() {
		for (int m = 0; m < 101; m++) {
			System.out.println(100 - m);
		}

	}

}
