package day04.demoSubclasses;

public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasWhiskers() {
        return true;
    }

    protected String favoriteSnack() {
        return "Mice";
    }

    public int getLives() {
        return 9;
    }

    @Override
    public String toString(){
        return "This is a  Cat";
    }

    // `final` prevents child from overriding a parent method
    public final String sayHello() {
        return "Hello!";
    }
}

