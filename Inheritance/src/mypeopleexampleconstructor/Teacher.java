package mypeopleexampleconstructor;

public class Teacher extends People {

	public String subject;
	
	public Teacher() {
		System.out.println("Teacher : construcuor is called...");
	}
	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
