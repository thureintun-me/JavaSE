package ex1;

import javax.swing.JOptionPane;

public class GreatestNumber {

	public static void main(String[] args) {

		int[] num = new int[10];
		int counter;
		int max = 0;
		int totalNumber = 3;
		
		for(counter=0;counter<totalNumber;counter++) {
			num[counter] =Integer.parseInt(JOptionPane.showInputDialog("Enter numbers until"+ 
					totalNumber+ "are entered"));
			if((counter==0)||num[counter]>max) {
				max = num[counter];
			}
		}
		JOptionPane.showMessageDialog(null, "The greatest number is " + max);
	}

}
