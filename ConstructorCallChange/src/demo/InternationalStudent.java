package demo;

public class InternationalStudent extends Student {
        private String country;

    public InternationalStudent() {
        System.out.println("International Student Construcctor is called...");
    }

    public InternationalStudent(String name, String school, double grade, String country) {
        super(name, school, grade);
        this.country = country;
        System.out.println("International Student Constructor 2 is called...");
    }

    public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
}
