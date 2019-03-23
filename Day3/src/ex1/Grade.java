package ex1;

import javax.swing.JOptionPane;

public class Grade {

	public static void main(String[] args) {
		
		int mathGrade;
		int historyGrade;
	    int scienceGrade;
		double average;
		
		
		mathGrade=Integer.parseInt(JOptionPane.showInputDialog(
				"Enter math Grade between 0 and 10"));
		historyGrade=Integer.parseInt(JOptionPane.showInputDialog(
				"Enter history Grade between 0 and 100"));
		scienceGrade=Integer.parseInt(JOptionPane.showInputDialog(
				"Enter science grade between 0 and 10"));
		
		average = (mathGrade+historyGrade+scienceGrade)/3;
		
		if(average>60) {
			JOptionPane.showMessageDialog(null, "Good Job ! Your average is " + average);
		}else {
			JOptionPane.showMessageDialog(null, "You need to do better .Your average is "+average);
		}

	}
		
}
