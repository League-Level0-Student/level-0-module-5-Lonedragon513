import javax.swing.JOptionPane;

public class loop {
	public static void main(String[] args) {
		numberg();
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
			if ( i%7==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void numberh() {
		String a = JOptionPane.showInputDialog("how old");
		
		for (int i = 1; i < 777; i++) {
	}
}
