package mypeopleexampleimplicitcasting;


//type casting 


public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("---observe overriding method behaviour---");
		
		
		People p1 = new People();
		p1.myMethod("test1");
		
		Student s1 = new Student();
		s1.myMethod("test2");
		
		InternationalStudent internationalStudent = new InternationalStudent();
		internationalStudent.myMethod("test3");
		
		System.out.println("--- observe polymorphic behaviour---");
		
		//implicit type casting student and people class
		People p2 = new Student(); // example 1
		p2 = s1 ;  // example 2
		p2.myMethod("test4");
		
		
		// implicit type casting between international student and people class
		
		People p3 = new InternationalStudent(); // example 3
		p3 = internationalStudent; //example 4
		p3.myMethod("test5");
		
		// implicit type casting between international student and student
		
		Student s2 = new InternationalStudent(); // example 5
		s2 = internationalStudent; // example 6
		s2.myMethod("test6");
		
		
	}
}


