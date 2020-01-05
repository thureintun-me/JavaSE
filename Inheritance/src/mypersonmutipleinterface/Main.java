package mypersonmutipleinterface;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(10000,20000,"Thurein","Tun");

        PersonInterface personInterface1 = person1;

        System.out.println("person1.getName() = " + person1.getName() + "," +
                " person1.computeTotalWealth() = " + person1.computeTotalWealth()+
                "person1.measureIntelligence() = " + person1.measureIntelligence(person1.getName()));

        System.out.println("personinterface1.getName() = " + personInterface1.getName() + "," +
                " personinterface1.computeTotalWealth() = " + personInterface1.computeTotalWealth());


        boolean b1 = (person1 == personInterface1);
        System.out.println("Do person1 and personinterface1 point to the same object instance? " + b1);

        PersonInterface personInterface2 = new Person(25000,30000,"San","Shin");
        System.out.println("personinterface2.getName() = " + personInterface2.getName() + "," +
                " personinterface2.computeTotalWealth() = " + personInterface2.computeTotalWealth());

        AnotherInterface anotherInterface1 = person1;
        boolean b2 = (personInterface1==anotherInterface1);
        System.out.println("Do personInterface1 and anotherInterface1 point ot the same object instance? " + b2);

    }
}
