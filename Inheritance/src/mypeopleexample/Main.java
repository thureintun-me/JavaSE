package mypeopleexample;

public class Main {

	public static void main(String[] args) {
		
		People p1 = new People();
		p1.setName("Tom Jones");
		
		Student student1 = new Student();
		student1.setName("CCR");
		student1.setSchool("Lexington High");
		
		InternationalStudent internationalStudent1 =
				new InternationalStudent();
		
		internationalStudent1.setName("Bill CLinton");
		internationalStudent1.setSchool("Lexington High");
		internationalStudent1.setCountry("Korea");
		
		Teacher teacher1= new Teacher();
		teacher1.setName("Beatles");
		teacher1.setSubject("History");
		
		
		System.out.println("Displaying names of all object instances");
		System.out.println("p1.getName(): "+p1.getName());
		System.out.println("student1.getName() : "+student1.getName());
		System.out.println("internationalStudent1.getName() : "+internationalStudent1.getName());
		System.out.println("teacher1.getName() : "+teacher1.getName());
		
		//every class is a subclass of Object class , which has getClass() method
		Class class1= internationalStudent1.getClass();
		
		System.out.println("Displaying class hierarchy of InternationalStudent Class");
			
			while(class1.getSuperclass()!= null) {
				String child = class1.getName();
				String parent = class1.getSuperclass().getName();
				System.out.println(" " + child + " is a child class of " + parent);
				class1 = class1.getSuperclass();
			}
	}

}
