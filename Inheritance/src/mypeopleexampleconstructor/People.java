package mypeopleexampleconstructor;

public class People {
	private String name;
	private String address;
	
	public People() {
		System.out.println("People : constructor is called...");
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
	
	
}
