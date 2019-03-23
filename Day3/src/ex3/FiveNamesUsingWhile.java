package ex3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiveNamesUsingWhile {
	
	public FiveNamesUsingWhile() {
		
	}
	
	public static void main(String[] args) {

		BufferedReader reader = 
					new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		int counter = 0;
		
		try {
			
			System.out.println("Enter Name ");
			name = reader.readLine();
			
		} catch (Exception e) {

			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		while(counter<5) {
			System.out.println("Name : " + name);
			counter++;
		}
	}

}
