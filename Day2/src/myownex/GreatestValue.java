package myownex;

public class GreatestValue {

	public static void main(String[] args) {

		int num1 = 25 ;
		int num2 = 10 ;
		int num3 = 15;
		int min = 0 ;
		String status = "";
		
		min = (num1<num2)?num1:num2;
		min = (min<num3)?min:num3;
		
		status = (min < 10)?"The smallest number is less than 10 " :"The smallest number is greater than or equal to 10";
		System.out.println("Num1 : " + num1);
		System.out.println("Num2 : " + num2);
		System.out.println("Num3 : " + num3);
		System.out.println("Smallest Number : " + min);
		System.out.println(status);
		
	}

}
