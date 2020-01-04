package demo;

public class Person {
    private String name;
    private String address;

    public Person(){
        System.out.println("Person Constructor is called...");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("Person Constructor 2 is called...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
