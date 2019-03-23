package ex2;

public class DaysOfTheWeek {

	public static void main(String[] args) {

		String[] days = {"Sunday", "Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		System.out.println("Display days of the week using while loop");
		int counter = 0 ;
		
		while(counter<days.length){
			System.out.print(days[counter]+ " ,");
			counter++;
		}
		System.out.println();
		System.out.println("=====================================================");
		System.out.println("Diaplay days of the week using do-while loop");
		
		counter = 0;
		do {
			System.out.print(days[counter]+ ", ");
			counter++;
		}while(counter<days.length);
		System.out.println();
		System.out.println("======================================================");
		System.out.println("Display days of the week using for loop");
		for(counter=0;counter<days.length;counter++) {
			System.out.print(days[counter]+", ");
		}
	}

}
