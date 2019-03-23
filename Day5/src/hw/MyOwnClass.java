package hw;


public class MyOwnClass {

	public static void main(String[] args) {

		String[] names = new String[5];
		
		for(int i =0;i<args.length;i++) {
			names[i] = args[i];
		}
		
		generateNames(names);
	}
	
	public static void generateNames(String[] arr) {
		char[] names = new char[5];
		for(int i = 0 ; i < arr.length ;i++) {
			System.out.print(names[i] = arr[i].charAt(1));
		}
		
		/*for(char c : names) {
			System.out.println(c);
			
		}*/
	}
}
