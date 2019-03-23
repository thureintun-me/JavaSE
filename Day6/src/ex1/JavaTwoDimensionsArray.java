package ex1;

public class JavaTwoDimensionsArray {

	public static void main(String[] args) {

		int[][] ages = new int[10][5];
		System.out.println("ages.length " + ages.length);
		System.out.println("ages[1].length " +ages[1].length);
		
		for(int i=0;i<ages.length;i++) {
			System.out.println("\nstarting row " + i);
			for (int j = 0; j < ages[1].length; j++) {
				ages[i][j] = i*j;
				System.out.print(ages[i][j] + " ");
			}
		}
	}

}
