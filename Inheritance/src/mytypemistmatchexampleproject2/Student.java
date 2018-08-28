package mytypemistmatchexampleproject2;

public class Student extends People {
	
	private String school;
	private double grade;
	
	public Student() {
		//System.out.println("Student Constructor is called...");
	}
	
	public Student(String name,String school,double grade) {
		super(name);
		this.school=school;
		this.grade=grade;
	//	System.out.println("Student : constructor 2 is called ");
	}
	
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public void myMethod(String sth) {
		System.out.println("mMethod " + sth + " in student class");
	}
	
}
