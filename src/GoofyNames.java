
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String name = JOptionPane.showInputDialog("wat name");
		// 2. Print upper case name to the console using
		// Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the String.
		int qw = name.length();
		// 4. Create a String variable to store the next character of the name
		// using .substring(start, end)
		// HINT: replace 'start' and 'end' to get String with character at i
		name.substring(0, qw);
		// 5. Use MODULO to set this variable to upper case for EVEN characters
		// and lower case for ODD characters
		for (int i = 2; i < qw; i++) {
			if (i % 2 == 0) {
				name.toUpperCase();
			}
			if (i % 2 == 1) {
				name.toLowerCase();

			}
		}
		System.out.println(name);
		// 6. ADD this String (containing 1 char) to the goofyName String

		// 7. Use pop-up to show user their Goofy name

	}
}

// åååßßßççç I CAN FLY