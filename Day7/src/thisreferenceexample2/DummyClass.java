package thisreferenceexample2;

public class DummyClass {

	String hello = "hello";
	String bye = "bye";
	
	void myMethod1() {
		String s1 = myMethod2("Thu");
		String s2 = this.myMethod2("Thu");
		
		System.out.println("s1 : " + s1 + " s2 : " + s2);
		
		String s3 = this.myMethod3(this, this.bye);
		System.out.println("s3 :" + s3);
	}
	String myMethod2(String name) {
		return "Hello " + name ;
	}
	String myMethod3(Object o1,String s) {
		return s + " " + o1.getClass().getName();
		
	}
}
