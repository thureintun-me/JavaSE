package demo;

public class Main {

    public static void main(String[] args) {

       /* InternationalStudent internationalStudent=
                new InternationalStudent();

        Teacher teacher = new Teacher();*/

        InternationalStudent internationalStudent2 =
                new InternationalStudent("John","1 DreamLand",4.5,"Korea");

        System.out.println("Name : " + internationalStudent2.getName());
        System.out.println("Address : " + internationalStudent2.getAddress());
        System.out.println("Grade : " + internationalStudent2.getGrade());
        System.out.println("Country : " + internationalStudent2.getCountry());
    }
}
