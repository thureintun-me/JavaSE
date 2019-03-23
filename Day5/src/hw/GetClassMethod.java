package hw;

import java.util.Date;

public class GetClassMethod {

	public static void main(String[] args) {

		Date date = new Date();
		
		Class dateClass = date.getClass();
		
		System.out.println("Class of date object instance is : " + dateClass);
		
		String dateClassName = dateClass.getName();
		System.out.println("Class of date object instance is : " + dateClassName);
		
	}

}
