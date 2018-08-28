package mytypemistmatchexampleproject2;


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
		
		if(people2 instanceof Student) {
			Student student2 = (Student)people2;
			System.out.println("people 2 instanceof student = " + true);
		}else {
			System.out.println(  "people2 instanceof student = " + false);
		}
		
		
		
	}
}


