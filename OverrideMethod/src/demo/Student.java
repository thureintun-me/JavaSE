package demo;

public class Student extends Person {

    protected String school;
    protected double grade;

    public Student() {
    }

    public Student(String name, String school, double grade) {
        super(name);
        this.school = school;
        this.grade = grade;
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

    public void myMethod(String str){
        System.out.println("myMethod ("+ str +" ) in student class");

    }
}
