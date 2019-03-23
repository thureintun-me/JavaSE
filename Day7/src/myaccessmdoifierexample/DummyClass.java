package myaccessmdoifierexample;

public class DummyClass {
	
	//Private field.Can only accessed within a same class
	private String s1 = "private string..";
	
	//Protected String . Can be access within the same package and 
	//subclass of this class even if they are in different package
	protected String s2 = "prptected string";
	
	//Public field. accessed.Can be accessed from anybody
	public String s3 = "public string";
	
	//default field. it can be accessed within the same package
	String s4 = "string without access modifier";
	
	private void method1() {
		
	}
	
	protected void method2() {
		
	}
	
	public void method3() {
		
	}
	
	void method4() {
		
	}
	
}
