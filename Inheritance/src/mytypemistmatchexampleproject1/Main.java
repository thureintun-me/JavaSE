package mytypemistmatchexampleproject1;


//type casting 


public class Main {

	public static void main(String[] args) {
		
		//Implicit casting - student object is
		//type of person
		People people1 = new Student();
		
		//Implicit casting - teacher object is 
		//type of person
		People people2 = new Teacher();
		
		//Explicit casting 
		Student student1 = (Student)people1;
		
		
		// Explicit type casting - no compile error.
		// But ClassCastException will occur during runtime 
		// because you are casting Teacher type to 
		//Student type and Teacher and Student do not
		 // have any inheritance relationship.
		Student student2 = (Student)people2;
		
	}
}


