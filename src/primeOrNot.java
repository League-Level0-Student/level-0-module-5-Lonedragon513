import javax.swing.JOptionPane;

public class primeOrNot {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("what num");
		int qwerty = Integer.parseInt(num);
		for (int i = 2; i < qwerty; i++) {
			if (qwerty % i == 0) {
				System.out.println("it is not a prime");
				System.exit(0);

			}

			else {
				System.out.println("its");
			}
		}
	}

}
