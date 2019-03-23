package hw;

import javax.swing.JOptionPane;

public class MyOwnJavaArray {

	public static void main(String[] args) {

		String[] names = new String[10];
		int max = 0;
		int totalNumber=3;
		int counter;
		String longestName="";
		
		for(counter=0;counter<totalNumber;counter++) {
			names[counter] = JOptionPane.showInputDialog("Enter names until  " + totalNumber + " names is entered");
			
			if((counter==0)|| names[counter].length()>max) {
				max = names[counter].length();
				longestName = names[counter];
			}
		}
		
		JOptionPane.showMessageDialog(null, "The longest name is " + longestName);
	}

}
