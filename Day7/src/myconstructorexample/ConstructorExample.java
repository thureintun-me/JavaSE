package myconstructorexample;

public class ConstructorExample {

	public static void main(String[] args) {

		StudentRecord anna = new StudentRecord("Anna");
		StudentRecord.increaseStudentCount();
		
		StudentRecord beach = new StudentRecord("Beach", 45);
		StudentRecord.increaseStudentCount();
		
		StudentRecord cris = new StudentRecord("Cris", 45, 50, 60);
		StudentRecord.increaseStudentCount();
		
		System.out.println("Name : " + cris.getName() + " ,Average : " + cris.getAverage());
		
		System.out.println("Student Count = " + StudentRecord.getStudentCount());
				
	}

}
