package myownex;

import javax.swing.JOptionPane;

public class Grades {

	public static void main(String[] args) {

		int mathGrade;
		int scienceGrade;
		int historyGrade;
		double average;
		
		mathGrade=Integer.parseInt(JOptionPane.showInputDialog("Enter math grade betwwen 0 and 100"));
		scienceGrade=Integer.parseInt(JOptionPane.showInputDialog("Enter science grade between 0 and 100"));
		historyGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter history grade between 0 and 100"));
		
		average = (mathGrade+scienceGrade+historyGrade)/3;
		
		if(average>90) 
			JOptionPane.showMessageDialog(null, "You work too hard. Your average is " + average);
			
		else if(average > 50 && average <= 90 ) 
			JOptionPane.showMessageDialog(null, "You did ok.Your average is " + average);
			
		else
			JOptionPane.showConfirmDialog(null, "You need to do. Your average is " + average);
		
		
		
	}

}
