package staticmethodexample;

public class StaticMethodExample {

	public static void main(String[] args) {

		System.out.println("Methos.a :" + Method.a);
		
		Method.staticMethod(5);
		
		Method d = new Method();
		System.out.println("d.a:"+d.a);
		
		d.staticMethod(0);
		
		Method e = new Method();
		System.out.println("e.a " + e.a);
		d.a += 3 ;
		System.out.println("Method.a : " + Method.a);
		System.out.println("d.a :" + d.a);
		System.out.println("e.a : " + e.a);
		
		//compile time error
		//Method.nonStaticMethod(0);
	}

}
