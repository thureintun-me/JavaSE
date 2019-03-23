package studentrecordexample;

public class StudentRecord {

	private String name;
	private double mathGrade;
	private double engGrade;
	private double scienceGrade;
	
	private static int studentCount = 0 ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMathGrade() {
		return mathGrade;
	}

	public void setMathGrade(double mathGrade) {
		this.mathGrade = mathGrade;
	}

	public double getEngGrade() {
		return engGrade;
	}

	public void setEngGrade(double engGrade) {
		this.engGrade = engGrade;
	}

	public double getScienceGrade() {
		return scienceGrade;
	}

	public void setScienceGrade(double scienceGrade) {
		this.scienceGrade = scienceGrade;
	}
	
	public double getAverage() {
		double result;
		result = (mathGrade+ engGrade + scienceGrade) / 3 ;
		return result;
	}
	public static int getStudentCount() {
		return studentCount;
	}
	public static void increaseStudentCount() {
		 studentCount++;
	}
	
	public void myPrint() {
		System.out.println("first overload method : Nothing is passed on");
	}
	
	public void myPrint(String name) {
		System.out.println("Second onvrload method : Name : " + name);
	}
	
	public void myPrint(String name,double average) {
		System.out.println("Third overload method :  Name  " + name);
		System.out.println("Average grade : " + average);
	}
	
}
