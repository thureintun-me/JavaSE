package studentrecordexample;

public class StudentRecordExample {

	public static void main(String[] args) {

		StudentRecord anna = new StudentRecord();
		StudentRecord.increaseStudentCount();
		
		StudentRecord bech = new StudentRecord();
		StudentRecord.increaseStudentCount();
				
		StudentRecord cris = new StudentRecord();
		StudentRecord.increaseStudentCount();
		
		anna.setName("Anna");
		bech.setName("bech");
		cris.setName("Cris");
		
		System.out.println("anna.Name : " + anna.getName());
		
		System.out.println("Student Count : " + StudentRecord.getStudentCount());
		
		anna.setName("Anna");
		anna.setEngGrade(56);
		anna.setMathGrade(56);
		anna.setScienceGrade(78);
		
		anna.myPrint();
		anna.myPrint(anna.getName());
		anna.myPrint(anna.getName(), anna.getAverage());
	}

}
