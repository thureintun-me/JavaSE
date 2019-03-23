package myconstructorexample;

public class StudentRecord {
	
	private String name;
	private double mathGrade;
	private double englishGrade;
	private double scienceGrade;
	private double average;
	
	private static int studentCount = 0 ;
	
	public StudentRecord() {
		
	}
	
	public StudentRecord(String name) {
		this.name=name;
	}
	
	public StudentRecord(String name,double mathGrade) {
		this(name);
		this.mathGrade=mathGrade;
	}
	
	public StudentRecord(String name,double mathGrade,double englishGrade) {
		this(name,mathGrade);
		this.englishGrade=englishGrade;
	}
	
	public StudentRecord(String name,double mathGrade,double englishGrade,double scienceGrade) {
		this(name,mathGrade,englishGrade);
		this.scienceGrade=scienceGrade;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getAverage() {
		double result = 0 ;
		result = (mathGrade+englishGrade+scienceGrade)/3;
		return result;
	}
	
	public static int getStudentCount() {
		return studentCount;
	}
	
	public static void increaseStudentCount() {
		studentCount++;
	}

	public double getMathGrade() {
		return mathGrade;
	}

	public void setMathGrade(double mathGrade) {
		this.mathGrade = mathGrade;
	}

	public double getEnglishGrade() {
		return englishGrade;
	}

	public void setEnglishGrade(double englishGrade) {
		this.englishGrade = englishGrade;
	}

	public double getScienceGrade() {
		return scienceGrade;
	}

	public void setScienceGrade(double scienceGrade) {
		this.scienceGrade = scienceGrade;
	}
	
}
