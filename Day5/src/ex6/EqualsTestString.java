package ex6;

public class EqualsTestString {

	public static void main(String[] args) {

		String str1,str2;
		
		str1 = "life is worth...living passion";
		str2 = str1 ;
		
		System.out.println("Value of str1 : " + str1);
		System.out.println("Value of str2 : " + str2);
		
		// == is used for reference type not primitive type , to check refer to the same object instances ot not
		System.out.println("same Object? : "  + (str1==str2) );
		
		str2 = new String(str1);
		
		System.out.println("Str1 :" + str1);
		System.out.println("Str2 :" + str2);
		
		System.out.println("Same Object :"+ (str1==str2));
		
		//.equlas is used to check for value 
		System.out.println("Same value :" + str1.equals(str2));
		
	}

}
