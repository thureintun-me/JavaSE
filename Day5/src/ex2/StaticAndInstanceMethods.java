package ex2;

public class StaticAndInstanceMethods {

	public static void main(String[] args) {

		String str1 = new String("I am object instance of String class...");
		
		String str2 = "Live your passion";
		
		//instance methods
		char x = str1.charAt(2);
		char y = str2.charAt(1);
		char z = str2.charAt(0);
		
		System.out.println("The third character of str1 :" + x);
		
		System.out.println("The second character of str2 : " + y);
		
		System.out.println("The first character of str2 : " + z);
		
		boolean b = str1.equalsIgnoreCase(str2);
		
		String str3 = b ? "YES" : "NO";
		
		System.out.println("Do str1 and str2 have same string equal ignore case : " + str3);
		
		// invoke a static methods
		int i = 23 ;
		String str4 = String.valueOf(i);
		System.out.println("Value of str4 :" + str4);
		
		String str5 =new String("45");
		int ii = Integer.parseInt(str5);
		System.out.println("value of ii :" + ii);
		
		
	}

}
