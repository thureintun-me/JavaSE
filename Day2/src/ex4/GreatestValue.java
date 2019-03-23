package ex4;

public class GreatestValue {

	public static void main(String[] args) {

		int num1 = 20 ;
		int num2 = 10 ;
		int num3 = 15 ;
		int max = 0 ;
		
		max = (num1 > num2)?num1 : num2 ;
		max = (max > num3)?max : num3 ;
		
		System.out.println("Num1 :" + num1);
		System.out.println("Num2 :" + num2);
		System.out.println("Num3 :" + num3);
		System.out.println("highest number : " + max);
			
	}

}
