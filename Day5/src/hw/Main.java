package hw;

public class Main {

	public static void main(String[] args) {

		boolean b = true;
		System.out.println("start of the main method and b : " + b);
		
		test(b);
		System.out.println("end of the test method and b : " + b);
	}

	public static void test(boolean t) {
		System.out.println("start of the test method and t : " + t);
		
		t = false ;
		
		System.out.println("End of the test method and t : " + t);
		
	}
}
