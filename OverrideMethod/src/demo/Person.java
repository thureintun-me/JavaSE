package demo;

public class Person {

    protected String name;
    protected String address;

    public Person() {
        //System.out.println("Person constructor is called...");
    }

    public Person(String name) {
        this.name = name;
       // System.out.println("Person constructor 2 is called...");
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

    public void myMethod(String str){
        System.out.println("my method ("+ str + ")");

    }
}
