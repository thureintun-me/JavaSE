package mypeopleexampleconstructor;

public class Student extends People {
	
	private String school;
	private double grade;
	
	public Student() {
		System.out.println("Student Constructor is called...");
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
	
	
}
