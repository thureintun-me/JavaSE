package myabstractclassproject;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Thu");
        human1.walk();

        LivingThing livingThing = human1;
        livingThing.walk();// the wal()  of human will be called

        LivingThing livingThing2 = new Monkey("MonkeyWrench");
        livingThing2.walk();

        System.out.println("human1.getName : " + human1.getName());
        System.out.println("livingThing1.getName : " + livingThing.getName());

        boolean b1 = (human1==livingThing);
        System.out.println("Do human1 and livingthing1 point to the same object instance? " + b1);


    }
}
