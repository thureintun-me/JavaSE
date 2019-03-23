package myaccessmdoifierexample;

public class Main {
	public static void main(String[] args) {
		
		DummyClass dummyObject = new DummyClass();
		
		// compile time error
		//cannot access private field
		//System.out.println("s1 : " + dummyObject.s1);
		
		//protective
		//same package
		System.out.println("s2 : " + dummyObject);
		
		//public
		// can call form anywhere
		System.out.println("s3 : " + dummyObject.s3);
		
		//default
		//same package
		System.out.println("s4 : " + dummyObject.s4);
		
		//compile time error
		//can't call private method from other class
		//dummyObject.method1();
		
		//calling protected method
		dummyObject.method2();
		
		//calling public method
		dummyObject.method3();
		
		//calling default method
		dummyObject.method4();
		
	}
	
}
