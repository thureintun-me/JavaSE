package ex1;

import javax.swing.JOptionPane;

public class NumWords {

	public static void main(String[] args) {

		int number=0;
		
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 1 to 10"));
		
		if(number==1) {
			JOptionPane.showMessageDialog(null, "One");
		}else if(number ==2) {
			JOptionPane.showMessageDialog(null, "Two");
		}else if(number==3) {
			JOptionPane.showMessageDialog(null, "Three");
		}else if(number==4) {
			JOptionPane.showMessageDialog(null, "FOur");
		}else if(number==5) {
			JOptionPane.showMessageDialog(null, "Five");
		}else if(number==6) {
			JOptionPane.showMessageDialog(null, "Six");
		}else if(number==7) {
			JOptionPane.showMessageDialog(null, "Seven");
		}else if(number==8) {
			JOptionPane.showMessageDialog(null, "Eight");
		}else if(number==9) {
			JOptionPane.showMessageDialog(null, "Nine");	
		}else if(number==10){
			JOptionPane.showMessageDialog(null, "Ten");
		}else {
		    JOptionPane.showMessageDialog(null,"Invalid number...");
		}
		
	}

}
