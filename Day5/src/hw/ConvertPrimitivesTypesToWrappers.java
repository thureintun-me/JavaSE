package hw;

public class ConvertPrimitivesTypesToWrappers {

	public static void main(String[] args) {

		Long myLong = 157l;
		long priLong=myLong.longValue();
		System.out.println("Primitive Long : " + priLong);
		
		Boolean wrapperB = true;
		boolean primitiveB = wrapperB.booleanValue();
		System.out.println("Primitive Boolean : " + primitiveB);
		
		
	}

}
