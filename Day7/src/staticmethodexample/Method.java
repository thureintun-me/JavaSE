package staticmethodexample;

public class Method {
	
	public Method() {
		// TODO Auto-generated constructor stub
	}
	
	//static variable
	static int a = 0 ;
	
	//static method
	static void staticMethod(int i) {
		System.out.println("static method("+i+")  entered");
	}
	
	static {
		System.out.println("Anonymous static method entered , a : " + a);
		a = a+ 1;
		System.out.println("anonymous static method exiting , a :" + a);
	}
	
	void nonStaticMethod(int i) {
		System.out.println("my non static method ("+i+") entered");
	}
	
}
