package mytypemistmatchexampleproject1;

public class InternationalStudent extends Student {
	
	private String country;
	
	public InternationalStudent() {
		//System.out.println("InternationalStudent : constructor is called...");
	}
	
	public InternationalStudent(String name,String school,double grade,String country) {
		super(name,school,grade);
		this.country=country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public void myMethod(String sth) {
		System.out.println("myMethod " + sth + " in international student class ");
	}
	
	
}
