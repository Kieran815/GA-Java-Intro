package day04.demoInterfaces;

public class DodgeRam implements Automobile, TowVehicle {

    private int year;

    public DodgeRam(int year) {
        this.year = year;
    }
    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getMake() {
        return "Dodge";
    }

    @Override
    public String getModel() {
        return "Ram";
    }

    @Override
    public void startEngine() {
        System.out.println("Vroom");
    }

    @Override
    public int getCarryingCapacity() {
        return 2000;
    }

    @Override
    public int getTowingCapacity() {
        return 15000;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }
}
