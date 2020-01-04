package demo;

public class Student extends Person {

    private String school;
    private double grade;

    public Student() {
        System.out.println("Student Constructor is called...");
    }

    public Student(String name,String school, double grade) {
        super(name);
        this.school = school;
        this.grade = grade;
        System.out.println("Student Constructor 2 is called...");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
