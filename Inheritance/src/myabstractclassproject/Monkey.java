package myabstractclassproject;

public class Monkey extends LivingThing {

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("Monkey " + getName() + " walks...");
    }
}
