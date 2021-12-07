package day04.demoAbstractClasses;


// if there is an ABSTRACT method, the developer working on it
// needs to write the code for it
public abstract class Equipment {
    // dev must implement
    public abstract void computePower(double time);

    // Concrete Method, dev doesn't need to do anything
    public void showLogo(String logoName) {
        System.out.println(logoName);
    }
}
