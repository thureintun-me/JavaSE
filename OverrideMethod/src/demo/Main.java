package demo;

public class Main {
    public static void main(String[] args) {

        System.out.println("----Observe overriding method behaviour");

        Person person1 = new Person();
        person1.myMethod("test1");

        Student student1 = new Student();
        student1.myMethod("Test2");
    }
}
