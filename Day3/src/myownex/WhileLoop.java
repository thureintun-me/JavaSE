package myownex;

import javax.swing.JOptionPane;

public class WhileLoop {

	public static void main(String[] args) {

		String[] names = {"Tengo","Naoko","Junpei"};
		
		int counter = 0 ;
		
		String searchName =JOptionPane.showInputDialog("Enter Junpei or Hajime");
		boolean foundName=false;
		
		while(counter<names.length) {
			if(names[counter].equals(searchName)) {
				foundName=true;
				
			}
			counter++;
			break;
		}
		
		if(foundName) {
			JOptionPane.showMessageDialog(null, searchName + " is found");
		}else {
			JOptionPane.showMessageDialog(null, searchName + " is not found");
		}
		
	}

}
