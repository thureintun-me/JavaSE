package demo;

public class InternationalStudent extends Student{

    private String country;

    public InternationalStudent(String country) {
        this.country = country;
    }

    public InternationalStudent(String name, String school, double grade, String country) {
        super(name, school, grade);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void myMethod(String str){
        System.out.println("myMethod (" + str + ") in international student");
    }
}
