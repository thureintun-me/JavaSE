package mypeopleexampleoverring;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("---observe overriding method behaviour---");
		
		
		People p1 = new People();
		p1.myMethod("test1");
		
		Student s1 = new Student();
		s1.myMethod("test2");
		
		InternationalStudent internationalStudent = new InternationalStudent();
		internationalStudent.myMethod("test3");
		
	}
}


