package mypeopleexampleconstructorsuper;

public class Main {

	public static void main(String[] args) {
		
		
		
		System.out.println("....About to create object instance of InternationalStudent class...");
		InternationalStudent internationalStudent = 
				new InternationalStudent("Sang Shin","Lincoln",4.5,"Korea");
		
		System.out.println("Name : " + internationalStudent.getName());
		System.out.println("Address : " +internationalStudent.getAddress());
		System.out.println("Grade : " + internationalStudent.getGrade());
		System.out.println("country : " +internationalStudent.getCountry());
		
		
		
	}
}


