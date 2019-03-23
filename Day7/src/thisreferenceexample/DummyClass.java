package thisreferenceexample;

public class DummyClass {
	
	void myMethod1() {
		String s1 = myMethod2("David");
		String s2 = this.myMethod2("David");
		
		System.out.println("s1 : " + s1 + " s2 :  " + s2);
		
		String s3 = this.myMethod3(this);
		System.out.println("s3 : " + s3);
	}
	
	String myMethod2(String name) {
		return "Hello " + name;
	}
	
	String myMethod3(Object o1) {
		return o1.getClass().getName();
		
	}
}
