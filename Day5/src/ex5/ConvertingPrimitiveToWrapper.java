package ex5;

public class ConvertingPrimitiveToWrapper {

	public static void main(String[] args) {

		Integer dataAccount = new Integer(7810);
		
		//convert Integer type into int primitive type
		int newAccount = dataAccount.intValue();
		System.out.println("int newAccount : " + newAccount);
		
		//convert a String type to int primitive type
		String pennsylvania = "65000";
		int peen = Integer.parseInt(pennsylvania);
		System.out.println("int peen : " + peen);
		
		//convert int primitive type to Integer wrapper type
		Integer myInteger = new Integer(peen);
		System.out.println("Integer myInteger : " + myInteger);
		
		
	}

}
