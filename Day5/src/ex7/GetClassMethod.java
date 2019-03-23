package ex7;

public class GetClassMethod {
	
	public static void main(String[] args) {
		
		String str1 = "Life is worth...living with passion...";
		
		Class str1Class = str1.getClass();
		System.out.println("Class of str1 object instance is : " + str1Class);
		
		Integer integer1 = new Integer(34);
		Class integer1Class = integer1.getClass();
		System.out.println("Class of integer1 object instance is : " + integer1Class);
		
		String int1ClassName = integer1Class.getName();
		System.out.println("class of integer1 object instance is " + int1ClassName);
	}
}
