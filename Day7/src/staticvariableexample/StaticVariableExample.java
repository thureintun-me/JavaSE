package staticvariableexample;

public class StaticVariableExample {

	public static void main(String[] args) {

		 // Access static variables of Variables class.
        // Note that you don't have to create an object instance
        // of Variables class.
		System.out.println("Variables.staticIntA : " + Variables.staticIntA);
		System.out.println("Variables.staticStringB : " + Variables.staticStringB);
		Variables.staticStringB = "Life is good..." ;
		System.out.println("Variables.staticStringB:" + Variables.staticStringB);
		
		// Access instance variables of Variables class.
        // Note that you have to create an object instance
        // of Variables class before you access them.
		Variables objectInstance1 = new Variables();
		Variables objectInstance2 = new Variables();
		objectInstance1.instanceIntA = 20 ;
		System.out.println("objectInstance1.instanceA : " + objectInstance1.instanceIntA);
		objectInstance2.instanceIntA = 15 ;
		System.out.println("objectInstance2.instanceA : " + objectInstance2.instanceIntA);
		
		//// The static variable can be accessed from an object instance.
		System.out.println("objectInstance1.staticIntA : " + objectInstance1.staticIntA);
		objectInstance1.staticIntA = 220 ;
		System.out.println("objectInstance1.staticIntA : " + objectInstance1.staticIntA);
		System.out.println("Varaibles.staticIntA : " + Variables.staticIntA);
		
		//The static variable can be accessed from multiple object instances.
		objectInstance2.staticIntA = 550 ;
		System.out.println("objectinstance1.staticIntA : " + objectInstance1.staticIntA);
		System.out.println("objectInstance2.staticIntA : " + objectInstance2.staticIntA);
		System.out.println("Variables.staticIntA : " + Variables.staticIntA);
		
		//// Compile error when you try to access instance variable as if it is a static variable
		//Variables.instanceIntA = 4 ;
		
		
		
	}

}
