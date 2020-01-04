package mypeopleproject;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
            person1.setName("Tom Jones");

         Student student1 = new Student();
            student1.setName("David");
            student1.setSchool("Lincoln High School");

        InternationalStudent internationalStudent1=
                        new InternationalStudent();
            internationalStudent1.setName("Bill Clinton");
            internationalStudent1.setSchool("Lincoln High School");
            internationalStudent1.setCountry("Korea");

        Teacher teacher1 = new Teacher();
            teacher1.setName("Beatles");
            teacher1.setSubject("Music");


        System.out.println("Displaying names of all object instances");
        System.out.println("Person1 : " + person1.getName());
        System.out.println("Student1 : " + student1.getName());
        System.out.println("InternationalStudent1 : " + internationalStudent1.getName());
        System.out.println("Teacher1 : " + teacher1.getName());

        Class class1 = internationalStudent1.getClass();
        System.out.println("Displaying the class hierarchy of international student : " );

        while(class1.getSuperclass() != null){
            String child = class1.getName();
            String parent = class1.getSuperclass().getName();
            System.out.println(" " + child + " is a sub class of " + parent);
            class1 = class1.getSuperclass();
        }


    }
}
