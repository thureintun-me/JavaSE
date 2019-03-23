package ex3;

public class ConditionalOperator {

	public static void main(String[] args) {

		String status = "" ;
		int grade = 80 ;
		
		status = (grade >= 50)?"Pass" : "Fail" ;
		System.out.println(status);
	}

}
