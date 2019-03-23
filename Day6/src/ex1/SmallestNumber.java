package ex1;

import javax.swing.JOptionPane;

public class SmallestNumber {

	public static void main(String[] args) {

		int[] num = new int[10];
		int min=0;
		int counter;
		int totalNumber=3;
		
		for(counter=0;counter<totalNumber;counter++) {
			num[counter] = Integer.parseInt(JOptionPane.showInputDialog("Enter the numbers until" +
											totalNumber + " are entered"));
			
			if((counter==0)||num[counter]<min) {
				min = num[counter];
			}
			
			
		}
		
		JOptionPane.showMessageDialog(null, "The smallest number is " + min);
	}

}
