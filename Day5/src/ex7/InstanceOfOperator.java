package ex7;

public class InstanceOfOperator {

	public static void main(String[] args) {

		String str1 = "Life is worth living...with passion..";
		Integer integer1 = new Integer(40);
		Long l1 = new Long(458);
		
		boolean b1 = str1 instanceof String;
		System.out.println("str1 is String type : " + b1);
		boolean b2 = str1 instanceof Object;
		System.out.println("str1 is object type :" + b2);
		System.out.println("======================================================================");
		
		 b1 = integer1 instanceof Integer;
		 System.out.println("integer1 is Integer type :"+ b1);
		 b2 = integer1 instanceof Object;
		 System.out.println("integer1 is Object type : " + b2);
		 boolean b3 = integer1 instanceof Number;
		 System.out.println("integer1 is number type : " + b3);
		 System.out.println("======================================================================");
		 
		 b1 = l1 instanceof Long;
		 System.out.println("l1 is Long Type : " + b1);
		 b2 = l1 instanceof Object;
		 System.out.println("l1 is Object type : " + b2);
		 b3 = l1 instanceof Number;
		 System.out.println("l1 is Number type : " + b3);
				 
	}

}
