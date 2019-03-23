package ex3;

public class TestPassByReference {

	public static void main(String[] args) {

		int[] ages = {10,11,12};
		
		for(int i=0;i<ages.length;i++) {
			System.out.println(ages[i]);	
		}
		
		System.out.println("main : before calling the test method....");
		
		test(ages);
		System.out.println("main : after calling test");
		
		for(int i=0;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		
		System.out.println("main : end");
		
	}
	
	public static void test(int[] arr) {
		
		System.out.println("test:start");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= i + 50;
		}
		
		System.out.println("Test : end");
		
		
	}

}
