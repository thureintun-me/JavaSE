package ex2;

import javax.swing.JOptionPane;

public class ForLoop {
	
	public ForLoop() {
		
	}
	public static void main(String[] args) {
		
		String[] names = {"Mg Mg","Kyaw Kyaw","Aung Aung","Tun Tun"};
		
		String searchName = JOptionPane.showInputDialog("Enter either Kyaw kyaw or thu");
		
		boolean foundName = false ;
		
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(searchName)) {
				foundName=true;
				break;
			}
		}
		
		if(foundName) {
			JOptionPane.showMessageDialog(null, searchName + "  is found.");
		}else {
			JOptionPane.showMessageDialog(null, searchName + " is not found");
		}
		
		
	}
}
