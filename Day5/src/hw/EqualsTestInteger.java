package hw;

public class EqualsTestInteger {

	public static void main(String[] args) {

		Integer int1 , int2 ;
		int1 = 77 ;
		int2 = int1;
		
		System.out.println("int1 :" + int1);
		System.out.println("int2:"+int2);
		
		System.out.println("same object?"+ (int1==int2));
		
		int2 = new Integer(int1);
		System.out.println("int1:"+int1);
		System.out.println("int2:"+int2);
		
		System.out.println("Same object? :" + (int1==int2));
		
		System.out.println("Same value :"+(int1.equals(int2)));
	}

}
