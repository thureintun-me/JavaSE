package myrewritinginterface;

public class Main {
    public static void main(String[] args) {
       /* Person person1 = new Person(10000,20000,"Thurein","Tun");

        PersonInterface personInterface1 = person1;

        System.out.println("person1.getName() = " + person1.getName() + "," +
                " person1.computeTotalWealth() = " + person1.computeTotalWealth());
        System.out.println("personinterface1.getName() = " + personInterface1.getName() + "," +
                " personinterface1.computeTotalWealth() = " + personInterface1.computeTotalWealth());

        boolean b1 = (person1 == personInterface1);
        System.out.println("Do person1 and personinterface1 point to the same object instance? " + b1);

        PersonInterface personInterface2 = new Person(25000,30000,"San","Shin");
        System.out.println("personinterface2.getName() = " + personInterface2.getName() + "," +
                " personinterface2.computeTotalWealth() = " + personInterface2.computeTotalWealth());*/
        Student student1 = new Student(10000,20000,"Joe","Goldberg","Lincoln High");

            StudentInterface studentInterface1 = student1;
        System.out.println("student1.getName() : " + student1.getName() +
                    "\nstudent1.computeTotalWealth() : " + student1.computeTotalWealth() +
                "\nstudent1.findSchool() : " + student1.findSchool());
        System.out.println();

        System.out.println("studentInterface1.getName() : " + studentInterface1.getName() +
                "\nstudentInterface1.computeTotalWealth() : " + studentInterface1.computeTotalWealth() +
                "\nstudentInterface1.findSchool() : " + studentInterface1.findSchool());

    }
}
