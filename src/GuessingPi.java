/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
public static void main(String[] args) {
	

		// 2. Make a String variable to hold the value of Pi.
		//    Get the first few digits from http://www.piday.org/million/.
	String A = "3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196442881097566593344612847564823378678316527120190914564856692346034861045432664821339360726024914127372458700660631558817488152092096282";
		// 3. Print out the first 3 digits of Pi to the console.
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.
	int e = A.length();
		System.out.println(A.charAt(0));
		System.out.println(A.charAt(1));
		System.out.println(A.charAt(2));
		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.
for(int ICanFly = 0 ; ICanFly < 1 ; ICanFly++) {
			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()
for(int i = 0 ; i < e ; i++) {
	

				// 5. Ask the user for the NEXT digit of pi.
	String Ans = JOptionPane.showInputDialog("what int !!");
	
	
				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 
				if (Ans.equals(A.charAt(i)+"")) {
					JOptionPane.showMessageDialog(null, "U R right");
				}
					// 7. If they are correct, print out "correct".
				else {
					JOptionPane.showMessageDialog(null, "U R not right");
					break;
				}
					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use '' to break out of the loop.
			
}
}
}
}

