package hw;

import javax.swing.JOptionPane;

public class MyGetInputFromKeyboardJOptionePane {

	public static void main(String[] args) {

		String name = "";
		int age = 0;
		
		name = JOptionPane.showInputDialog("Please Enter your name...");
		
		age = Integer.parseInt(JOptionPane.showInputDialog("Please Enter your age..."));
		String msg = "Hello " + name;
		if ( age > 100) {
			JOptionPane.showMessageDialog(null, msg + " ,you are old....");
		}else {
			JOptionPane.showMessageDialog(null, msg + " , You are young...");
		}
	}

}
