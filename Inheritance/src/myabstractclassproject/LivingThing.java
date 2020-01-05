package myabstractclassproject;

public abstract class LivingThing {
    private String name;

    public LivingThing(String name) {
        this.name = name;
    }

    public void breath(){
        System.out.println("Living thing is breathing...");
    }

    public void eat(){
        System.out.println("Living thing is eating...");
    }

    public abstract void walk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
