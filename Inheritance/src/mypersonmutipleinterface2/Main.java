package mypersonmutipleinterface2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("David",new AddressImpl());

        person.getAddress().setStreetNumber(75);
        person.getAddress().setStreetName("DreamLand");
        person.getAddress().setCountry("Canada");

        System.out.println("Name : " + person.getName());
        System.out.println("StreetNumber : " + person.getAddress().getStreetNumber());
        System.out.println("StreetName : " + person.getAddress().getStreetName());
        System.out.println("Country : "+person.getAddress().getCountry());
    }
}
