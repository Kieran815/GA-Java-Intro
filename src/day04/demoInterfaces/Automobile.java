package day04.demoInterfaces;

public interface Automobile {
    // inside an interface, the methods are `abstract`
    // `abstract`: need to be implemented by developer
    int getYear();
    String getMake();
    String getModel();
    void startEngine();
}
