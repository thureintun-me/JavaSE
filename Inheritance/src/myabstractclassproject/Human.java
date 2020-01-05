package myabstractclassproject;

public class Human extends LivingThing {

    public Human(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("Human " + getName() + " walks...");
    }
}
