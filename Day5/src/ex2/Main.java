package ex2;

public class Main {

	public static void main(String[] args) {

		String str = "Hello";
		//non-static method
		System.out.println(str.endsWith("slo"));
		
		//static method
		System.out.println(Character.forDigit(14, 16));
		
		//static method
		System.out.println(Math.floor(4.6));
		
		//static method
		System.out.println("0=" + Character.isDigit('0'));
		System.out.println("A=" + Character.isDigit('A'));
		
	}

}
