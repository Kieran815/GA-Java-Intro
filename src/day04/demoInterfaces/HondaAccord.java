package day04.demoInterfaces;

// `implements` replaces `extends` for interfaces
public class HondaAccord implements Automobile {

    private int year;

    public HondaAccord(int year) {
        this.year = year;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getMake() {
        return "Honda";
    }

    @Override
    public String getModel() {
        return "Accord";
    }

    @Override
    public void startEngine() {
        System.out.println("Vroooooommmmmmm");
    }
}
