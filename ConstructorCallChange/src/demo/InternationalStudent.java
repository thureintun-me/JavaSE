package demo;

public class InternationalStudent extends Student {
        private String country;

    public InternationalStudent() {
        System.out.println("International Student Construcctor is called...");
    }

    public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
}
