package mypeopleexampleimplicitcasting;

public class People {
	private String name;
	private String address;
	
	public People() {
		//System.out.println("People : constructor is called...");
	}
	
	public People(String name) {
		this.name=name;
		//System.out.println("People : constructor 2 is called..");
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//a method that will be overridden by sub-class
	public void myMethod(String sth) {
		System.out.println("myMethod " + sth + "in person class");
		
	}
}
