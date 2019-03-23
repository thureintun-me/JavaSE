package ex1;

import javax.swing.JOptionPane;

public class NumWords2 {

	public static void main(String[] args) {

		int number = 0 ;
		String msg ="";
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Enter number between 1 to 10"));
		
		
		switch(number) {
		case 1 :
			msg = "One";
			break;
		case 2:
			msg="Two";
			break;
		case 3:
			msg="Three";
			break;
		case 4:
			msg="Four";
			break;
		case 5:
			msg="Five";
			break;
		case 6:
			msg="Six";
			break;
		case 7:
			msg="Seven";
			break;
		case 8:
			msg="Eight";
			break;
		case 9:
			msg="Nine";
			break;
		case 10:
			msg="Ten";
			break;
		default :
			msg="Invalid number";   
				
			
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
