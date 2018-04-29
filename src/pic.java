
public class pic {
	public static void main(String[] args) {

		// i can fly
		int q = 0;
		int a = 1;
		System.out.println(q);
		System.out.println(a);
		for (int i = 0; i < 12; i++) {
			q = q + a;
			System.out.println(q);

			a = q + a;
			System.out.println(a);

		}
	}
}

// = f + f;
// }