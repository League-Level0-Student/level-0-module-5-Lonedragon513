package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class newClass {
public static void main(String[] args) {
	Robot Bb = new Robot();
	Bb.setPenWidth(10);
	
	Bb.setSpeed(100);
	
	String q = JOptionPane.showInputDialog("ramdom number");
	int b = Integer.parseInt(q);
	String g = JOptionPane.showInputDialog("ramdom number");
	int z = Integer.parseInt(g);
	String y = JOptionPane.showInputDialog("ramdom number");
	int o = Integer.parseInt(y);
	Bb.setPenColor(b, z, o);
	//String color = JOptionPane.showInputDialog("what color (b=blue; r=red; y=yellow only these I'm to lazy to type more");
//	if (color.equals("y")) {
	//	Bb.setPenColor(255, 255, 0);
//	}
	//	else if (color.equals("r")) {
	//	Bb.setPenColor(255, 0, 0);
	//	}
	//	else if (color.equals("b")) {
		//		Bb.setPenColor(0, 102, 255);
		//	}
	
			String hi = JOptionPane.showInputDialog("how many?");
			int me = Integer.parseInt(hi);
	
			for (int i = 0; i < me; i++) {
				Bb.move(100);
				Bb.penDown();
				
		for (int n = 0 ; n <4 ; n++) {
				Bb.move(50);
				Bb.turn(90);
				
		}
		}
}
}
	
	
	
	
	
	
	
	


