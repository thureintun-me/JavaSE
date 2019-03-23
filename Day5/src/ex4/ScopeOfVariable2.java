package ex4;

public class ScopeOfVariable2 {

	public static void main(String[] args) {

		int var1 =10;
		int var2 = 15;
		
		if(var1<100) {
			var2 = 20 ;
		}else {
			var2 = 21;
		}
		
		System.out.println("Value of var1 : " + var1);
		
		//Access to var2 is now allowed
		System.out.println("Value of var2 :" + var2);
	}

}
